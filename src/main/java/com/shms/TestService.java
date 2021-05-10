package com.shms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String sql = "select sysdate()";
	
	public String getDate() {
		return jdbcTemplate.queryForObject(sql, String.class);
	}
}
