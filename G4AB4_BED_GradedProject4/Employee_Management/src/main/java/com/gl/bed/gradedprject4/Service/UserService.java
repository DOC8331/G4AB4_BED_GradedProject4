package com.gl.bed.gradedprject4.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.bed.gradedprject4.Model.User;
import com.gl.bed.gradedprject4.Repository.UserRepository;
import com.gl.bed.gradedprject4.Security.MyUserDetails;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
    private UserRepository userRepository;

	@Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
         
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new MyUserDetails(user);
    }
}
