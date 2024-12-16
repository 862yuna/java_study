package com.gn.practice04;

public class Practice {
	public Practice() {}
	
	public String deleteBlank(String result) {
		result = result.trim();
		result = result.replace(" ", "");
		return result;
	}

}
