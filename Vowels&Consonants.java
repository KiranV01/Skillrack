import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int i;
		char temp;
		for(i=0;i<inp.length();i++)
		{
		    temp=inp.charAt(i);
		    if(isVowel(temp)==1)
		        System.out.print(temp);
		}
		for(i=0;i<inp.length();i++)
		{
		    temp=inp.charAt(i);
		    if(isVowel(temp)==0)
		        System.out.print(temp);
		}
	}
	public static int isVowel(char a)
	{
	    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='O'||a=='I'||a=='U')
	    {
	        return 1;
	    }
	    else
	        return 0;
	}
}
