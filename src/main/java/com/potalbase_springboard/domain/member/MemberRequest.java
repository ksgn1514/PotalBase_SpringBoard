package com.potalbase_springboard.domain.member;

import java.time.LocalDate;

import org.apache.groovy.parser.antlr4.util.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRequest {
    
    private Long id;      
    private String loginId;
    private String password;
    private String name;
    private Gender gender;
    private LocalDate birthday;

    public void encodingPassword(PasswordEncoder passwordEncoder){
        if ( StringUtils.isEmpty(password)){
            return;
        }
        password = passwordEncoder.encode(password);
    }
}
