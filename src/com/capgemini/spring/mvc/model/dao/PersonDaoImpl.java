package com.capgemini.spring.mvc.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.mvc.model.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	JdbcTemplate template;
	@Override
	public void add(Person person) {
		Object args[]= {person.getPersonId(), person.getPersonName()};
		template.update("insert into Person values (?,?)", args);
	}

	@Override
	public List<Person> getAll() {
		return null;
	}

	@Override
	public void update(Person person) {

	}

	@Override
	public void delete(int personId) {

	}

	@Override
	public Person getPerson(int personId) {
		return null;
	}

}
