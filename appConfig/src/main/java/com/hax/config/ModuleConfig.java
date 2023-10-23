package com.hax.config;

import com.hax.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author A
 */
@Configuration
public class ModuleConfig {
    @Bean
    public User user() {
        return new User();
    }
}