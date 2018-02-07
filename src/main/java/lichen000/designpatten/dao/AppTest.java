package lichen000.designpatten.dao;

public class AppTest {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDaoImpl();

		//输出所有的学生
		for (Student studentx : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + studentx.getRollNo() + ", Name : " + studentx.getName() + " ]");
		}
		System.out.println();

		//获取学生
		Student student2 = studentDao.getStudent(2);
		System.out.println("Student: [RollNo : " + student2.getRollNo()+", Name : " + student2.getName() + " ]");
		System.out.println();

		Student studentFirst = studentDao.getAllStudents().get(1);
		studentFirst.setName("Michael");
		studentDao.updateStudent(studentFirst);
		System.out.println("Student: [RollNo : " + studentFirst.getRollNo()+", Name : " + studentFirst.getName() + " ]");
		System.out.println();

		studentDao.deleteStudent(student2);

		//输出所有的学生
		for (Student studentx : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + studentx.getRollNo() + ", Name : " + studentx.getName() + " ]");
		}
		System.out.println();

	}

}
