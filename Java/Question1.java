package assignment;

import java.util.*;

public class Question1 {
	//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
	
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> li = Arrays.asList(arr);
		Collections.shuffle(li);
		li.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
