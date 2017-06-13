package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

// @Bean   @Component 

@Component
public class RedisPooler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RedisPooler.class);

	private JedisPool jedisPool;
	
	public RedisPooler(){
		if(jedisPool == null){
			LOGGER.info("redisPooler created!");
			jedisPool = new JedisPool("localhost", 6379);
		}
	}
	
	public Jedis getJedisPool(){
		return jedisPool.getResource();
	}

}
