import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int len=inp.length(),i,j;
		for(i=0;i<len;i++)
		{
		    for(j=0;j<i+1;j++)
		    {
		        System.out.print(inp.charAt(i));
		    }
		    System.out.println();
		}

	}
}
