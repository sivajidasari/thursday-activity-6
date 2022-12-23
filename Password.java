import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your password");
		String Password=sc.next();
		String regex = "[A-Za-z#@*]{8}";
		Pattern p=Pattern.compile(regex);
		Matcher m= p.matcher(Password);
		boolean matchFound=m.find();
		if(matchFound)
			System.out.println("your password is valid");
		else
			System.out.println("your password is invalid.......Try Again");
			
		
		

	}

}
