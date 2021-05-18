
public class Student extends User{
	
	String course;
	double completion;
	

	public Student(int id, String name, String email,String course,double completion ) {
		super(id,name,email);
		this.course=course;
		this.completion=completion;
	}

	public String getCourse() {
		return course;
	}

	public void setStudentNo(String course) {
		this.course = course;
	}

	public double getCompletion() {
		return completion;
	}

	public void setCompletion(double completion) {
		this.completion = completion;
	}
	
}
