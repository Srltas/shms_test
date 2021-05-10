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
}
