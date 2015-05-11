package core.basic;

import java.util.*;

public class ScholorShip {
	/**
	 Problem Statement 3
	 */
	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<Student>();
		for(int i=0;i<20;i++){
			String firstName="pramod"+i;
			String lastName="sharma"+((int)(Math.random()*20)); 
			studentList.add(new Student(firstName,lastName));
		}
		System.out.println("Total Student List: "+studentList);
		System.out.println("Student List From Distinct Family:\n "+findStudentFromDistinctLastName(studentList));
		System.out.println("Number of Student From same Family\n"+getStudentListFromSameFamily(studentList));
	}
	
	public static List<Student> findStudentFromDistinctLastName(List<Student> studentList){
		return new ArrayList<Student>(new LinkedHashSet<Student>(studentList));		
	}
	
	public static Map<String,Integer> getStudentListFromSameFamily(List<Student> list){
		Map<String,Integer> studentFamilyMap = new LinkedHashMap<String, Integer>();
		for(int i=0;i<list.size();i++){
			if(studentFamilyMap.containsKey(list.get(i).getLastName())){
				studentFamilyMap.put(list.get(i).getLastName(), studentFamilyMap.get(list.get(i).getLastName())+1);
			}else{
				studentFamilyMap.put(list.get(i).getLastName(), 1);
			}
		}
		return studentFamilyMap;
	}

}
