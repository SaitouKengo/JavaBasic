package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars = new Car[3];

		Car car1 = new Car();
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline = 50;

		Car car3 = new Car();
		car3.color = "Yellow";
		car3.gasoline = 50;

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		final int distance = 300;



		System.out.println(car1.color + " " + car2.color + " " + car3.color);


		for (int i = 0; i < cars.length; i++) {
			int sum = 0;
			int co = 0;

			while(true) {
				int ru = cars[i].run();

				co++;
				sum += ru;
				System.out.println(sum);

				if(ru == -1) {
					System.out.println(cars[i].color + "は、" + "目的地に到達できませんでした");
					break;
				}

				if(sum >= distance) {
					System.out.println(cars[i].color + "は、" + "目的地まで" + co + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです"
							+ "");
					break;
				}

			}
		}
	}

}

