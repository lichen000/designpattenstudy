package lichen000.designpatten.dao;

import java.util.List;

/**
 * Created by chen.li200 on 2018-02-07
 */
public interface StudentDao {
	List<Student> getAllStudents();
	Student getStudent(int rollNo);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
