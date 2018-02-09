/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Empoyee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Empoyee[] empoyees = new Empoyee[3];

		Empoyee empoyee = new Empoyee();

		empoyees[0] = empoyee;



		for (int i = 0; i < empoyees.length; i++) {

		empoyee.setUserNm(NAMEDATA[i]);
		empoyee.setMail(MAILDATA[i]);
		empoyee.setPassword(PASSDATA[i]);
		empoyee.setDepartmentNm(QUATERDATA[0][i]);
		empoyee.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));


		System.out.println(empoyee.userNm);
		System.out.println(empoyee.mail);
		System.out.println(empoyee.password);
		System.out.println(empoyee.departmentNm);
		System.out.println(empoyee.departmentCnt);




		}



	}
}