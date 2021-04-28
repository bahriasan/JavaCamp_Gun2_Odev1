package odevIk�nc�Gun1;

public class Main {
	
	public static void main(String[] args) {
		
		//COURSES
		String name1=" (C# + ANGULAR)";
		String name2=" (JAVA + REACT)";
	
		String title1="Yaz�l�m Geli�tirici Yeti�tirme Kamp�";
		String title2="Programlamaya Giri� i�in Temel Kurs";
	
		String detail1="2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, dok�man ve duyurular�";
		String detail2="PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temek programlama mant���";
		
		String[] ders= {"Ders1","Ders2","Ders3","Ders4","Ders5"};
		
		//Taking Reference
		Course course1 = new Course(1,title1+name1,detail1,ders);
		Course course2 = new Course(2,title1+name2,detail1,ders);
		Course course3 = new Course(3,title2,detail2,ders);
		
		//Array
		Course[] courses = {course1,course2,course3};
		
		//ForEach and Printing
		for(Course course: courses) {
			System.out.println(course.id+"\n"+course.title+"\n"+course.detail);
			for(String dersler:course.ders) {
				System.out.println(dersler);
			}
		}
		
		//NAVBAR
		NavBar navBar1= new NavBar(1,"Kurslar�m");
		NavBar navBar2= new NavBar(2,"T�m Kurslar");
		NavBar navBar3= new NavBar(3,"Kampa Haz�rl�k");
		NavBar navBar4 = new NavBar(4,"S�k Sorulan Sorular");
		
		NavBar[] navBars = {navBar1,navBar2,navBar3,navBar4};
		
		
		for(NavBar navBar:navBars) {
			System.out.println(navBar.id+"\n"+navBar.title);
		}
		
		
		//GOTOCOURSE
		CourseManager courseManager = new CourseManager();
		courseManager.goToCourse(course1);
		courseManager.goToCourse(course2);
		courseManager.goToCourse(course3);
		
		//STARTLESSON
		courseManager.startLesson(course1,course1.ders[0]);
		courseManager.startLesson(course2,course1.ders[1]);
		courseManager.startLesson(course3,course1.ders[2]);
	
		
		
		
		
				
		
		
	}
	
		
}
