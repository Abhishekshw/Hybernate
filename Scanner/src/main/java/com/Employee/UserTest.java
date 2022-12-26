package com.Employee;

import java.util.Scanner;

import com.Scanner.daoimpl.UserImpl;

public class UserTest {
	static char ans;

	public static void main(String[] args) {
		UserImpl ul = new UserImpl();

		Scanner S = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("welcome to user record System");

		do {
			System.out.println("1.add \n 2.read \n 3.update \n 4.Delete \n 5.exit");
			int ch = S.nextInt();
			switch (ch) {
			case 1:
				ul.addUser();
				break;
			case 2:
				ul.readUser();
				break;
			case 3:
				ul.updateser();
				break;
			case 4:
				ul.deleteUser();
				break;
			case 5:
				System.exit(0);
				break;

			}
			System.out.println("do you want to process again? y/n");
			ans = S.next().charAt(0);
		} while (ans == 'y' || ans == 'Y');
		{
			System.out.println("thank you");
		}
	}
}
