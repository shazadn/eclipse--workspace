package com.qa.inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {
 public static void main(String[] args) throws IOException {
	 // Read
	 BufferedReader bfdRead = new BufferedReader(
			 new FileReader(
					 "C:/Users/Admin/Desktop/inText.txt"));
	 String line = bfdRead.readLine();
	while(line != null) {
	
	 System.out.println(line);
	 line = bfdRead.readLine();
	 
	 // Wrire
	 BufferedWriter bfdWrite = new BufferedWriter(
			 new FileWriter(
					 "C:/Users/Admin/Desktop/outputText.txt"));
	 bfdWrite.write("new line" + "\r\n");
	 bfdWrite.write("yay!");
	 bfdWrite.flush();
	 bfdWrite.close();
	 
	}
 }
}
