package com.algaworks.multidb.config.properties;

import javax.validation.constraints.NotBlank;

public class Datasource {
	
	@NotBlank(message = "O campo jdbcUrl não pode ser vazio.")
	private String jdbcUrl;
	
	@NotBlank(message = "O campo username não pode ser vazio.")
	private String username;

	@NotBlank(message = "O campo password não pode ser vazio.")
	private String password;
	
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
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
	
	
}
