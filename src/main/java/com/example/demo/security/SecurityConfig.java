package com.example.demo.security;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

//extends WebSecurityConfigurerAdapter

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

//    @Value("${spring.security.secure-key-username}")
//    private  String SECURE_KEY_USERNAME;
//
//    @Value("${spring.security.secure-key-password}")
//    private  String SECURE_KEY_PASSWORD;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//
//        auth.inMemoryAuthentication().
//                withUser("user")
//                .password("{noop}12345")
//                .roles("USER");
//
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        http.csrf().disable();
//
//    }
}
