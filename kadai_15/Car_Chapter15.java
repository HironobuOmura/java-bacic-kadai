package kadai_15;

public class Car_Chapter15 {
	
	//初期値
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15(int gear) {
		this.gear =gear;
	}

	

	//ギアの変化
	public void changeGear(final int gear) {

		int afterGear = gear;
		System.out.println("ギア1から" + afterGear + "に切り替わりました");
		
	}
	
	//ギアに見合う時速の表示
	public void run(final int gear) {

		switch(gear){
		case 1 -> System.out.println("速度は時速10kmです");
		case 2 -> System.out.println("速度は時速20kmです");
		case 3 -> System.out.println("速度は時速30kmです");
		case 4 -> System.out.println("速度は時速40kmです");
		default -> System.out.println("速度は時速50kmです");
					
		}
	}

}
