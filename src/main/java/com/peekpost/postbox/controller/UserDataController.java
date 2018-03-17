package com.peekpost.postbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;
import pcom.peekpost.postbox.models.User;
import pcom.peekpost.postbox.models.UserDao;

@RestController
public class UserDataController {
	
	@Autowired
	private UserDao userDao;

	//Search by phone number - to be changed when design is finalized
	@RequestMapping("/search")
	public ResponseEntity phoneSearch(String phone){
		
		String name;
		
		try {
			User user = userDao.findByPhone(phone);
			return new ResponseEntity(user, HttpStatus.OK);
			}
		catch(Exception e){
			// log4j will be implemented for error handling
			return new ResponseEntity("User not found for the phone number, please check the phone number" +phone,HttpStatus.NOT_FOUND);
		}

	}

}
