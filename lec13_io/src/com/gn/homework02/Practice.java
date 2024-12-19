package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice {
	public void method1() {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"나비야1.dat");
		
		try(FileInputStream fis = new FileInputStream(file)){
			
			byte[] b = new byte[(int)file.length()];
			int idx = 0;
			int data;
			
			while(true) {
				data = fis.read(b);
				if(data == -1) break;
				b[idx++] = (byte)data;
			}
			String str = new String(b);
			System.out.println(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void method2() {
		File dir2 = new File("C:\\test\\sub");
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		File file2 = new File(dir2,"나비야2.dat");
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2))){
			byte[] b = new byte[(int)file2.length()];
			byte[] size = new byte[5];
			int idx = 0;
			while(true) {
				int data = bis.read(size);
				if(data==-1) break;
				System.arraycopy(size, 0, b, idx, data);
				idx += data;
			}
			String str = new String(b);
			System.out.println(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
