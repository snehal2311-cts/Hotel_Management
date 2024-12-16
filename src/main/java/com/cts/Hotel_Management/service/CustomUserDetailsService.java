package com.cts.Hotel_Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cts.Hotel_Management.exception.OurException;
import com.cts.Hotel_Management.repo.UserRepo;


@Service
public class CustomUserDetailsService implements UserDetailsService{

	
	@Autowired
	private UserRepo userRepo;
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(username).orElseThrow(()-> new OurException("username/email is not found"));
	}
	
	
}
