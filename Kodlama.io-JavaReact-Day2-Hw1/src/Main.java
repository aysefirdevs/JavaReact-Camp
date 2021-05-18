
public class Main {

	public static void main(String[] args) {
		
			Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý", "C# + Angular", "Engin Demirog",
					"ücretsiz");
			Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý", "Java + React", "Engin Demirog",
					"ücretsiz");
			Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Python, Java, C#", "Engin Demirog",
					"ücretsiz");

			Course[] courses = { 
					course1, 
					course2, 
					course3 
			};
			
			for (Course course : courses) {
				System.out.println(course.name);
			}
			
			System.out.println("*************");
			
			Author author1 = new Author(1,"Engin Demirog");
			
			Author[] authors = {
				author1	
			};
			
			for (Author author : authors) {
				System.out.println(author.author);
			}
			
			System.out.println("***********");
			
			CourseManager courseManager = new CourseManager();
			courseManager.detailOfCourse(course1);
			courseManager.participationToProgram(course1);
			
			courseManager.detailOfCourse(course2);
			courseManager.participationToProgram(course2);
		}

}


