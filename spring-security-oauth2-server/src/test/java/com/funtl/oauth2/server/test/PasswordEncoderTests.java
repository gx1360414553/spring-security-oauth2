package com.funtl.oauth2.server.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年08月29日 11:12:00
 */
public class PasswordEncoderTests {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
