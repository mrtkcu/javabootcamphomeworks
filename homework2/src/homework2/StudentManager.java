package homework2;

public class StudentManager extends UserManager{

	public void printStudentInfo(Student student) {
		System.out.println("Student id is " + student.getId());
		System.out.println("Student national identity number is " + student.getNationalIdentity());
		System.out.println("Student number is " + student.getStudentNo());
	}
	
}

