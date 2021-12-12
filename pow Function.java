import java.util.Scanner;

public class pow Function
{
	
	static int add(int L,int O){
return L+O;
	 
	}
	static int sub(int q ,int a ){
	   return q-a;
	    
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	Scanner N = new Scanner(System.in);
int R = N.nextInt();
int r = N.nextInt();
	    int M=N.nextInt();
	    if(M==1){
   int result = add(R,r);
System.out.println(result);}



else if(M==2){
    sub(1,2);
    System.out.println(sub(R,r));
    
}

	    
	    
	    
	}


	
	
	
}
