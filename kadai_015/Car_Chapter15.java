package kadai_015;

public class Car_Chapter15 {

	private int speed;

	//ギアの変化
	public void changeGear(final int gear) {

		int afterGear = gear;
		System.out.println("ギア1から" + afterGear + "に切り替わりました");
		int speed;
		switch(gear) {
		case 1-> speed = 10;
		case 2-> speed = 20;
		case 3-> speed = 30;
		case 4-> speed = 40;
		case 5-> speed = 50;
		default -> speed = 10;
		}
		this.speed = speed;
		
		
	}
	
	//ギアに見合う時速の表示
	public void run(final int gear) {
		System.out.println("速度は時速"+ speed + "kmです");
		
		}
	}


