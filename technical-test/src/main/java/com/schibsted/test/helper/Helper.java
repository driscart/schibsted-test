package com.schibsted.test.helper;

import java.util.HashMap;
import java.util.Map;

public class Helper {
	
	private static Helper inst;
	
	public static Helper getInstance() {
		if (inst == null) {
			inst = new Helper();
		}
		return inst;
	}
	
	public Map<String, String> getRolesPages() {
		Map<String, String> rolesPages = new HashMap<String, String>();
		rolesPages.put("PAG_1", "1");
		rolesPages.put("PAG_2", "2");
		rolesPages.put("PAG_3", "3");
		return rolesPages;
	}

}
