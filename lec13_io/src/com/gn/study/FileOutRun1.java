package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun1 {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		// 2. 파일 생성
		File file = new File(dir,"sample1.dat");
		// 3. FileOutputStream 생성
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			// 4. 출력할 데이터 구성
			String str = "hello"; // sample1.dat에 들어감
			byte[] arr = str.getBytes(); // byte단위로 바꿔줌(반환형O)
			// 5. 출력
			out.write(arr);
			// 6. 플러싱(선택) flush
			out.flush(); // 흔적 비우기
			System.out.println(file.length()+"크기의 "+file.getParent()+" 파일생성");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 7. 스트림 닫기 close()
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
