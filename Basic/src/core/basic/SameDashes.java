package core.basic;

public class SameDashes {

	public static void main(String[] args) {
		String string1="abc dsfg jipj  ohgk";
		String string2="ghv yutr bjhj  o";
		String string3="abc dsfg jipj  o";
		String string4="abcv sfg jipj  o";
		System.out.println(sameDashes(string1,string2));
		System.out.println(sameDashes(string3,string4));
	}
	public static boolean sameDashes(String string1,String string2){
		
		String[] stringArray1=string1.split(" ");
		String[] stringArray2=string2.split(" ");
		if(stringArray1.length==stringArray2.length){
			for(int i=0;i<stringArray1.length-1;i++){
				if(stringArray1[i].length()!=stringArray2[i].length()) return false;
			}
			return true;
			
		}
		return false;
	}
}
