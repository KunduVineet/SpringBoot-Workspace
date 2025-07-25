package in.vk.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vk.main.jwt.AuthEntryPointJwt;
import in.vk.main.jwt.JwtUtils;

@RestController
@RequestMapping("/api")
public class GreetingsController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	 
	@Autowired
	private JwtUtils jwtUtils;

    private final AuthEntryPointJwt authEntryPointJwt;

    GreetingsController(AuthEntryPointJwt authEntryPointJwt) {
        this.authEntryPointJwt = authEntryPointJwt;
    }
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String userEndpoint() {
		return "User can acess this";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String adminEndpoint() {
		return "Admin can acess this";
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
	    Authentication authentication;
	    
	    try {
	        authentication = authenticationManager.authenticate(
	            new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
	        );
	    } catch (AuthenticationException e) {
	        Map<String, Object> map = new HashMap<>();
	        map.put("Message", "Bad credentials");
	        map.put("status", false);
	        return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
	    }
	    
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    
	    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
	    
	    String jwtToken = jwtUtils.generateTokenFromUsername(userDetails);
	    
	    List<String> roles = userDetails.getAuthorities().stream()
	            .map(item -> item.getAuthority())
	            .collect(Collectors.toList());
	    
	    // Ensure correct assignment
	    LoginResponse response = new LoginResponse(jwtToken, userDetails.getUsername(), roles);
	    
	    return ResponseEntity.ok(response);
	}
	
	@GetMapping("/profile")
	public ResponseEntity<?> getUserProfile(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		
		Map<String, Object> profile = new HashMap<>();
		profile.put("username", userDetails.getUsername());
		profile.put("roles", userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList())
		);
		profile.put("message", "This is user specific content from backend");

		return ResponseEntity.ok(profile);
		
	}


}