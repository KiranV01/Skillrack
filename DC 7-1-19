import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		if((x==y)&&(y==z))
		    System.out.format("%.02f",x+y+z);
		else if(x==y)
		    printer(x,z);
		else if(y==z)
		    printer(y,x);
		else if(x==z)
		    printer(x,y);
		else
		    System.out.format("%.02f",x+y+z);
	}
	public static void printer(double a,double b)
	{
	    a = a - (a*0.1);
	    System.out.format("%.02f",a+a+b);
	}
}
