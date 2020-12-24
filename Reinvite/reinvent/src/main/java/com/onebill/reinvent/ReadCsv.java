//package com.onebill.reinvent;
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.opencsv.CSVParser;
//import com.opencsv.CSVParserBuilder;
//import com.opencsv.CSVReader;
//import com.opencsv.CSVReaderBuilder;
//
//public class ReadCsv {
//	
//	public List<String[]> readCSV(String csvFilePath, char delimeter) {
//		File csvFile = null;
//		CSVReader csvReader = null;
//		
//		List<String[]> csvLst = new ArrayList<String[]>();
//		try {
//			if (null != csvFilePath) {
//				csvFile = new File(csvFilePath);
//				if (csvFile.isFile()) {
//					
//					CSVParser parser = new CSVParserBuilder().withSeparator(delimeter)
//							.withIgnoreQuotations(false).build();
//					
//					csvReader = new CSVReaderBuilder(new FileReader(csvFile))
//						    .withSkipLines(0)
//						    .withCSVParser(parser)
//						    .build();
//					List<String[]> tempLst = csvReader.readAll();
//					if (!UtilProcessor.isNullOrEmpty(tempLst)) {
//						csvLst.addAll(tempLst);
//					}
//				}else {
//					LOG.fatal("Unable to locate file : " + csvFile.getPath());
//				}
//			}
//		} catch (IOException e) {
//			LOG.error("Error", e);
//		} catch (Exception e) {
//			LOG.error("Error", e);
//		} finally {
//
//			if (null != csvReader) {
//				try {
//					csvReader.close();
//				} catch (IOException e) {
//					csvReader = null;
//					LOG.error("Error", e);
//				}
//			}
//		}
//		return csvLst;
//	}
//
//}
