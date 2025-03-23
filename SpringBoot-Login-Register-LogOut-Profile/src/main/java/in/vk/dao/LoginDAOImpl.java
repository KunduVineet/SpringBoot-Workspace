package in.vk.dao;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.vk.beans.Student;
import in.vk.mapper.StudentMapper;

@Repository
public class LoginDAOImpl implements LoginDAO {

    private static final Logger logger = LoggerFactory.getLogger(LoginDAOImpl.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loginDao(String email, String password) {
        String mysql_query = "SELECT * FROM REGISTER WHERE email = ? AND password = ?";
        List<Student> students_list = Collections.emptyList();

        try {
            students_list = jdbcTemplate.query(mysql_query, new StudentMapper(), email, password);
        } catch (Exception e) {
            logger.error("Error executing login query for email: {}, error: {}", email, e.getMessage());
        }

        return students_list;
    }
}