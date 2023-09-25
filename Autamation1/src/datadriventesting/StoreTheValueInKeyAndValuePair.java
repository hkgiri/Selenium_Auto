package datadriventesting;

import java.util.ArrayList;
import java.util.HashMap;

public class StoreTheValueInKeyAndValuePair {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("https://demo.actitime.com/");
		al.add("admin");
		al.add("admin@gmail.com");
		al.add("manager");
		System.out.println(al.get(2));
		//drawback of ArrayList we go for Map
		HashMap<String, String> hm=new HashMap<>();
		hm.put("url","https://demo.actitime.com/");
		hm.put("username","admin");
		hm.put("email","admin@gmail.com");
		hm.put("password","manager");
		System.out.println(hm.get("password"));
		
	}
}
