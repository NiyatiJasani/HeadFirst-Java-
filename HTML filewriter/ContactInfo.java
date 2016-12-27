package com.tech.filewrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ContactInfo {

	public static void main(String[] args) {
		try {

			Scanner input = new Scanner(System.in);

			System.out.println("Enter Name: \n");
			String name = input.nextLine();

			System.out.println("Location: \n");
			String location = input.nextLine();

			System.out.println("Email:  \n");
			String email = input.nextLine();

			System.out.println("Hello there!");

			FileWriter write = new FileWriter("D:/ mycontactinfo.txt");
			BufferedWriter bw = new BufferedWriter(write);

			bw.write(name);
			bw.write(location);
			bw.write(email);
			bw.newLine();
			bw.flush();

		} catch (Exception ex) {
			System.out.println("File not found");
		}
		System.out.println("File created and appended");
	}

}
