package com.example.demo.controller;

import com.example.demo.dto.request.SignUpRequest;
import com.example.demo.dto.request.SigninRequest;
import com.example.demo.dto.response.JwtAuthenticationResponse;
import com.example.demo.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> create(@RequestBody SigninRequest signinRequest) {
        return ResponseEntity.ok(authService.signin(signinRequest));
    }
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authService.signup(signUpRequest));
    }

}
