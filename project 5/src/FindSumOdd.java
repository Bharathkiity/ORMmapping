
public class FindSumOdd {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int sumodd=0;
		int sumeven=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				sumeven=sumeven+a[i];
				//System.out.println(sumeven);
			}
			else {
				//System.out.println(a[i]);
				sumodd=sumodd+a[i];
				//System.out.println(sumodd);
			}
		}	
		System.out.println(sumeven);
		System.out.println(sumodd);  
	}
	
}
