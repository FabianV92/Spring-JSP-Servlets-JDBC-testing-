package com.fv.test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;



import org.springframework.stereotype.Component;

@Component
public class DoStuff implements InterfaceMethods {

	/*@PostConstruct
	public void getACoffee() {
		System.out.println( "Get a coffee my boi!");
	}*/

	public String convertFileToString() {
		String filepath = "src/Data.txt";
		File file = new File(filepath);
		String brContainer = "";
		Random rd =new Random();
		int randomNumber = rd.nextInt(4);
		ArrayList<String> listContainer = new ArrayList();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			// Read the data text
			while ((brContainer = br.readLine()) != null) {
				// Save the data text into an ArrayList
				listContainer.add(brContainer);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Return a random element of the ArrayList as a String
		return listContainer.get(randomNumber).toString();
	}

	@Override
	public String doStuff() {
		return convertFileToString();
	}
	
	
	/*
	@PreDestroy
	public String shutDownPc() {
		return "Shut dow the computer boi! You finished your work!";
	}
	*/

}
