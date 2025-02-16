package com.gn.homework03.controller;

import com.gn.homework03.model.dao.FileDAO;

// FileDAO 호출
public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
	// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고  
	// 그리고 그 반환 값을 그대로 받아 또 반환해줌 	
		boolean result = fd.checkName(file);
		return result;
	}
	public void fileSave(String file, StringBuilder sb) {
	// 매개변수로 넘어온 sb를 String으로 바꿔 
	// fd의 fileSave()메소드 매개변수로 
	// file과 String을 넘김	
		fd.fileSave(file, sb.toString());
	}
	public StringBuilder fileOpen(String file){ 
	// fd의 fileOpen() 매개변수로 file을 넘겨주고 
	// 그 반환 값을 그대로 받아 또 반환
		return fd.fileOpen(file);
		
	} 
	public void fileEdit(String file, StringBuilder sb){ 
	// 매개변수로 넘어온 sb를 String으로 바꿔 
	// fd의 fileEdit()메소드 매개변수로 
	// file과 String을 넘김 
		String s = sb.toString();
		fd.fileEdit(file, s);
		
	} 

}
