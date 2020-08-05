package hashCode;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("sabin");
		Student s2 = new Student("sabin");
		
		System.out.println(s1.equals(s2));
		
		System.out.println("HashCode of s1 is "+s1.hashCode());
		System.out.println("HashCode of s1 is "+s1.hashCode());
		System.out.println("HashCode of s1 is "+s1.hashCode());
		System.out.println("HashCode of s2 is "+s2.hashCode());

	}

}
