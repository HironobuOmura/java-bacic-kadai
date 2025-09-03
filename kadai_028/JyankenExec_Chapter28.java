package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Janken_Chapter28 input = new Janken_Chapter28();
		
		System.out.println("自分のじゃんけんの手を入力してみましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String mychoice="";
		int i = 1;
		while(i == 1) {
		Scanner scanner = new Scanner(System.in);
		
		String myinput = scanner.nextLine();
		
		if(myinput.equals("r") ||myinput.equals("s") ||myinput.equals("p")) {
			i++;
			mychoice = input.getMyChoice(myinput);
			break;
			}
		System.out.println("再度入力してください");
		}
//		System.out.println(mychoice);
		String cpchoice = input.getRandom();
//		System.out.println(cpchoice);
		input.playGame(mychoice,cpchoice);
		
		//System.out.println(input);
		
//		scanner.close();

	}

}
