
public class Instructor extends User {

	private String givenCourse;
	private String certificate;
	
	public Instructor(int id, String name, String email,String givenCourse, String certificate) {
		super(id,name,email);
		this.givenCourse = givenCourse;
		this.certificate = certificate;
	}

	public String getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}
