package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidatePanCard {
	public static void main(String[] args) {
		
		
		String str="DNGPA6354G";
		
		String regex="[A-Z]{5}[0-9]{4}[A-Z]";
		
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		
		
		if(m.matches()) {
			System.out.println("valid ");
		}else {
			System.out.println("invlaid ");
		}
		
		
	}

}
