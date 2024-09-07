package com.ebixCash;

public class ReverseAndConvertCase {
	
	// function to reverse the string and convert uppercase to lowercase and lowercase to uppercase
	
	public static void getReverse(String str,int index,String newStr) {
		
		//base case condition 
		if(index<0) {
			System.out.println(newStr);
			return ;
		}
		
		//fetching the current character present at index
		
		char currentChar=str.charAt(index);
		
		// checking character is lowercase or in uppercase
		if(currentChar>=97 && currentChar<=122) {
			
			//converting currentChar from lowercase character to uppercase
			// add converted character to our new String
			newStr+=(char)(currentChar-32);
			
			// recursive call
			getReverse(str,index-1,newStr);
		}else {
			
			// converting character upper to lower case	
			//adding that character to new String
			newStr+=(char) (currentChar+32);
			
			// recursive call
			getReverse(str,index-1,newStr);
		}
	}
	
	public static void main(String[] args) {
		String str="abcdEFGHijklMNOPqrstUVWXyz";
		
//		getReverse() will give desire string
		getReverse(str,str.length()-1,"");
	}

}
