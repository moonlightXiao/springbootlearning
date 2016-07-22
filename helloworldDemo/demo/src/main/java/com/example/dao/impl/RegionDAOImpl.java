package com.example.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.dao.RegionDAO;
import com.example.pojo.Region;

@Repository
public class RegionDAOImpl implements RegionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 获取所有的region表中的信息
	 * @return
	 */
	@Override
	public List<Region> getAllRegion(){
		String sql = "SELECT * FROM region";
		return (List<Region>) jdbcTemplate.query(sql, new RowMapper<Region>() {
			
			@Override
			public Region mapRow(ResultSet rs, int rowNum) throws SQLException {
				Region reg = new Region();
				reg.setId(rs.getLong("id"));
				reg.setRegionName(rs.getString("regionname"));
				reg.setRemark(rs.getString("remark"));
				return reg;
			}
		});
	}

}
