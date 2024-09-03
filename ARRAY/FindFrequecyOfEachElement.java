package ARRAY;
import java.util.*;
public class FindFrequecyOfEachElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		frequencyCount(arr);
	}
	
	public static void frequencyCount(int[] arr) {
		int vis=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			if(arr[i]!=vis) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						cnt++;
						arr[j]=vis;
					}
				}
				System.out.println(arr[i]+" : "+cnt);
			}
		}
	}

}
