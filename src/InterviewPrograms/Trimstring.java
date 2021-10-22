package InterviewPrograms;

public class Trimstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "   Jotsna Waghmare  ";
		
		//trim() method only removes the spaced at the start and end of the string
		String s2 = s1.trim();
		System.out.println(s2);
		
		//replaceAll() method removed spaces between, start and end of the string.
		String s3 = s1.replaceAll("\\s", "");
		System.out.println(s3);
	}

}
