package com.cts.project.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.cts.project.pojos.User;

public interface UserRepository extends CrudRepository<User,String> {

	User findByUsernameAndPassword(String username,String password);

	
}
