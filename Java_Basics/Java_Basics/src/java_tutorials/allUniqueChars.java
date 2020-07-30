package java_tutorials;

public class allUniqueChars
{
	static boolean allunique(String s) {
		for(int i=0;i<s.length();i++) 
		{
			for(int j=0;j<s.length();j++) 
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					System.out.println(s.charAt(i)+" has duplicates");
					return false;
				}	
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String s="Alivme swumzmi";
		boolean flag=allunique(s);
		if(flag)
			System.out.println("All chars are unique");
		else
			System.out.println("Therefore all chars are not unique");	
	}
}
