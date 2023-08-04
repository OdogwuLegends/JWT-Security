package com.alibou.security.service;

import com.alibou.security.dto.request.AuthenticationRequest;
import com.alibou.security.dto.request.RegistrationRequest;
import com.alibou.security.dto.response.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    public AuthenticationResponse register(RegistrationRequest request) {
        
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
    }
}
