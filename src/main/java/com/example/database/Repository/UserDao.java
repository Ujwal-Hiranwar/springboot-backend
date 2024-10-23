package com.example.database.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.database.Entity.Users;


@Repository
public class UserDao
{
    @Autowired
private JdbcTemplate template;

 public List<Users> getAllUsers() {
        String sql = "SELECT * FROM users";
        return template.query(sql, (rs, rowNum) -> 
            new Users(rs.getInt("USER_ID"), rs.getString("USERNAME"))
        );
    }


}
