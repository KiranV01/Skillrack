import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] inp = sc.nextLine().split("");
		int i,temp;
		for(i=0;i<inp.length;i++)
		{
		    temp = Integer.parseInt(inp[i]);
		    System.out.printf("%04d \n",binC(temp));
		}
	}
	public static int binC(int n)
	{
	    int binary=0;
	    if(n==0)
	        return 0;
	    else
	        return (n%2+10*binC(n/2));
	}
}
