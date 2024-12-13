package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {
	public static void main(String[] args) {
		Map<String,Information> informationMap = new HashMap<String,Information>();
		
		informationMap.put("Tom", new Information("555-123-4567",4600000));
		informationMap.put("John", new Information("123-456-7890",3800000));
		informationMap.put("Emma", new Information("987-654-3210",2300000));
		System.out.println("변경전 : "+informationMap);
		
		// map.put("John", new Information("123-456-7890",4100000));
		informationMap.get("John").setSalary(4100000);
		//(1) Emma가 전화번호를 바꿨어요.-> 111-111-1111
		informationMap.get("Emma").setPhone("111-111-1111");
		// (2) Emma 정보 출력 -> getter
		System.out.println("==== Emma의 정보 ====");
		System.out.println("전화번호 : "+informationMap.get("Emma").getPhone());
		System.out.println("월급 : "+informationMap.get("Emma").getSalary());
		
		informationMap.put("John", new Information("123-456-7890",4100000));
		System.out.println("변경후 : "+informationMap);
		
	}

}
