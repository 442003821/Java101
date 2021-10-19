import java.util.Scanner;

public class Mid
{
	public static void main(String[] args) {
	Scanner N=new Scanner (System.in);
	System.out.println("Enter a birth");
	int birth;
	birth=N.nextInt();
		System.out.println("Enter name");
		N.nextLine();
String name;
name=N.nextLine();
	
	int age = (2021-birth);
	
	
	
	
	
	if(age>=40){
	    System.out.println("hi old man "  +name+  " your age is abuot"+age);}
	
	
	else if(age>=30 && age  <=39){
	   System.out.println("hi golden aged man "   +name+  " your age is abuot"+age);}
	
	else{
	
	  System.out.println("hi young man "  +name+   " your age is abuot"+age);}

	
	
	
	}
}
