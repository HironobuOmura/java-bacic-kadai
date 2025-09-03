package kadai_028;

import java.util.HashMap;

public class Janken_Chapter28 {
	private char choice;
	public String mychoice;
	public String cpchoice;
	public String mychoice2;
	public String cpchoice2;
	public String Myname;
	public String cpname;
	
	public String getMyChoice (String input) {
//		public void getMyChoice (String input) {
		char firstChar = input.charAt(0);
		this.choice = Character.toLowerCase(firstChar);
//		System.out.println( choice);
		        switch (choice) {
		        case 'r':
		            mychoice = "rock";
		            break;
		        case 's':
		            mychoice = "scissors";
		            break;
		        case 'p':
		            mychoice = "paper";
		            break;
		        default:
		            mychoice = "unknown";
		            break;
		           
		        }
		        return mychoice;
		        //System.out.println( mychoice);
		    }
	
	public String getRandom() {

			HashMap<Integer, String> dictionary;
			int cpc = (int)Math.floor(Math.random() * 3);
			dictionary = new HashMap<>();
			dictionary.put(0,"rock");
			dictionary.put(1,"scissors");
			dictionary.put(2,"paper");
			cpchoice = dictionary.get(cpc);
			//System.out.println(cpchoice);
			return cpchoice;
			}

		
		
	public void playGame (String mychoice2 , String cpchoice2) {
		switch(mychoice2) {
		case "rock":
			Myname = "自分の手はグー";
			break;
		case "scissors":
			Myname = "自分の手はチョキ";
			break;
		case "paper":
			Myname = "自分の手はパー";
			break;
		default:
			Myname = "invalid";
			break;
		}

		switch(cpchoice2) {
		case "rock":
			cpname = "対戦相手の手はグー";
			break;
		case "scissors":
			cpname = "対戦相手の手はチョキ";
			break;
		case "paper":
			cpname = "対戦相手の手はパー";
			break;
		default:
			cpname = "invalid";
			break;
		}

		System.out.println(Myname+ "," + cpname);
		
		if(mychoice.equals(cpchoice)) {
			System.out.println("あいこです");
		}else if((mychoice.equals("rock") && cpchoice.equals("scissors")) ||
				(mychoice.equals("paper") && cpchoice.equals("rock")) ||
				(mychoice.equals("scissors") && cpchoice.equals("paper"))) {
			System.out.println("自分の勝ちです");
		}else {System.out.println("自分の負けです");
		}
		
//		System.out.println(mychoice2.length());
//		System.out.println(cpchoice2.length());
/*		if(mychoice2.length() - cpchoice2.length() == 0) {
			System.out.println("あいこです");
			}else if(mychoice2.length() - cpchoice2.length() == 1 ||
					mychoice2.length() - cpchoice2.length() == 3 ||
					cpchoice2.length() - mychoice2.length() == 4){
				System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
*/		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
