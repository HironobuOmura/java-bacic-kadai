package kadai_015;

public class Car_Chapter15 {
	int gear = 1;
	int speed = 10;

	
	//ギアの変化
	public void changeGear(final int afterGear) {
		int gear = 1;

		System.out.println("ギア" + gear + "から" + afterGear + "に切り替わりました");
		gear = afterGear;
		switch(gear) {
		case 1-> speed = 10;
		case 2-> speed = 20;
		case 3-> speed = 30;
		case 4-> speed = 40;
		case 5-> speed = 50;
		default -> speed = 10;
		}
		
	}
	
	//ギアに見合う時速の表示
	public void run() {
		System.out.println("速度は時速"+ speed + "kmです");
		
		}
	}


