package com.system.encodedecode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EncodeDecodeUtil {
	
	public final static String INPUT_FILE_PATH = "C:\\Noridion\\input.txt";
	public final static String OUTPUT_FILE_PATH = "C:\\Noridion\\output.txt";
	
	public static void main(String[] args) {
		
		/** Build and get the Reference Mapping */
		HashMap<Object,Object> encodeDecodeMappingRef = getMappingReference();
		
		/** Get the data to be decoded from the input file */
		List<String> encodedDataList = getDataForDecodingFromFile();
		
		/** process the data using the reference mapping */
		System.out.println("Step 3 - start data decoding");
		List<String> decodedDataList = new ArrayList<>();
		for (String encodedString : encodedDataList){
			StringBuffer buffer = new StringBuffer();
			for(char character : encodedString.toCharArray()){
				buffer.append(encodeDecodeMappingRef.get(character));
			}
			decodedDataList.add(buffer.toString());
		}
		System.out.println("Step 3 - Data decoding completed");
		
		/** Write Decoded data to output file */
		if(!decodedDataList.isEmpty()){
			writeDecodedDataToFile(decodedDataList);
			System.out.println("Decoding Successful");
		}else{
			System.out.println("Decoding Failed");
		}
	}
	
	/**
	 * This Method writes the decoded data to the output file
	 * @param decodedDataList - processed decoded data list
	 */
	private static void writeDecodedDataToFile(List<String> decodedDataList) {
		System.out.println("Step 4 - writing Data to output File");
	    File file = new File(OUTPUT_FILE_PATH);
		Writer fileWriter = null;
		BufferedWriter bufferedWriter = null;
        try {
        	fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(String decodedData : decodedDataList){
            	bufferedWriter.write(decodedData);
            	bufferedWriter.newLine();
            }
            System.out.println("Step 4 - completed writing Data to output File");
        } catch (IOException e) {
        	System.err.println("Error writing the file : ");
            e.printStackTrace();
        } finally {
        	if (bufferedWriter != null && fileWriter != null) {
	        	try {
	        		bufferedWriter.close();
	        		fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
	}
	
	/**
	 * This Method reads the input file and builds a list of strings to be decoded
	 * @return encodedString list
	 */
	private static List<String> getDataForDecodingFromFile() {
		System.out.println("Step 2 - Reading Data from Input File");
		Scanner scanner = null;
		List<String> encodedLines = new ArrayList<String>();
		try{
			scanner = new Scanner(new File(INPUT_FILE_PATH));
			while (scanner.hasNextLine()) {
				encodedLines.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		System.out.println("Step 2 - Data reading from Input File completed.");
		return encodedLines;
	}

	/**
	 * This Method builds a source HashMap<Object, Object> from the given samples as a reference library 
	 * @return populated HashMap<Object, Object>
	 */
	private static HashMap<Object, Object> getMappingReference(){
		
	/*
		1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5
		*CDC is the trademark of the Control Data Corporation.
		
		1PIT'pz'h'{yhklthyr'vm'{ol'Pu{lyuh{pvuhs'I|zpulzz'Thjopul'Jvywvyh{pvu5
		*IBM is a trademark of the International Business Machine Corporation.
		
		1KLJ'pz'{ol'{yhklthyr'vm'{ol'Kpnp{hs'Lx|pwtlu{'Jvywvyh{pvu5
		*DEC is the trademark of the Digital Equipment Corporation.
	*/
		System.out.println("Step 1 - Building Mapping Reference");
		HashMap<String,String> encodeToDecodeSampleMap = new HashMap<String,String>();
		HashMap<Object,Object> encodeDecodeMapping = new HashMap<Object,Object>();
				
		encodeToDecodeSampleMap.put("1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5", "*CDC is the trademark of the Control Data Corporation.");
		encodeToDecodeSampleMap.put("1PIT'pz'h'{yhklthyr'vm'{ol'Pu{lyuh{pvuhs'I|zpulzz'Thjopul'Jvywvyh{pvu5", "*IBM is a trademark of the International Business Machine Corporation.");
		encodeToDecodeSampleMap.put("1KLJ'pz'{ol'{yhklthyr'vm'{ol'Kpnp{hs'Lx|pwtlu{'Jvywvyh{pvu5", "*DEC is the trademark of the Digital Equipment Corporation.");

		for(Map.Entry<String, String> me : encodeToDecodeSampleMap.entrySet()){
			String encodedString = (String) me.getKey();
			String decodedString = (String) me.getValue();
			for(int i=0; i < encodedString.length(); i++){
				for(int j=0 ; j < decodedString.length(); j++){
					if(i==j){
						encodeDecodeMapping.put(encodedString.charAt(i), decodedString.charAt(j));
					}
				}
			}
		}
		System.out.println("Step 1 - Mapping Reference population completed");
		return encodeDecodeMapping;
	}
	
}
