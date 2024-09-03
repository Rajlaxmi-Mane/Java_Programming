package ARRAY;
import java.util.Scanner;
import java.util.HashSet;
public class FindFrequencyUsingHashset {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		countFreq(arr);
	}
	
	public static void countFreq(int[] arr) {
		HashSet<Integer> h=new HashSet();
		for(int i=0;i<arr.length;i++) {
			h.add(arr[i]);
		}
		for(int el:h) {
			int cnt=0;
			for(int i=0;i<arr.length;i++) {
				if(el==arr[i]) {
					cnt++;
				}
			}
			System.out.println("count of "+el+" is : "+cnt);
			
		}
	}

}
