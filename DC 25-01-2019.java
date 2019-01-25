import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i,c=0;
		int arr [] = new int [n];
		for(i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		    if(arr[i]==0)
		        System.out.print(arr[i]+" ");
		    else
		        c++;
		}
		for(i=0;i<c;i++)
		    System.out.print("1 ");

	}
}
