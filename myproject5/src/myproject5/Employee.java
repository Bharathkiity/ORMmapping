package myproject5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok-library able to code concise (propeties)
//@AllArgsConstructor-zero constructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
@Data

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private long employeeMobile;

	
	
}
