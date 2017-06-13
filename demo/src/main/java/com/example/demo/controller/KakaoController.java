package com.example.demo.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RedisPooler;
import com.example.demo.domain.Keyboard;
import com.example.demo.domain.Message;
import com.example.demo.domain.ResultMessage;
import com.example.demo.domain.UserMessage;

import redis.clients.jedis.Jedis;


	
@RestController
public class KakaoController {

	private static final Logger logger = LoggerFactory.getLogger(KakaoController.class);
	
	@Autowired
	RedisPooler redisPooler;
	
	
	@RequestMapping("/keyboard")
	public Keyboard keyboard(){
		Keyboard keyboard = new Keyboard();
		keyboard.setType("buttons");
		String[] buttons = { "구약", "신약"};
		keyboard.setButtons(buttons);
		
		return keyboard;
	}
	
	@RequestMapping("/message")
	public ResultMessage message(@RequestBody UserMessage userMessage){
		
		ResultMessage rm = new ResultMessage();
		Message rtnMessage = new Message();
		//신약을 선택하셨습니다.
		if("text".equals(userMessage.getType())){
			rtnMessage.setText(userMessage.getContent() + "을 선택하셨습니다");
			if("신약".equals(userMessage.getContent())){
				Keyboard keyboard = new Keyboard();
				keyboard.setType("buttons");
				String[] sin = {"마태복음", "마가복음", "누가복음"};
				keyboard.setButtons(sin);
				rm.setKeyboard(keyboard);
			}
			if("구약".equals(userMessage.getContent())){
				Keyboard keyboard = new Keyboard();
				keyboard.setType("buttons");
				String[] koo = {"창세기", "출애굽기", "레위기"};
				keyboard.setButtons(koo);
				rm.setKeyboard(keyboard);
			}
			if("창세기".equals(userMessage.getContent())){
				Message message = new Message();
				Document doc=null;;
				try {
					doc = Jsoup.connect("http://www.biblestudytools.com/kjv/genesis/1.html").get();
						
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Elements word = doc.select("#v-1");
				logger.info("word.text " + word.text());
				rtnMessage.setText(word.text());
			}
			if("출애굽기".equals(userMessage.getContent())){
			}			
			if("레위기".equals(userMessage.getContent())){
			}			
			
			
		}

		/*
		try (Jedis jedis = redisPooler.getJedisPool() ){ //try-with-resourc
			jedis.set(userMessage.getUser_key(), userMessage.getContent());
			String value = jedis.get(userMessage.getUser_key());		
			LOGGER.info(userMessage.getUser_key() + " (value from redis) " + value);
		}
		*/
		
		rm.setMessage(rtnMessage);
		return rm;
	}	
}
