import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int arr[] = new int [256],len=inp.length(),i;
		for(i=0;i<len;i++)
		    arr[inp.charAt(i)]++;
		for(i=255;i>-1;i--)
		{
		    while(arr[i]>0){
		        System.out.printf("%c",i);
		        arr[i]--;
		    }
		}
	}
}
