package abhishek;

public class Java {
public static void main(String[] args) {
//	int a= 2,b,c;
//	b = a++ + a++; //
//	c = b++;
//	c++;
//	System.out.println(a+" "+b+" "+c);
	
	String a="abhishek";
	for(int i=(a.length()-1);i>=0;i--) {
		System.out.print(a.charAt(i));
	}

	

	System.out.println(a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.charAt(4));
   System.out.println(a.replaceFirst("a", "A"));
   
}
}
