package check;

import constants.Constants;

public class Check {

	// フィールド変数
	private static String firstName;
	private static String lastName;

	public static void main(String[] args) {

		//インスタンス	
		Check check = new Check("有田","尚史");
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
