package core.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABC";
		getPermuta(str);
		Student s1=new Student("ps" ,"sad1");
		Student s2=new Student("ps2", "sad2");
		Student s3=new Student("ps3s" ,"sad1");
		Student s4=new Student("ps4", "sad1");
		Student s5=new Student("ps5" ,"sad5");
		Student s6=new Student("ps6", "sad6");
		Set<Student> studentSet = new LinkedHashSet<Student>();
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		studentSet.add(s6);
		System.out.println(studentSet);
		
		
	}
	
	static void getPermuta(String str){
		//StringBuilder s=new StringBuilder(str);
		for(int i =0;i<str.length();i++){
			for(int j=0;j<str.length();j++){
				//if(j>i){
				StringBuilder target=new StringBuilder(str);
					 char c=target.charAt(j);
						target.setCharAt(j, str.charAt(i));
						target.setCharAt(i, c);
						//System.out.println("ith:"+target);
				//}
			}
			//System.out.println("-------------");
		}
	}
}
