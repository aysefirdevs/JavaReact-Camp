
public class StudentManager extends UserManager{
	
	public void completionState(Student student) {
		System.out.println(student.getName()+ " adl� ��rencinin "
				+student.getCourse()+" dersini tamamlama y�zdesi: % "+student.completion);
	}
}
