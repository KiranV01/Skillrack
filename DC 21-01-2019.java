import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),evenn=(n/2)+1;
		int oddn = (n%2==0)? n/2 : (n/2)+1;
		int sum = (oddn*oddn);
		sum -= evenn*(evenn-1);
		System.out.print(sum);
	}
}
