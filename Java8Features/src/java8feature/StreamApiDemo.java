package java8feature;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo {
public static void main(String[] args) {
	List<Double>salaries=Arrays.asList(55000.0,45000.0,35000.0,65000.0);
	Stream<Double>stream=salaries.stream();
	Predicate<Double>predicate=(value)->value>=40000;
	stream.filter(predicate)
	.forEach(System.out::println);
 	System.out.println("===filter using salaries<50000====");
	salaries
	.stream()
	.filter((salary)->salary<50000)
	.forEach(System.out::println);
	
	List<String>courses=Arrays.asList("python","Java","Angular","React","Javascript");
	System.out.println("====filter course names start with J====");
	courses
	.stream()//stream object call
	.filter((course)->course.startsWith("J"))//filter
	.forEach(System.out::println);//print on console
	
	courses
	.stream()
	.filter((course)->course.startsWith("p"))
	.forEach(System.out::println);
	
	System.out.println("=========filter courses where coutse name length is >=5 character=====");
	courses
	.stream()
	.filter((course)->course.length()>=5)
	.forEach(System.out::println);
	
	System.out.println(salaries);
	System.out.println("update each salary by 2k and display updated salary");
	salaries
	.stream()
	.map((salary)->salary+2000.0)
	.forEach(System.out::println);
	
	System.out.println("update each salary by 10% and display updated salary");
	salaries
	.stream()
	.map((salary)->salary*1)
	.forEach(System.out::println);
	
	System.out.println("dispaly sum of salaries");
	double totalsalary=salaries
	
		.stream()
		.reduce((sal1,sal2)->sal1+sal2)
		.get();
		System.out.println(totalsalary);
		
		System.out.println("=========");
		totalsalary=salaries
				.stream()
				.mapToDouble((salary)->salary)
				.sum();
				System.out.println(totalsalary);

				System.out.println("avg salary");
				double avgsalary=salaries
				.stream()
				.mapToDouble((salary)->salary)
				.average()
				.getAsDouble();
				System.out.println(avgsalary);
				
				
				System.out.println("max salary");
				double maxsalary=salaries
				.stream()
				.mapToDouble((salary)->salary)
				.max()
				.getAsDouble();
				System.out.println(maxsalary);
				
				
				System.out.println("min salary");
				double minsalary=salaries
				.stream()
				.mapToDouble((salary)->salary)
				.min()
				.getAsDouble();
				System.out.println(minsalary);
	
	
}


}
