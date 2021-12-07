import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner N=new Scanner(System.in);
	System.out.println("Enter a degree");
	int Amm=N.nextInt();
if(Amm>=95){
	System.out.println("A+");}
	else if(Amm>=90){
	    System.out.println("A");}
	
	else if(Amm>=85){
	    System.out.println("B+");}
	else if(Amm>=80){
	    System.out.println("B");}
	else if(Amm>=75){
	    System.out.println("C+");}
else if(Amm>=70){
	    System.out.println("C");}
	else if(Amm>=65){
	    System.out.println("D+");}
	else if(Amm>=60){
	    System.out.println("D");}
	
	else if(Amm<=59){
	    System.out.println("F");}
	
	}
}
