package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo {
	public static void main(String[] args) {
		
		
		String str="7095134631";
		
		String regex1="[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		String regex2="[6-9][0-9]{9}";
		String regex3="[6-9]\\d{9}";//d(digit)0-9
		
		Pattern p=Pattern.compile(regex3);//regex exp 
		Matcher m=p.matcher(str);//input validate
		
		
		if(m.find()&& m.group().equals(str)) {
			System.out.println("valid mobile number");
		}else {
			System.out.println("invlaid mobile number");
		}
		
		
	}

}
