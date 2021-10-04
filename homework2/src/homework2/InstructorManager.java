package homework2;

public class InstructorManager extends UserManager{
	
	public void printInstructorInfo(Instructor instructor) {
		System.out.println("Instructor id is " + instructor.getId());
		System.out.println("Instructor username: " + instructor.getUserName());
		System.out.println("Instuctor password: " + instructor.getPassword());
	}
	
}
