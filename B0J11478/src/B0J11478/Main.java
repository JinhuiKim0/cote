package B0J11478;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		Set<String> set = new HashSet<>();
		for (int j = 0; j < input.length() - 1; j++) {
			for (int i = j; i < input.length(); i++) {
				set.add(input.substring(j, i));
			}
		}
		System.out.print(set.size());
	}
}
