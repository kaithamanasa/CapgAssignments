/**
 * Description: : Create a method which accepts a hash map 
 * and return the values of the map in sorted order as a List.
 * @author MANASA KAITHA
 *
 */
import java.util.*;
public class SortedHashMap {
	
	public static void main(String[] args) {
		//Todo auto generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		//creating a list and providing variable which stores sorted list.
		hashMap.put(1, "Manasa");
		hashMap.put(2, "praveen");
		hashMap.put(3, "aravindh");
		hashMap.put(4, "raaj");
		//sorting the HashMap values
		List<String> sortedHashMap = new ArrayList<String>();
		sortedHashMap = getValues(hashMap);
		System.out.println(sortedHashMap);

	}
	//Accepts the map as parameter and returns sorted list.
	private static List<String> getValues(HashMap<Integer, String> hashMap) {

		List<String> sortedHashMap = new ArrayList<String>();
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		Collections.sort(sortedHashMap);

		return sortedHashMap;
	}

}