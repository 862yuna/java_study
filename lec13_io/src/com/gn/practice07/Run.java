package com.gn.practice07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File file = new File("c:/test/sub/practice/output.txt");
		if(!file.exists()) {
			file.mkdirs();
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			StringBuilder sb = new StringBuilder();
			int sum = 0;
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				sb.append(data+"\n");
				data = data.replace(" ", "");
				sum += data.length();
			}
			int idx = sb.lastIndexOf("\n");
			sb.deleteCharAt(idx);
			System.out.println(sb.toString());
			System.out.println("공백 제외 글자수 : "+sum);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}

}
