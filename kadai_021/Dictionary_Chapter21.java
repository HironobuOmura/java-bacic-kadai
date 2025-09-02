package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dictionary;
	
	public Dictionary_Chapter21() {
	dictionary = new HashMap<>();
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウィ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	}

	   public void getMeanings(String[] words) {
		    //String[] results = new String[words.length];
		    for (int i = 0; i < words.length; i++) {
		        //String word = words[i];
		        String mean = dictionary.get(words[i]); // 辞書から意味を取得
		        if (mean == null) {
		            System.out.println(words[i] + "は辞書に存在しません");
		        } else {
		        	System.out.println(words[i] + "の意味は" + mean);
		        }

		    }

		}
		   
		
	}