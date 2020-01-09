package javapractice;

public class VariableExample {

	public static void main(String[] args) {
		//Widening
		int a=15;   //instance variable
		float f= a;
		System.out.println("a=" +a);
       System.out.println("f=" +f);
       
       System.out.println();
       
       //Narrowing- Typecasting
       float fl= 22.05f;
       int b=(int)fl;
       System.out.println("fl="+fl);
       System.out.println("b="+b);
      
       System.out.println();
       
       //Overflow
       int c=145;
       byte d=(byte)c;
       System.out.println("c="+c);
       System.out.println("d="+d);
       
       System.out.println();
       
      //Adding lower type
       byte i=15;
       byte j=20;
       byte k=(byte)(i+j);
       System.out.println("k="+k);
       
       
	}

}
