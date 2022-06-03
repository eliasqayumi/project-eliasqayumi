//package com.example.meyok.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import static com.example.meyok.security.ApplicationUserRole.STUDENT;
//
////@Configuration
////@EnableWebSecurity
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ApplicationSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    private PasswordEncoder passwordEncoder;
//
//    public ApplicationSecurityConfiguration(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf()
//                .disable()
//                .authorizeHttpRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//    }
//
//    @Override
//    @Bean
//    protected UserDetailsService userDetailsService() {
//        UserDetails elias= User.
//                builder()
//                .username("elias")
//                .password(passwordEncoder.encode("elias"))
//                .authorities(STUDENT.getGrantedAuthority())
////                .roles("ROLE_STUDENT")
//                .build();
//        return new InMemoryUserDetailsManager(
//            elias
//        );
//    }
//}
