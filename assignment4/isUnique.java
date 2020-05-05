//Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if no two keys map
//to the same value(and false if any two  or more keys do map to the same value).For example, if the map contains the following
//key/value pairs, your method would return true:{Marty=Strepp,Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}.But
// calling it on the following map would return false, because of two mappings for Perkins and Reges:{Kendrick=Perkins, 
//Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}.
//David Barnette
//05/05/2020

import java.util.*;

public class assignment4 {
  public static void main(String[] args) {
		Map<String, String> mainMap = new HashMap<String, String>();
		Map<String, String> mainMap2 = new HashMap<String, String>();
		mainMap.put("Marty", "Stepp");
		mainMap.put("Stuart", "Reges");
		mainMap.put("Jessica", "Miller");
		mainMap.put("Amanda", "Camp");
		mainMap.put("Chelsea", "Jansen");
		
		//Separate HasMap that should come out false
		mainMap2.put("Marty", "Stepp");
		mainMap2.put("Stuart", "Reges");
		mainMap2.put("Charolette", "Jansen");
		mainMap2.put("Jessica", "Miller");
		mainMap2.put("Amanda", "Camp");
		mainMap2.put("Chelsea", "Jansen");
		
		System.out.println(isUnique(mainMap));
		System.out.println(isUnique(mainMap2));

	}
	//takes a map as a string, creates a HashSet
	public static boolean isUnique(Map<String, String> map) {
		    HashSet<String> unique = new HashSet<String>();

		    for(String key : map.keySet()) {
		        String value = map.get(key);
			    
		       	if(unique.contains(value)){
		            return false;
			}
                	unique.add(value);
		    }

		    return true;
	}

}
