package javapractice;

public class CountCharInString {

	public static void main(String[] args) {
		String string="The best of both worlds";
		int count=0;
		for(int i=0; i<string.length();i++)
		{
			if(string.charAt(i) != ' ')
				count=count+1;
		}
		System.out.println("Number of characters in string are: "+count);

	}

}
