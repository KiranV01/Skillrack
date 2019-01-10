import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		String time=sc.next();
		String endTime[]=time.split(":");
		int hr=Integer.parseInt(endTime[0]);
		int min=Integer.parseInt(endTime[1]);
		int remain=min-x;
		while(remain<0)
		{
		    remain+=60;
		    hr--;
		    if(hr<0)
		    {
		        hr=23;
		    }
		}
System.out.format("%02d:%02d",hr, remain);
	}
}
