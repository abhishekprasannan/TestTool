package hR_2017;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingComparator {

}
class Checker implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Player player1 = (Player)o1;
		Player player2 = (Player)o2;
		int score1 = player1.score;
		int score2 = player2.score;
		String name1 = player1.name;
		String name2 = player2.name;
		if(score1 > score2){
			return -1;
		}
		else if(score1 < score2){
			return 1;
		}
		else{
			return name2.compareTo(name1);
		}
		
	}
	
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}