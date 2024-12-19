package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	public void method1(String str) {
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"나비야1.dat");
//		FileOutputStream fos = null;
		try(FileOutputStream fos = new FileOutputStream(file)) {
			 byte[] b = str.getBytes();
			 fos.write(b);
			 fos.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void method2(String str) {
		File dir2 = new File("C:\\test\\sub");
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		File file2 = new File(dir2,"나비야2.dat");
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2))) {
			bos.write(str.getBytes());
			bos.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
