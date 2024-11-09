package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidateEmailId {
	public static void main(String[] args) {
		
		
		String str="ANGPA6354G";
		
		String regex="[A-Z]{5}[0-9]{4}[A-Z]";
		
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		
		
		if(m.find()) {
			System.out.println("valid ");
		}else {
			System.out.println("invlaid ");
		}
		
		
	}

}
