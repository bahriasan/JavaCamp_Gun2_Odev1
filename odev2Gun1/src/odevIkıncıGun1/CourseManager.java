package odevIk�nc�Gun1;

public class CourseManager {
	public void goToCourse(Course course) {
		System.out.println(course.id+" . "+"Kursa Gidildi");
	}
	
	public void startLesson(Course course,String ders) {
		System.out.println(course.title +" "+ ders + " Ba�lad�");
	}
	
	
}
