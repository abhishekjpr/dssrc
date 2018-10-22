package com.abhishek.questions.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Java program to print all combination of size r in an array of size n
class Combination {

	static List<String> list = new ArrayList<>();

	static int validCounter = 0;

	static int matchCount = 0;

	static void combinationUtil(int arr[], int data[], int start, 
								int end, int index, int r) 
	{
		String str = new String();
		// Current combination is ready to be printed, print it 
		if (index == r) {
			for (int j=0; j<r; j++) 
				str += data[j];
			list.add(str);
			System.out.println(""); 
			return; 
		} 

		for (int i=start; i<=end && end-i+1 >= r-index; i++) {
			data[index] = arr[i]; 
			combinationUtil(arr, data, i+1, end, index+1, r); 
		} 
	} 

	static void printCombination(int arr[], int n, int r) 
	{
		int data[]=new int[r];
		combinationUtil(arr, data, 0, n-1, 0, r); 
	} 

	/*Driver function to check for above function*/
	public static void main (String[] args) { 
		int arr[] = {1, 2, 3, 4, 5};
		int r = 2; 
		int n = arr.length; 
		printCombination(arr, n, r);
		getRandomMatches(arr, list);
		if (validCounter != matchCount)
			System.out.println("Not Possible.");
	}

	//basic approach
	private static void getRandomMatches(int[]arr, List<String> list) {
		System.out.println("Total Teams : "+arr.length);
		int numOfMatched = ((arr.length)*(arr.length-1))/2;
		matchCount = numOfMatched;
		System.out.println("Total number of matches : "+numOfMatched);
		int maxNumberOfDays = (numOfMatched%2==0) ? numOfMatched/2 : (numOfMatched/2)+1;
		System.out.println("Total number of days : "+maxNumberOfDays);
		for(int i = 1; i <= maxNumberOfDays; ++i){
			System.out.print("\nDay "+i+" --> ");
			HashMap<Character, Character> map = new HashMap<>();
			int j = 0;
			int teamCount = 0;
			int count = 0;
			while (!list.isEmpty()){
				String getCombination = "";
				if(j >= list.size())
					break;
				getCombination = (String) list.get(j);
				if(count == 0) {
					validCounter++;
					list.remove(getCombination);
					j = 0;
					teamCount++;
					map.put(getCombination.charAt(0), getCombination.charAt(0));
					map.put(getCombination.charAt(1), getCombination.charAt(0));
					++count;
					System.out.print(getCombination+", ");
				}
				else if(teamCount == 2){
					break;
				} else if(teamCount < 2){
					char x = getCombination.charAt(0);
					char y = getCombination.charAt(1);
					if(map.containsKey(x) || map.containsKey(y)){
						++j;
					} else {
						System.out.println(getCombination);
						teamCount++;
						validCounter++;
						list.remove(getCombination);
					}
				}
			}
		}
	}
} 

/* This code is contributed by Devesh Agrawal */
