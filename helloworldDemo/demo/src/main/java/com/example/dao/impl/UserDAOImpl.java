package com.example.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.example.dao.UserDAO;
import com.example.pojo.User;

@Repository //标注了 @Repository 的类都将被注册为 Spring Bean
public class UserDAOImpl implements UserDAO{

	String aa;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public String getById(Long userId) {
		String sql = "select * from user where id = " + userId;
		System.out.println("------------" + sql);
		//String set =  jdbcTemplate.query(sql, java.lang.String.class);\
		SqlRowSet set= jdbcTemplate.queryForRowSet(sql);
		String username = set.getString("id");
		return username;
	}
	

	
	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM user";
		return (List<User>) jdbcTemplate.query(sql, new RowMapper<User>() {
			
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setId(rs.getLong("id"));
				u.setPassword(rs.getString("password"));
				return u;
			}
		});
	}
	
}
