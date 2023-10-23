package com.hax.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author A
 */
@Component
public class User {
    @Value("吴灏")
    public String name;
}