package core.basic;

import java.util.*;



public class First {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2305,9,5,107,100};
		Arrays.sort(arr);
		int len=((arr[arr.length-1])+"").length();
		String paddingRight ="%-"+len+"s";
		List<String> numList= new ArrayList<String>();
		for(int i=0;i<arr.length;i++){
			numList.add(String.format(paddingRight,""+arr[i]).replace(' ','*'));			
		}
		Collections.sort(numList);
		System.out.println("asc:"+numList);
		Collections.reverse(numList);
		System.out.println("desc:"+numList);
		String max="";
		for(int j=0;j<numList.size();j++){
			max+=numList.get(j);
		}
		System.out.println("max: "+(max.replace("*", "")));		
	}
	 
}	
