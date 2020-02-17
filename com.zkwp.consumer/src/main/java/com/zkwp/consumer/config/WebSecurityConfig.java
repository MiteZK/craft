package com.zkwp.consumer.config;

import com.zkwp.consumer.service.SpringDataUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Administrator
 * @version 1.0
 **/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // 设置默认的加密方式
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public SpringDataUserDetailsService userDetailsService() {
        return new SpringDataUserDetailsService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 使用自定义认证与授权
        auth.userDetailsService(userDetailsService());
    }

    @Override
    protected  void configure(HttpSecurity http) throws  Exception{
        http.authorizeRequests()
            .antMatchers("/resource/**","/craft/system/user/index","/login","/**").permitAll()
            .antMatchers("/admin/**")
            .hasRole("ADMIN")
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic()
            .and()
            .csrf()
            .disable();
    }
}
