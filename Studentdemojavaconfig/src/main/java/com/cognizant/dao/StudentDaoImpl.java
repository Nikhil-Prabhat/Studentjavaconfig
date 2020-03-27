package com.cognizant.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.model.Student;

@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public int insert(Student student) {
		String sql = "insert into login values(?,?)";
		int insert = getJdbctemplate().update(sql, student.getId(), student.getName());
		return insert;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

}
