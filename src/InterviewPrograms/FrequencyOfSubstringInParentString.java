package InterviewPrograms;

public class FrequencyOfSubstringInParentString {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String parentstring = "JavapgmJavaJavaJava";
		String substring = "Java";
		
		System.out.println(substring + " substring is occuring " + frequencyofSybstring(substring, parentstring) +" times in parent " +parentstring);
	}

	private static int frequencyofSybstring(String substring, String parentstring) 
	{
		// TODO Auto-generated method stub
		
		int p = parentstring.length(); //11
		int s = substring.length(); //4
		int result =0;
		int i;
		int j;
		for(i=0; i<p; i++)  //i=0 , 0<11 , i=1
		{
			for(j=0; j<s; j++) //j=0, 0<4; j=1
			{
				if(parentstring.charAt(i+j)!= substring.charAt(j))  
				{
					break;
				}
			}	
				if(j == s)
				{
					result++;
					j=0;
				}	
		}	
		return result;
	}
}
