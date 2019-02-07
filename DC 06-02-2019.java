import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        for(int i=0; i<str.length(); i+=2)
            System.out.print(str.charAt(i));
        System.out.println();
        for(int i=1; i<str.length(); i+=2)
            System.out.print(str.charAt(i));
	}
}
