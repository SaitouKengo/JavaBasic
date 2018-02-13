/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> players = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                Player player = new Player();
                String[] lines = line.split(",", 0);

                player.setPosition(lines[0]);
                player.setName(lines[1]);
                player.setCountry(lines[2]);
                player.setTeam(lines[3]);

                players.add(player);

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        int i = 0;
        while(i < players.size()) {
	        	if(players.get(i).getTeam().equals("レアル・マドリード")||players.get(i).getTeam().equals("バルセロナ")) {
	        		players.remove(i);
	        		continue;
	        	}
	        	i++;
        }


		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player p:players) {
        		System.out.println(p.toString());
        }


	}
}