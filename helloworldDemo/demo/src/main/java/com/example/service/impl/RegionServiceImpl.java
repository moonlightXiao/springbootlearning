package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RegionDAO;
import com.example.pojo.Region;
import com.example.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService{

	@Autowired
	private RegionDAO regionDAO;
	
	@Override
	public List<Region> queryAll() {
		return regionDAO.getAllRegion();
	}

}
