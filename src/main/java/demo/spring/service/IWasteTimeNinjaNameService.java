package demo.spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class IWasteTimeNinjaNameService implements NinjaNameService {

	private Map<String, String> sounds;
	
	public IWasteTimeNinjaNameService() {
		sounds = new HashMap<String, String>();
		populateSounds();
	}
	
	public String getNinjaName(String firstName, String lastName) {
		StringBuilder sb = new StringBuilder();
		firstName = firstName.toUpperCase();

		for (int i = 0; i < firstName.length(); i++) {
			sb.append(sounds.get(String.valueOf(firstName.charAt(i))));
		}
		String name = sb.toString();
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
	
	private void populateSounds() {
		sounds.put("A", "ka");
		sounds.put("B", "tu");
		sounds.put("C", "mi");
		sounds.put("D", "te");
		sounds.put("E", "ku");
		sounds.put("F", "lu");
		sounds.put("G", "ji");
		sounds.put("H", "ri");
		sounds.put("I", "ki");
		sounds.put("J", "zu");
		sounds.put("K", "me");
		sounds.put("L", "ta");
		sounds.put("M", "rin");
		sounds.put("N", "to");
		sounds.put("O", "mo");
		sounds.put("P", "no");
		sounds.put("Q", "ke");
		sounds.put("R", "shi");
		sounds.put("S", "ari");
		sounds.put("T", "chi");
		sounds.put("U", "do");
		sounds.put("V", "ru");
		sounds.put("W", "mei");
		sounds.put("X", "na");
		sounds.put("Y", "fu");
		sounds.put("Z", "zi");
	}
}
