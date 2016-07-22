package com.example.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="username",length=20)
	private String username;
	
	@Column(name="password",length=32)//密码要进行MD5加密
	private String password;
	
	@Column(name="type",length = 20)
	private String type;//用户类型
	
	@Column(name="lastloginip",length=20)
	private String lastLoginIp;
	
	@Column(name="lastusetime")
	private Timestamp lastUseTime;
	
	@Column(name="remark",length=200)
	private String remark;
	
	@Column(name="token")
	private String token;//令牌
	
	@Column(name="tokenlastupdatetime")
	private Timestamp tokenLastUpdatetime;//令牌最后更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Timestamp getLastUseTime() {
		return lastUseTime;
	}

	public void setLastUseTime(Timestamp lastUseTime) {
		this.lastUseTime = lastUseTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Timestamp getTokenLastUpdatetime() {
		return tokenLastUpdatetime;
	}

	public void setTokenLastUpdatetime(Timestamp tokenLastUpdatetime) {
		this.tokenLastUpdatetime = tokenLastUpdatetime;
	}
	
	
}
