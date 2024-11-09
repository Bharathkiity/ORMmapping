import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		int[] a={1,102,2020,20};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		}
		System.out.println(max);
	}
}
