import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prime {

	public static void main(String[] args) {
		int a[]={10,5,60,25,55};
		System.out.println("arr is"+a);
		int largest=a[0];
		for(int i=1;i<a.length;i++){
		if(largest<a[i]){

		largest=a[i];

		}
		System.out.println(largest);
		}
		System.out.println("arr is"+a);

		ArrayList al=new ArrayList<>(Arrays.asList(a));
		System.out.println("al is"+al);
		Collections.sort(al);
		//Integer maxNumber = (Integer) Collections.max(al);
		//System.out.println("al after sort is"+al);
		System.out.println("al after sort is"+al);
		int last=al.size()-1;
		System.out.println("largest number is"+al.get(last));
		  // Find the highest number in the ArrayList
        ///Integer maxNumber = Collections.max(numbersList);
		
		
		
		
		String s = "123";
		StringBuilder str =  new StringBuilder("123");
		int n=123;
		//if(s.equals(n));
		System.out.println(s.equals(str));
	//	if(s == str);
		
		
		
		//for (int i = 2; i <= Math.sqrt(num); i++) {
		 //   if (num % i == 0) {
		//not prime
		//else prime
		int num=11;
		int count=0;
		for(int i =2;i<num/2;i++) {
			if(num % i == 0) {
				
				count=1;
				break;
			}
		}
		if(count==1) {
			System.out.println("not prime");
		}else {

			System.out.println("prime**");

			System.out.println("***prime***");

		}
		
	}

}
