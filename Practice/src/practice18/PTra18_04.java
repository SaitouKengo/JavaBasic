/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        List<Player> list = players;
        Collections.shuffle(list);
        int[] count = {0,0,0,0};

        for(int i=0;i<list.size();i++) {
	        	if(list.get(i).getPosition().equals("GK")) {
		        System.out.println(list.get(i));
		        	count[0]++;
		        	if(count[0]==1)
		        	    break;
	        	}
        }

        for(int i=0;i<list.size();i++) {
	        if(list.get(i).getPosition().equals("DF")) {
			    System.out.println(list.get(i));
			    	count[1]++;
			    	if(count[1]==4)
			        break;
		    	}
        }

        for(int i=0;i<list.size();i++) {
	        if(list.get(i).getPosition().equals("MF")) {
		        System.out.println(list.get(i));
		        	count[2]++;
		        	if(count[2]==4)
				        break;
	        }
        }

        for(int i=0;i<list.size();i++) {
	        if(list.get(i).getPosition().equals("FW")) {
		        System.out.println(list.get(i));
		        	count[3]++;
		        	if(count[3]==2)
		        		break;
	      	}
	    }


	}
}
