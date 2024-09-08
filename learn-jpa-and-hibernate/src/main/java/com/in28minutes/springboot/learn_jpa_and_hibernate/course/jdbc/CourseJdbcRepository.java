package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;


@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY =
			"""
				insert into COURSE (name, author)
				values (?, ?);
			""";

	public void insert(Course course) {
		springJdbcTemplate.update
					(INSERT_QUERY, course.getName(), course.getAuthor());
	}
}
