
public class StudentManager extends UserManager{
	
	public void completionState(Student student) {
		System.out.println(student.getName()+ " adlý öðrencinin "
				+student.getCourse()+" dersini tamamlama yüzdesi: % "+student.completion);
	}
}
