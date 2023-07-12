package com.amazonapp.metadata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonapp.metadata.entity.MetaDataUser;
import com.amazonapp.metadata.service.UserService;

@RestController
@RequestMapping("/amazon/users")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@PostMapping("saveUserDetails")	
	public MetaDataUser savaMetaDataUser(@RequestBody MetaDataUser metaDataUser) {
		MetaDataUser metaUser= userService.saveMetaDataUser(metaDataUser);
		return metaUser;
	}
	@GetMapping("getUserDetails/{userId}")
	public MetaDataUser getUserDetails(@PathVariable String userId) {
		 MetaDataUser metaUser= userService.getsUserDetailsFromDB(userId);
		return metaUser;
		
	}

}
