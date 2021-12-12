import java.util.Scanner;


public class even
{
	public static void main(String[] args) {
	int AMM=0;
	int QYY=0;
	System.out.println("Enter a namber");
	Scanner N= new Scanner(System.in);
	QYY = N.nextInt();
	AMM = QYY/2;
	if(AMM*2 == QYY){
	 System.out.println("Even");}
	 else{
	    System.out.println("Odd");}
	    
}
}
