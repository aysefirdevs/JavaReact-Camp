
public class InstructorManager extends UserManager {
	
	public void givenCourse(Instructor instructor) {
		System.out.println(instructor.getName()+" adl� e�itmenin kursu: "+instructor.getGivenCourse());
	}
	
	public void certificates(Instructor instructor) {
		System.out.println(instructor.getName() + " adl� e�itmenin sertifikas�: " 
				+ instructor.getCertificate());
	}
}
