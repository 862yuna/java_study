package com.gn.practice01;

import java.io.File;

public class Practice {
	public void deleteFile(File dir) {
//		File path = new File("C:\\test\\sub");
		File[] files = dir.listFiles();
		for(File f : files) {
			if(f.isFile()) {
				String fileName = f.getName();
//				String dirName = dir.toString()+"\\";
//				fileName = fileName.replace(dirName, "");
				System.out.println(fileName+" 파일 삭제");
				f.delete();
			}
		}
	}
}
