import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		int i,len=inp.length();
		for(i=0;i<len;i++)
		{
		    if(inp.charAt(i)==x)
		        System.out.print(y);
		    else    
		        System.out.print(inp.charAt(i));
		}
	}
}
