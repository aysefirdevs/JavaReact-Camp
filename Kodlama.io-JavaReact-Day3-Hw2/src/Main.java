
public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "ayse", "ayse@..");
		User user2 = new User(4, "ahmet", "ayse@..");
		User user3 = new User(5, "deren", "ayse@..");

		Instructor instructor1 = new Instructor(2, "engin", "engin@..", "C#-Angular", "C#-Angular certificate");

		Student student1 = new Student(3, "ayse", "aysee@..", "Java-React", 30);

		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.update(user1);

		System.out.println("*********************");

		User[] users = { user1, student1, instructor1 };
		userManager.addMultiple(users);

		System.out.println("*********************");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.givenCourse(instructor1);
		instructorManager.certificates(instructor1);

		System.out.println("*********************");

		StudentManager studentManager = new StudentManager();
		studentManager.update(student1);
		studentManager.completionState(student1);

	}

}
