
public class InstructorManager extends UserManager {
	
	public void givenCourse(Instructor instructor) {
		System.out.println(instructor.getName()+" adlý eðitmenin kursu: "+instructor.getGivenCourse());
	}
	
	public void certificates(Instructor instructor) {
		System.out.println(instructor.getName() + " adlý eðitmenin sertifikasý: " 
				+ instructor.getCertificate());
	}
}
