import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int len = inp.length(),i,j,c=2,temp=0,diff,n=0;
		while(temp<len)
		{
		    n++;
		    temp = (n*(n+1))/2;
		}
		diff = temp-len;
		for(i=0;i<diff;i++)
		    inp = inp + "*";
		System.out.println(inp.charAt(0));
		for(i=1;i<n;i++,c+=i+1)
		{
		    temp=c;
		    for(j=i+1;j>0;j--)
		    {
		        System.out.print(inp.charAt(temp--)+" ");
		    }
		    System.out.println();
		 }
	}
}
