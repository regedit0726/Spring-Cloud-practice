//package com.zzh.practice.master.service.impl;
//
//import com.zzh.practice.master.service.RedisService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * description： <br>
// * createTime: 2018/1/59:26 <br>
// *
// * @author zzh
// */
//@Service
//public class RedisServiceImpl implements RedisService {
//
//    private RedisTemplate redisTemplate;
//
//    @Autowired(required = false)
//    public void setRedisTemplate(RedisTemplate redisTemplate) {
//        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//        GenericJackson2JsonRedisSerializer jsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
//        redisTemplate.setKeySerializer(stringRedisSerializer);
//        redisTemplate.setValueSerializer(jsonRedisSerializer);
//        redisTemplate.setHashKeySerializer(stringRedisSerializer);
//        redisTemplate.setHashValueSerializer(jsonRedisSerializer);
//        this.redisTemplate = redisTemplate;
//    }
//
//
//    @Override
//    public void setString(String key, String value) {
//        ValueOperations<String, String> ops = redisTemplate.opsForValue();
//        ops.set(key, value);
//    }
//
//
//    @Override
//    public void setString(String key, String value, long seconds) {
//        ValueOperations<String, String> ops = redisTemplate.opsForValue();
//        ops.set(key, value, seconds, TimeUnit.SECONDS);
//    }
//
//
//    @Override
//    public String getString(String key) {
//        ValueOperations<String, String> ops = redisTemplate.opsForValue();
//        return ops.get(key);
//    }
//
//
//    @Override
//    public void setObject(String key, Object value) {
//        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
//        ops.set(key, value);
//    }
//
//
//    @Override
//    public void setObject(String key, Object value, long seconds) {
//        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
//        ops.set(key, value, seconds, TimeUnit.SECONDS);
//    }
//
//
//    @Override
//    public <T> T getObject(String key) {
//        ValueOperations<String, T> ops = redisTemplate.opsForValue();
//        return ops.get(key);
//    }
//
//    @Override
//    public void deleteObject(Object key) {
//        redisTemplate.delete(key);
//    }
//
//    @Override
//    public void setHash(String key, Object hashKey, Object hashValue) {
//        HashOperations<String, Object, Object> ops = redisTemplate.opsForHash();
//        ops.put(key, hashKey, hashValue);
//    }
//
//    @Override
//    public long deleteHash(String key, Object... hashKey) {
//        HashOperations<String, Object, Object> ops = redisTemplate.opsForHash();
//        return ops.delete(key, hashKey);
//    }
//
//
//    @Override
//    public <K, V> V getHashValue(String key, K hashKey) {
//        HashOperations<String, K, V> hashOperations = redisTemplate.opsForHash();
//        return hashOperations.get(key, hashKey);
//    }
//
//    @Override
//    public long increment(String key, long incValue) {
//        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
//        return ops.increment(key, incValue);
//    }
//
//    @Override
//    public long increment(String key) {
//        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
//        return ops.increment(key, 1);
//    }
//}
