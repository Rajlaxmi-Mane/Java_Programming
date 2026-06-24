package ibm;
// character occurrences in a string 
public class StringExa {
     public static void main(String[] args) {
		String str = "banana";
		int count = 0;
		boolean flag = true;
		
		for(int i=0; i<str.length(); i++) {
			count = 0;
			
//			for(int k=0; k<=i; k++) {
//				flag = true;
//				if(str.charAt(i) == str.charAt(k)) {
//					flag =  false;;
//				}
//			} 
//			
//			if(!flag) continue;
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.print(str.charAt(i) + ":" + count + " ");
		}
	}
}
