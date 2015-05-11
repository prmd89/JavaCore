package core.basic;

import java.util.*;

public class Frequency {

	/**
	 * @param args
	 *///
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "ddzzzzhjkeeeekkmmlllll";
		char[] charArray = inputString.toCharArray();
		Map <Character,Integer> charFrequencyMap = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++){
			if(charFrequencyMap.containsKey(charArray[i])){
				charFrequencyMap.put(charArray[i], charFrequencyMap.get(charArray[i])+1);
			}else {
				charFrequencyMap.put(charArray[i], 1);
			}
		}
		System.out.println(charFrequencyMap);
	}

}
