import java.util.Scanner;

public class largest
{
	
	
	public static void main(String[] args) {
	Scanner N =new Scanner(System.in);
	int X,Y,Z;
	System.out.println("Enter Value of X");
	  X=N.nextInt();
	 System.out.println("Enter Value of Y");
	    Y=N.nextInt(); 
	    System.out.println("Enter Value of Z");
	     Z=N.nextInt(); 
	  
	  
	   if(X>Y && X>Z) {
	    System.out.println("X Is The Large Value");}
	    
	    else if(Y>X && Y>Z){
	    System.out.println("Y Is The Large Value");}
	    
	else{
	    System.out.println("Z Is The Large Value");}
	
}
}
