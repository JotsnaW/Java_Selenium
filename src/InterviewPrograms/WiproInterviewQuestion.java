package InterviewPrograms;


//Program to find count of all duplicate characters in string "Character"

public class WiproInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Character";
		int i,j, count=0;
		
		char[] ch = str.toCharArray();
		
		for(i=0; i<str.length();i++)
		{
			count=1;
			for(j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j] && ch[i] != ' ')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>0 && ch[i]!='0')
			{
				System.out.print(ch[i]);
			}
			System.out.println(" - " +count);
		}
		
	}

}



//string s1 = "Character"
//
//psvm()
//{
//string s1= "Character";
//char[] c1 = s1.toCharArray();
//int size = s1.lenght();
//int count=0;
//for(int i=0;i<=size;i++)
//{
//	for(int j=i+1; j<=size; j++)
//	{
//	if(char[i]==char[j])
//	{
//	 count++;
//	break;
//	}
//	SOP(i + "is repeating
//}


