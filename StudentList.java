package collections;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	void getStudentList() {

		List<Student> Student_list = new ArrayList<>();

		Student a = new Student();
		a.name = "Ravi";
		a.id = 123;
		a.email = "mravi.m123@gmail.com";
		a.phn = 996610689;
		a.add = new Address();
		a.add.hoNo = "7-40/2";
		a.add.Street = "ayodya colony";
		a.add.city = "karimnagar";
		Student_list.add(a);

		Student a1 = new Student();
		a1.name = "Kiran";
		a1.id = 1234;
		a1.email = "ravi.kiran@gmail.com";
		a1.phn = 996582454;
		a1.add = new Address();
		a1.add.hoNo = "12-11/1";
		a1.add.Street = "krishna colony";
		a1.add.city = "Peddapalli";

		Student_list.add(a1);

		Student a2 = new Student();
		a2.name = "vamsi";
		a2.id = 0777;
		a2.email = "mohan.vansi@gmail.com";
		a2.phn = 998877665;
		a2.add = new Address();
		a2.add.hoNo = "1-211/1";
		a2.add.Street = "krishna colony";
		a2.add.city = "Rajamandri";
		
		Student_list.add(a2);
		
		for (Student s1 : Student_list) {
			System.out.println(s1.name + "\t" + s1.id + "\t" + s1.email + "\t" + s1.add.hoNo + "\t" + s1.add.Street
					+ "\t" + s1.add.city
					+ "\n---------------------------------------------------------------------------");
		}
		//return Student_list;

	}
}
