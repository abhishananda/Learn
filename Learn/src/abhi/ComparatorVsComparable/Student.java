package abhi.ComparatorVsComparable;

public class Student implements Comparable<Student>{
	
	String name;
	int age;
	int rollno;
	
	public Student(String name, int age, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
	
	public int compareTo(Student st) {
		if(rollno==st.rollno)
			return 0;
		else if(rollno>st.rollno)
			return 1;
		else
			return -1;
		
	}
}
