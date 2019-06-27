import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
	private String anagram;
	public Anagram(String anagram) {
		this.anagram = anagram;
	}

	public List<String> match(List<String> asList) {
		List<String> res = new ArrayList<String>();
		char[] arr1 = anagram.toLowerCase().toCharArray();
		char[] arr2;
		for(String s: asList) {
			arr2 = s.toLowerCase().toCharArray();
			if(!anagram.toLowerCase().equals(s.toLowerCase())) {
				String palabra1;
				String palabra2;
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				palabra2 = String.valueOf(arr2);
				palabra1 = String.valueOf(arr1);
				if(palabra1.equals(palabra2)) {
					res.add(s);
				}
			}	
		}
		return res;
	}
}
