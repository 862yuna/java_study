package com.gn.homework03.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		File dir = new File("C:\\test\\homework");
		if(!dir.exists()) {
			dir.mkdirs();
		}
	// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌 
	// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환 	
		File note = new File(dir,file);
		boolean result = false;
		if(!note.exists()) {
			result = false;
		}else {
			result = true;
		}
		return result;
	}
	
	public void fileSave(String file,String s) {
	// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고 
	// String에 써서 저장
		File dir = new File("C:\\test\\homework");
//		if(!dir.exists()) {
//			dir.mkdirs();
//		}
		File note = new File(dir,file);
		try(FileOutputStream fos = new FileOutputStream(note)){
			byte[] arr = s.getBytes();
			fos.write(arr);
			fos.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
	// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환 
		File dir = new File("C:\\test\\homework");
		File note = new File(dir,file);
//		FileReader in = null;
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(note))) {
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				
				sb.append(data).append("\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		
		}
		int idx = sb.lastIndexOf("\n");
		sb.deleteCharAt(idx);
		return sb;
	}
	
	public void fileEdit(String file, String s) {
	// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고 
	// String에 써서 저장하되 이어서 저장될 수 있도록 함 
		File dir = new File("C:\\test\\homework");
		File note = new File(dir,file);
		try(FileOutputStream fos = new FileOutputStream(note,true)){
			byte[] b = s.getBytes();
			fos.write(b);
			fos.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
