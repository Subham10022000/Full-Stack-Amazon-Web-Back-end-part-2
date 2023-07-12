package com.amazonapp.metadata.repository;

import org.springframework.data.repository.CrudRepository;

import com.amazonapp.metadata.entity.MetaDataUser;


public interface UserRepo extends CrudRepository<MetaDataUser, Long > {

	MetaDataUser save(MetaDataUser metaUser);
	MetaDataUser findAllByuniqueId(String uniqueId);

}
