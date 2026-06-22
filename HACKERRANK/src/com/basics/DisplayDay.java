package com.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/*
 The Calendar class is an abstract class that provides methods for converting between a specific instant 
 in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for 
 manipulating the calendar fields, such as getting the date of the next week. You are given a date. 
 You just need to write the method, , which returns the day on that date. To simplify your task,
  we have provided a portion of the code in the editor. Example The method should return as the day on that
   date. image Function Description Complete the findDay function in the editor below. findDay has the 
   following parameters: int: month int: day int: year Returns string: the day of the week in capital 
   letters Input Format A single line of input containing the space separated month, day and year, 
   respectively, in format. Constraints Sample Input 08 05 2015 Sample Output WEDNESDAY Explanation 
   The day on August 15th was WEDNESDAY
 */
public class DisplayDay {
	public static String findDay(int month, int day, int year) {
        Calendar calender = Calendar.getInstance();
        calender.set(year, month-1, day);
        
        String dayOfWeek = calender.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        
        return dayOfWeek;
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		System.out.println(date);
		String [] firstMultipleInput =  date.split("-");
		System.out.println(Arrays.toString(firstMultipleInput));
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);
        System.out.println(res);
        
        sc.close();
    }

}
