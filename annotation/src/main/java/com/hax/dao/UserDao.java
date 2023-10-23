package com.hax.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author A
 */
@Repository
public class UserDao {
    @Value("吴灏")
    public String name;
}