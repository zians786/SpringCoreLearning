package com.bridgeit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StuddenDao {

	public JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Student student) {
		String query="insert into springdao values('"+student.getName()+"','"+student.getDept()+"','"+student.getId()+"','"+student.getNumber()+"')";
		return jdbcTemplate.update(query);
	}
}
