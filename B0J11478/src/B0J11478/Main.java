package B0J11478;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		Set<String> set = new HashSet<>();
		for (int j = 0; j < input.length() - 1; j++) {
			for (int i = j+1; i < input.length(); i++) {
				set.add(input.substring(j, i));
			}
		}
		Iterator iterSet=set.iterator();
		while(iterSet.hasNext()){
			System.out.print(iterSet.next()+" ");
		}
		System.out.println();
		System.out.println(set.toString());
		System.out.print(set.size());
	}
}
