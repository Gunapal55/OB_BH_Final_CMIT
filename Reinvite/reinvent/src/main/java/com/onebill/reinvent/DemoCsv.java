package com.onebill.reinvent;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class DemoCsv {

	public static void main(String[] args) throws IOException {

		String path = "/home/onebill/Desktop/Gunapal P/Reinvite/demo.csv";
		String line = "";

		CSVReader reader = new CSVReader(new FileReader(path));
		String[] nextLine;
		String[] keys;

		int lineNumber = 0;
		while ((nextLine = reader.readNext()) != null) {
			List<String> header = new ArrayList<String>();
			List<String> body = new ArrayList<String>();

			// if (lineNumber) {

			for (String op : nextLine) {
				header.add(op);

				body.add(op);
				System.out.println(op);
			}
		}
		// System.out.println(header);

		lineNumber++;

		//
		// String [] nextLine1;
		//
		// int lineNumber1 = 1;
		// while ((nextLine1 = reader.readNext()) != null) {
		// List<String> body = new ArrayList<String>();
		// // nextLine[] is an array of values from the line
		// if (lineNumber1 > 1) {
		//
		// for (String op1 : nextLine1) {
		// body.add(op1);
		//
		// }
		// System.out.println(body);
		// }
		reader.close();
	}

}

// boolean lineNumber = false;
// if(lineNumber=false) {
// while ((nextLine = reader.readNext()) != null) {
// List<String> header = new ArrayList<String>();
//
//
// for (String op : nextLine) {
// header.add(op);
//
// }
// System.out.println(header);
// lineNumber=true;
// }
// if (lineNumber =true) {
//
// List<String> body = new ArrayList<String>();
// for (String op1 : nextLine) {
// body.add(op1);
//
// }
// System.out.println(body);
// }
//
// }
