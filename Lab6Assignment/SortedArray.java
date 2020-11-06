/**
 * Desc: Return the resulting array after reversing the numbers and sorting it 
 * @author MANASA KAITHA
 *
 */
import java.util.*;

public class SortedArray {
	public static void main(String args[]) {
		//providing the list of array and getting sorted
		List<Integer> result=new ArrayList<>(Arrays.asList(14,12,8,9,4,3,7));
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array:\n "+reverse);
	}
	private static List<Integer> getSorted(List<Integer> result) {
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		//reversing  the array list
		Collections.reverse(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array:\n "+reverseSorted);
		 //sorting the reversed array list
		 Collections.sort(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 return reverseSorted;
	}
	}
