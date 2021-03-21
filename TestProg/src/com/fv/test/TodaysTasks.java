package com.fv.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class TodaysTasks implements InterfaceDoStuff {


	public String dataArray() {

		String filename = "C:\\Users\\WindowsFFX\\eclipse-workspace\\TestProg\\src\\Data.txt";
		File file = new File(filename);
		ArrayList<String> dataList = new ArrayList<>();
		Random rd = new Random();
		int randomNumber = rd.nextInt(3);


		// File erstellen

		try {
			// read lines
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			while ((str = br.readLine()) != null) {
				dataList.add(str);
			}
			// close all
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dataList.get(randomNumber).toString();
	}

	
	
	@Override
	public String programmThis() {
		return dataArray();
	}

	@Override
	public String getACoffe() {
		return "You look tired! get a coffee my son !";
	}

}
