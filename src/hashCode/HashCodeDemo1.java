package hashCode;

public class HashCodeDemo1 {

	public static void main(String[] args) {
		//Two different objects may have same hashcode (but rarely)
		String s1 = "Sabin";
		System.out.println("HashCode of s1 is "+s1.hashCode());
		
		Integer i = new Integer(79639513);
		System.out.println("HashCode of i is "+i.hashCode());
		
		String s2 = new String("Nepal");
		String s3 = new String("America");
		String s4 = new String("china");
		String s5 = new String("Nepal");
		
		System.out.println("HashCode of s2 is : "+s2.hashCode());
		System.out.println("HashCode of s3 is : "+s3.hashCode());
		System.out.println("HashCode of s4 is : "+s4.hashCode());
		System.out.println("HashCode of s5 is : "+s5.hashCode());

	}

}
