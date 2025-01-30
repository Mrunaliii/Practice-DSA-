import java.util.ArrayList;
import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        String[] str = {"aab", "scb", "mmn", "mnp", "cdd", "ppr"};
		String cmp = "ddf";
		
		HashMap<Character, Integer> cmap = fillmap(cmp);	
		HashMap<Character, Integer> smap = new HashMap<>();
		
		ArrayList<String> arr = new ArrayList<>();
		
		System.out.println("Given Strings are : ");
		for(int i=0;i<str.length;i++) {
			System.out.print(" "+str[i]);
		}
		
		System.out.println("\n\nCompare to : "+cmp);
		
		for(int i=0;i<str.length;i++) {
			smap = fillmap(str[i]);
			boolean x = isIsomorphic(cmap, smap, cmp, str[i]);
			if(x==true) {	arr.add(str[i]);	}
		}
		
		System.out.println("\nIsomorphic Strings are : "+arr);

    }

    private static boolean isIsomorphic(HashMap<Character, Integer> cmap, HashMap<Character, Integer> smap, String a, String b) {
		for(int i=0;i<cmap.size();i++) {
			if(cmap.get(a.charAt(i))!=smap.get(b.charAt(i))) {	return false;}
		}
		
		return true;
	}
	private static HashMap<Character, Integer> fillmap(String a) {
		
		HashMap<Character, Integer> amap = new HashMap<>();
		for(int i=0;i<a.length();i++) {
			if(amap.containsKey(a.charAt(i))) {
				int m = amap.get(a.charAt(i))+1;
				amap.put(a.charAt(i), m);
			}
			else {
				amap.put(a.charAt(i), 1);
			}
		}
		return amap;
	}
}
