import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt(),srt,f=0,i;
		if(inp%2==0 || inp%5==0)
		    System.out.print("invalid");
		else
		 {
		     for(i=3;(i*i)<inp;i+=2)
		     {
		         if(inp%i==0)
		         {
		             System.out.print("invalid");
		             f=1;break;
		         }
		     }
		     if(f==0)
		        System.out.print("valid");
		 }
	}
}
