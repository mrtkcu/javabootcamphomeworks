package homework2;

public class Main {

	public static void main(String[] args) {
		
		UserManager usermanager = new UserManager();
		
		Student student = new Student(9,"21532104715","201453369");
		Instructor instructor = new Instructor(1,"Oblomov","password123");
		
		
		StudentManager studentmanager = new StudentManager();
		InstructorManager instructormanager = new InstructorManager();
		
		
		usermanager.add(student);
		usermanager.add(instructor);
		
		System.out.println();
		
		studentmanager.printStudentInfo(student);
		
		System.out.println();
		
		instructormanager.printInstructorInfo(instructor);
		
	}

}
