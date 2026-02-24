package dsa;
import java.util.*;
public class Hashmap {
	public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();

	map.put("china",120);
	map.put("india",130);
	
	
	System.out.println(map);
	if(map.containsKey("india")) {
	System.out.println("key is present ");}
	else {
		System.out.println("key not present");
	}
	
	System.out.println(map.get("china"));
	System.out.println(map.get("india"));
	
	
	
	for(Map.Entry<String,Integer>e:map.entrySet()){
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		
	}
	
	
	//keySet
	Set<String> keys=map.keySet();
	for(String key:keys) {
		System.out.println(key+" "+ map.get(key));
	}
	
	
	map.remove("china");
	System.out.println(map);
}
}