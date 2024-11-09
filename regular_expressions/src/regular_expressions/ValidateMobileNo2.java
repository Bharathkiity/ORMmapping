package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo2 {
	public static void main(String[] args) {
		
		
		String str="This is Smith.My contact no.99888776655 and 7094316611";
		
		String regex1="[6-9][0-9]{9}";

		
		Pattern p=Pattern.compile(regex1);
		Matcher m=p.matcher(str);
		
		
		while(m.find()) {
			//System.out.println("mobile number");
			System.out.println(m.group());
			
		}
		
		
	}

}
