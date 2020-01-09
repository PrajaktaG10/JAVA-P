package javapractice;

public class NoOfVowConInString {

	public static void main(String[] args) {
		String str="This is a really simple sentence";
		int vCount=0,cCount=0;//variables to store the value of vowels and consonant count
		str=str.toLowerCase();//converting string to lower case
		for(int i=0; i<str.length();i++)
		{
			//To check whether a character is a vowel
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
			}
			//To check whether a character is a consonant
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				cCount++;
			}
		}
            System.out.println("Total number of vowels present in a string are "+vCount);
            System.out.println("Total number of consonants present in a string are "+cCount);
		
	}

}
