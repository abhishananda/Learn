package abhi.ComparatorVsComparable;

import java.util.*;

public class ComparableTest {

	public static void main(String[] args) {
		List<Student> student= new ArrayList<Student>();
		student.add(new Student("Abhishek",27,1));
		student.add(new Student("Rahul",25,2));
		student.add(new Student("Shweta",26,3));
		student.add(new Student("Ashish",28,4));
		student.add(new Student("Honey",24,5));
		
		Collections.sort(student);
		
		for(Student st:student) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}


}
