package check;

import constants.Constants;

public class Check {

	// フィールド変数
	private static String firstName ="有田" ;
	private static String lastName ="尚史";

	public static void main(String[] args) {

		//インスタンス	
		String name = printName(firstName, lastName);
		System.out.println("printNameメソッド → " + name);
		

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotoPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotoPet.introduce();

	}

	//メソッド	
	private static String printName(String x, String y) {
		return x + y;
	}

}
