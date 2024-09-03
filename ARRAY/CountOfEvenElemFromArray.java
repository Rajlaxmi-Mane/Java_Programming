package ARRAY;
import java.util.*;
public class CountOfEvenElemFromArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int cnt=countEven(arr);
		System.out.println(cnt);
	}
	
	public static int countEven(int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				cnt++;
			}
		}
		return cnt;
	}

}
