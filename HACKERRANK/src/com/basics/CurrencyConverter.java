package com.basics;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 Problem:Given a double amount of money, use NumberFormat.getCurrencyInstance to format it into US, 
 Indian, Chinese, and French currencies. Print each on a new line.Note: For India, 
 construct a new Locale with en (English) language.Constraints:0 ≤ payment ≤ 10⁹Sample 
 Input:text12324.134
Use code with caution.Sample Output:textUS: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

 */
public class CurrencyConverter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // Indian currency format (Language: en, Country: IN)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        // Chinese currency format
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // French currency format
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
