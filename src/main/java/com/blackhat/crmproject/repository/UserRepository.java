package com.blackhat.crmproject.repository;

import java.util.List;

import com.blackhat.crmproject.dto.UserDto;
import com.blackhat.crmproject.model.User;

public interface UserRepository {
	public List<User> findAll();
	public User findByEmail(String email);
	public int deleteById(int id);
	public int add(UserDto userDto);
	public int update(UserDto userDto);
	
}
