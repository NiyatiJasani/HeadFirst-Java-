package com.tech.fileread;

import java.io.BufferedReader;
import java.io.FileReader;

public class ContatcInformation {

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("D:/info-contacts.txt");
			BufferedReader br = new BufferedReader(in);
			String currentLine;

			while ((currentLine = br.readLine()) != null) {
				String[] values = currentLine.split(",");
				for (String str : values) {
					System.out.println(str);
				}
			}
			br.close();
		}

		catch (Exception ex) {
			System.out.println("File has an error");

		}

	}
}
