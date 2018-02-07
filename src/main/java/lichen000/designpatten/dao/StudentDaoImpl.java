package lichen000.designpatten.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class StudentDaoImpl implements StudentDao {
	//列表是当作一个数据库
	private List<Student> students;

	public StudentDaoImpl(){
		students = new ArrayList<>();
		Student student1 = new Student("Robert",0);
		Student student2 = new Student("John",1);
		Student student3 = new Student("Tom",2);
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	//从数据库中检索学生名单
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}
}
