package com.example.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.springframework.data.annotation.Id;

/**
 * 区域实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="region",catalog="jskjswms")//是对应的数据库schema，通常可以删除
public class Region implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Column(name="regionname", length=30)
	private String regionName;
	
	@Column(name="remark", length=200)
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
