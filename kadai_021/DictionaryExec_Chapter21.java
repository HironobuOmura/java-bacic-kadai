package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();

		
//		dict.getMeaning("apple");
//		dict.getMeaning("banana");

		String result1 =dict.getMeaning("apple");
		String result2 =dict.getMeaning("banana");
		String result3 =dict.getMeaning("grape");
		String result4 =dict.getMeaning("orange");
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
				

}
