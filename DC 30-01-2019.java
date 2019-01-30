import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),c=1;
		for(int i=n-1;i>0;i--,c++)
		{
		    printVal(i,c);
		    System.out.println();
		}
		printVal(0,n);
		System.out.println();
		c=n-1;
		for(int i=1;i<n;i++,c--)
		{
		    printVal(i,c);
		    System.out.println();
		}
	}
	public static void printVal(int n,int m)
	{
	    for(int i=0;i<n;i++)    
	        System.out.print("*");
	    for(int i=0;i<m;i++)
	        System.out.print("(");
	    for(int i=0;i<m;i++)
	        System.out.print(")");
	    for(int i=0;i<n;i++)    
	        System.out.print("*");
	}
	
}
