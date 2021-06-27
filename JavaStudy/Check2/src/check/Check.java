package check;

import constants.Constants;

public class Check {

	// フィールド変数
	private static String firstName = "有田";
	private static String lastName = "尚史";

	public static void main(String[] args) {

		//インスタンス	
		Check check = new Check(firstName, lastName);
		check.printName();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotoPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotoPet.introduce();

	}

	// コンストラクタ
	public Check(String first_Name, String last_Name) {
		Check.firstName = first_Name;
		Check.lastName = last_Name;
	}

	//メソッド	
	private void printName() {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}

}
