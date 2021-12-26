package com.wayne.jwt.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		if ("admin@admin".equals(email)) {
//			return new User("admin@admin", "$2a$12$quFSXmBcTjWeieushcUxluke8wvFn8SjQQQDhFxNscszhAKu7CPRu", new ArrayList<>());
			return new User("admin@admin", "$2a$12$quFSXmBcTjWeieushcUxluke8wvFn8SjQQQDhFxNscszhAKu7CPRu", true, true, true, true, null);
		} else {
			throw new UsernameNotFoundException("User not found with username: " + email);
		}
	}

}
