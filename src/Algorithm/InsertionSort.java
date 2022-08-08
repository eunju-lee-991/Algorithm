package Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

 class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getScore() {
         return score;
     }

     public void setScore(int score) {
         this.score = score;
     }

     // Getters, Setters 생략
}

public class InsertionSort {
    public static void main(String[] args) {
        int i, j, temp = 0;
        int k = 0;
/*

        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 899));
        players.add(new Player("Bob", 982));
        players.add(new Player("Chloe", 1090));
        players.add(new Player("Dale", 982));
        players.add(new Player("Eric", 1018));

        Collections.sort(players, (a,b) -> b.getScore() - a.getScore());

        players.forEach(s -> System.out.println(s.getName() + ":  " + s.getScore()));
*/

        int[] array = {10,4,6,7,2,9,1,3,5,8};

        for (i = 0; i < 9; i++) {
            for (j = i; j >= 0; j--) {
                k++;
                if(array[j+1] < array[j]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }else {
                   break;
                }
            }
        }

        for (int a : array) {
            System.out.print(a+ " ");
        }


        System.out.print(k+ "k");
    }

    public void test(){
        int temp;

        //int a = temp;
    }
}
