package com.decision_m_stmt;

import java.util.*;

public class switch2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.toUpperCase();
		switch (str) {
		case "WEDNESDAY":
		case "MONDAY": {
			System.out.println("BASKETBALL");
			break;
		}
		case "TUESDAY ":
		case "FRIDAY": {
			System.out.println("TENNIS");
			break;
		}
		case "THURSDAY": {
			System.out.println("CRICKET");
			break;
		}
		case "SATERDAY": {
			System.out.println("EXERCISE");
			break;
		}
		case "SUNDAY": {
			System.out.println("HOLIDAY");
			break;
		}
		default: {
			System.out.println("INVALID INPUT");
		}
		}

	}

}


