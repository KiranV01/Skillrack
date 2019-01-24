import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt(),len=0,i,j;
		int binaryf [] = new int [20];
		while(inp>0){
		    binaryf[len++] = inp%2;
		    inp/=2;
		}
		int n = len-2,c=n;
		for(i=len-1;i>-1;i--)
		    System.out.print(binaryf[i]);
		System.out.println();
		for(i=0;i<n;i++)
		{
		    System.out.print(binaryf[c--]);
		    for(j=0;j<n;j++)    
		        System.out.print("*");
		    System.out.printf("%d\n",binaryf[i+1]);
		}
		for(i=0;i<len;i++)
		    System.out.print(binaryf[i]);
    }
}
