package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName;
	public String givenName;
	public String address = "東京都中野区〇×";
	

	abstract void eachInstroduce();
	
	public void commonIntroduce() {
		System.out.println("住所は" +address+ "です");
	}
	public void execIntroduce() {
		
	}

}
