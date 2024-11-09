package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regex for password:
// - At least one digit
// - At least one lowercase letter
// - At least one uppercase letter
// - At least one special character [!@#$%^&*()]
// - At least 8 characters long

public class ValidatePassword {
	public static void main(String[] args) {
		
		
		String password = "Bharath@9009"; 
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$]).{8,15}$";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        
        if(m.matches()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
		
		
	}

