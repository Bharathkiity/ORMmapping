package java8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> courses=Arrays.asList("java","pyhton","Angular");
		
		Consumer<String>consumer=(value)->System.out.println(value);
		courses.forEach(consumer);
		System.out.println("===============================");
		courses.forEach((value)-> System.out.println(value));
		System.out.println("===============================");
		courses.forEach(System.out::println);
		
		
		List<Double>salaries=Arrays.asList(5500.0,6500.0,7500.0,65000.0);
		Consumer<Double>consumer1=(value)->System.out.println(value);
		System.out.println("=====passsing cosumer object===========");
		salaries.forEach(consumer1);
		System.out.println("===========passing lambda expression=======");
		salaries.forEach((value)-> System.out.println(value));
		System.out.println("==========passing method refernence=======");
		salaries.forEach(System.out::println);
		
		List<Double>filteredSalaries=new ArrayList<Double>();
	
		salaries.forEach((salary)->{
			if(salary>=40000) {
				filteredSalaries.add(salary);
			}	
		});
		for (Double salary:salaries) {
			if(salary>=40000)
				filteredSalaries.add(salary);
		}
		System.out.println(filteredSalaries);
	
	}
}
