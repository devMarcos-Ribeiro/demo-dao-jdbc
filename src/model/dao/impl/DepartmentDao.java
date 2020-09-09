package model.dao.impl;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	Department findById(Integer id);

	List<Department> findAll();

	void insert(Department obj);

	void update(Department obj);

	void deleteById(Integer id);

}
