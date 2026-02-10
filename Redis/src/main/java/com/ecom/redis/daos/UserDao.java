package com.ecom.redis.daos;

import com.ecom.redis.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@RequiredArgsConstructor
public class UserDao {

    private final RedisTemplate<String, User> redisTemplate;

    private static final String USER_KEY = "KEY";

    //save User
    public User save(User user) {
        redisTemplate.opsForHash().put(USER_KEY, user.getUserId(), user);
        return user;
    }

    //get User
    public User get(String userid) {
        return (User) redisTemplate.opsForHash().get(USER_KEY, userid);
    }

    //findAll
    public Map<Object, Object> findAll() {
        return redisTemplate.opsForHash().entries(USER_KEY);
    }

    public void delete(String userid) {
        redisTemplate.opsForHash().delete(USER_KEY, userid);
    }
}
