package core.basic;

import java.util.Arrays;

public class InsuranceCost {

	public static void main(String[] args) {
		int[] weightList = {20,10,5,40,20,41,41,2,6,7,3,4,5,6,23,34,7,8,2,2};
		Arrays.sort(weightList);		
		System.out.println("Insurance Cost: "+getInsuranceCost(weightList));
	}
	
	public static float  getInsuranceCost(int[] weightList){
		float insuranceCost=0;
		for(int i=0;i<weightList.length;i++){
			if(i==weightList.length-1){
				insuranceCost+=weightList[i]*3.5;
			}else{
				insuranceCost+=weightList[i]*2;
			}
		
		}
		return insuranceCost;
	}

}
