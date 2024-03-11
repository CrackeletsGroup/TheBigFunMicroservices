package com.example.security.domain.service;

import com.example.security.domain.model.entity.User;
import com.example.security.domain.service.communication.AuthenticateRequest;
import com.example.security.domain.service.communication.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    ResponseEntity<?> authentication(AuthenticateRequest request);
    ResponseEntity<?>  register(RegisterRequest request);
    List<User> getAll();
}
