/**
 * Description: Accepts a list of numbers and return their squares
 * @author MANASA KAITHA
 *
 */
import java.util.*;
public class HashSquareNumber {
	public Map<Integer,Integer> getSquares(int[] array) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		//returns square of a number
		for(int i=0;i<array.length;i++) {
			map.put(array[i], (int) Math.pow(array[i], 2));
		}
		return map;
	}
	public static void main(String[] args) {
		HashSquareNumber exerciseThree = new HashSquareNumber();
		//creating the list of array and printing the Square of each given number
		int[] array = new int[] {1,2,3,4,5};
		System.out.println(exerciseThree.getSquares(array));
	}
}
