/**
 * Description: Create a method that accepts a character array and
 *  count the number of times each character is present in the array.
 * @author MANASA KAITHA
 *
 */
import java.util.*;
public class CountCharacterArray {
	public Map<Character,Integer> countCharacter(char[] charArray){
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		//count the number of characters in a given string
		for(int i=0;i<charArray.length;i++) {
			//Accepting the characters and sorting in the array
			if(map.containsKey(charArray[i])) {
				//counting occurance of each character
				map.put(charArray[i], map.get(charArray[i])+1);
			}
			else
			map.put(charArray[i], 1);
		}
		//  returns the map with each character with its count

		return map;
	}
//providing the input string and prints the frequency of each character of a given string
	public static void main(String[] args) {
		 CountCharacterArray exerciseTwo = new  CountCharacterArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(exerciseTwo.countCharacter(str.toCharArray()));
		sc.close();
	}
}
