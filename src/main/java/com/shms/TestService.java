package com.shms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String sql = "select sysdate()";
	private String wearLogSelectAll = "select * from WEAR_LOG";
	private String workerSelectAll = "select * from WORKER";
	
	public String getDate() {
		return jdbcTemplate.queryForObject(sql, String.class);
	}
	
	public List<WearLog> selectAll() {
		List<WearLog> result = jdbcTemplate.query(wearLogSelectAll, new RowMapper<WearLog>() {
			@Override
			public WearLog mapRow(ResultSet rs, int rowNum) throws SQLException {
				WearLog wearLog = new WearLog(
						rs.getString("CODE"),
						rs.getString("SAFE_HAT_CODE"),
						rs.getString("GATEWAY_CODE"),
						rs.getString("EMP_NUMBER"),
						rs.getTimestamp("TIME"),
						rs.getString("IS_WEAR").charAt(0),
						rs.getDouble("LATITUDE"),
						rs.getDouble("LONGITUDE"));
				
				return wearLog;
			}
		});
		
		return result;
	}
	
	public List<Worker> workerAll() {
		List<Worker> result = jdbcTemplate.query(workerSelectAll, new RowMapper<Worker>() {
			@Override
			public Worker mapRow(ResultSet rs, int rowNum) throws SQLException {
				Worker worker = new Worker(
						rs.getString("EMP_NUMBER"),
						rs.getString("NAME"),
						rs.getString("CARD_NUMBER"),
						rs.getString("PHONE_NUMBER"),
						rs.getString("IS_DELETE").charAt(0));
				
				return worker;
			}
		});
		
		return result;
	}
}
