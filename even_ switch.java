import java.util.Scanner;

public class even_switch
{
	public static void main(String[] args) {
		Scanner N=new Scanner(System.in);
		System.out.println("Enter a namber");
		int Run;
		Run=N.nextInt();
		switch(Run%2){
		case 0:
		    
		    System.out.println("Even");
		    break;
		    default:
		    System.out.println("Odd");
	}
}
}
