package in.vk.main.jwt;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthTokenFilter extends OncePerRequestFilter{
	
	@Autowired
	private JwtUtils jwtUtils;

	@Autowired
	private UserDetailsService userDetailsService;
	
	private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		logger.debug("AuthTokenFilter called for URI: {}", request.getRequestURI());
		try {
		    String jwt = parseJwt(request);
		    if (jwt != null && !jwt.trim().isEmpty() && jwtUtils.validateJwtToken(jwt)) {
		        String username = jwtUtils.getUserNameFromJwtToken(jwt);
		        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		        UsernamePasswordAuthenticationToken authentication =
		                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
		        logger.debug("Roles from JWT: {}", userDetails.getAuthorities());
		        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
		        SecurityContextHolder.getContext().setAuthentication(authentication);
		    } else {
		        logger.warn("JWT token is invalid or missing");
		    }
		} catch (Exception e) {
		    logger.error("Cannot set user authentication: {}", e.getMessage(), e);
		}
		
		filterChain.doFilter(request, response);
	}
	
	private String parseJwt(HttpServletRequest request) {
	    String header = request.getHeader("Authorization");
	    logger.debug("Authorization header: {}", header);
	    String jwt = jwtUtils.getJwtFromHeader(request);
	    logger.debug("Extracted JWT token: {}", jwt);
	    if (jwt == null || jwt.trim().isEmpty()) {
	        logger.warn("JWT token is null or empty");
	    }
	    return jwt;
	}

}