package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dictionary;
	
	public Dictionary_Chapter21() {
	dictionary = new HashMap<>();
	dictionary.put("apple","りんご");
//	dictionary.put("peach","桃");
//	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウイ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("mascat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	}
	
	
	   public String getMeaning(String word) {
	        String value = dictionary.get(word);
	        if (value == null) {
	            return "見つかりません";
	        }
	        return value;
	    }
	}