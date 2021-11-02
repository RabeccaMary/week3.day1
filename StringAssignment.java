package week3.day1;

public class StringAssignment {

	public static void main(String[] args) {
		String text = "Java Exercise";
		System.out.println(text.indexOf('s'));
		String s1 = "I am Learning Java";
		String s2 = "I am learning java";
		if (s1 == s2)
			System.out.println("same");
		else
			System.out.println("Not same");
		if (s1.equals(s2))
			System.out.println("same");
		else
			System.out.println("Not same");
		if (s1.equalsIgnoreCase(s2))
			System.out.println("same");
		else
			System.out.println("Not same");
		String str1 = new String("Kutty");
		String str2 = new String("Kutty");
		if (str1.equals(str2))
			System.out.println("same");
		else
			System.out.println("Not same");
		String a = "I am working with Java 8";

		System.out.println("Replace string : " + a.replaceAll("8", "11"));

	}

}
