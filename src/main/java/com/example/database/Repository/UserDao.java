package com.example.database.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




@Repository
public class UserDao
{
    @Autowired
private JdbcTemplate template;


public int insertMessage(String id, String message) {
        String sql = "INSERT INTO CLIPBOARD_DB (USER_ID, MESSAGE) VALUES (?, ?)";
        return template.update(sql, id, message);
    }
    public String getTextById(String id) {
       String sql = "SELECT MESSAGE FROM CLIPBOARD_DB WHERE USER_ID = ?";
        
        List<Map<String, Object>> result = template.queryForList(sql, id);

        if (result.isEmpty()) {
            return "Name not found for ID: " + id;
        } else {
            return (String) result.get(0).get("MESSAGE");
        }
    }

}
