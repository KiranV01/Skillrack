import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i;
		for(i=1;i<=n;i++)
		{
		    binaryC(i*i));
		    System.out.println();
		}
		    
	}
	public static void binaryC(int x)
	    {
	        if(x>0)
	        {
	            binaryC(n/2);
	            System.out.print(n%2);
	        }
	    }
}
