package com.amazonapp.metadata.service;

import org.springframework.stereotype.Service;

import com.amazonapp.metadata.entity.MetaDataUser;
import com.amazonapp.metadata.repository.UserRepo;

@Service
public class UserService {
	
	private final UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo=userRepo;
	}
	
	//submit data to database
	public MetaDataUser saveMetaDataUser(MetaDataUser metaDataUser) {
		return userRepo.save(metaDataUser);
	}
	
	//retrieve data the data from the database
	public MetaDataUser getsUserDetailsFromDB(String userId) {
		return userRepo.findAllByuniqueId(userId);
	}
}
