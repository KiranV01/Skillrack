import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String charinp = sc.nextLine();
		String [] splitinp = charinp.split("");
		int [] inp = new int[charinp.length()];
		int max=0,smax=0,i;
		for(i=0;i<charinp.length();i++)
		{
		    inp[i] = Integer.parseInt(splitinp[i]);
		    if((inp[i]>smax)&&(inp[i]<=max))
		        smax = inp[i];
		    if(inp[i]>max)
		    {
		        smax=max;
		        max=inp[i];
		    }
		}
		System.out.println(max*smax);

	}
}
