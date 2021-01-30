package com.spring.beans;

public class DataSource {

	String url;
	int port;
	String user;
	String password;
	String dbname;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	@Override
	public String toString() {
		return "DataSource [url=" + url + ", port=" + port + ", user=" + user + ", password=" + password + ", dbname="
				+ dbname + "]";
	}
	
	
}
