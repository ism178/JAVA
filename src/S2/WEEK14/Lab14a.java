package WEEK14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lab14a {


	public static void main(String[] args) {
		HashMap<String, String> calling = new HashMap<String, String>();

		calling.put("Russell M Nelson", "Prophet");
		calling.put("Carl B Cook", "Seventy");
		calling.put("Jeffrey R Holland", "Apostle");
		calling.put("Dieter F Uchtdorf", "Apostle");
		calling.put("Patrick Kearon", "Seventy");
		calling.put("Ulisses Soares", "Apostle");
		calling.put("Gerald Causse", "Presiding Bishop");


		ArrayList<String> names = new ArrayList<String>(calling.keySet());

		Collections.sort(names);

		for (String key : names) {
			System.out.printf("%s has the calling of %s \n", key, calling.get(key));
		}
	}
}
