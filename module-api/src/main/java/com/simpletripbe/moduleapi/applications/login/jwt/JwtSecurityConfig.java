package com.simpletripbe.moduleapi.applications.login.jwt;

import com.simpletripbe.moduleapi.applications.login.security.ExceptionHandlerFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public void configure(HttpSecurity http) {
        // JwtFilter를 통해 Security 로직에 필터 등록
        http.addFilterBefore(
                new JwtFilter(jwtTokenProvider),
                UsernamePasswordAuthenticationFilter.class
        );
        //JwtFilter 이전에 예외를 처리 가능한 필터 등록
        http.addFilterBefore(
                new ExceptionHandlerFilter(),
                JwtFilter.class
        );
    }
}
