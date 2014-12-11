package igor.cert.dao;

public class DaoTest {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		for(Student student: studentDao.getAllStudents()){
			System.out.printf("Student: [RollNo : %d, Name : %s]\n", student.getRollNo(), student.getName());
		}
		
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		student = studentDao.getStudent(0);
		System.out.printf("Student: [RollNr: %d, Name: %s]", student.getRollNo(), student.getName());
	}

}
