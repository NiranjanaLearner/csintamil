package com.Practice_Lab_2;
import java.util.Scanner;
public class Print_Favourite_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner favourite_number =new Scanner(System.in);
		System.out.print("Enter your favourite Number: ");
		int fav_number=favourite_number.nextInt();
		System.out.println(fav_number + " "+"is your favourite number");
		
	}

}
