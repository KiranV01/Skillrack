import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int n = sc.nextInt(),len=inp.length(),diff,i;
		diff = (len-n)/2;
		for(i=0;i<diff;i++)
		    System.out.print(inp.charAt(i));
		for(i=len-diff-1;i>=diff;i--)
		    System.out.print(inp.charAt(i));
		for(i=len-diff;i<len;i++)
		    System.out.print(inp.charAt(i));
	}
}
