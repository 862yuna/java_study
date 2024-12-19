package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists()==false) {
			dir.mkdirs();
		}
		File file = new File(dir,"sample1.dat");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte[] b = new byte[(int)file.length()];
			int idx = 0;
			
			int data;
			
			while(true) {
				data = fis.read(b);
				System.out.println(data);
				if(data == -1) break;
				b[idx++] = (byte)data;
			}
			String str = new String(b);
			System.out.println(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
