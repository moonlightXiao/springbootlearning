package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Region;
import com.example.service.RegionService;

@RestController
@RequestMapping("/region")
public class RegionController {
	
//	private static final Logger logger = LoggerFactory.getLogger(RegionController.class);
	
	 @Autowired
	 private RegionService regionService;
	 
	 @RequestMapping("/allRegions")
	 public List<Region> getAllRegions(){
//		 logger.info("从数据库中读取地区表的全部信息");
		 return regionService.getAllRegion();
	 }
}
