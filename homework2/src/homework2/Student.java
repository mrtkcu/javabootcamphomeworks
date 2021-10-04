package homework2;

public class Student extends User{

	private String nationalIdentity;
	private String studentNo;
	
	public Student(int id, String nationalIdentity, String studentNo) {
		super(id);
		this.nationalIdentity = nationalIdentity;
		this.studentNo = studentNo;
	}
	

	
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	
	
	
}
