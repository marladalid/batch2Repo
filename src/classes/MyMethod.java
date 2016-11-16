package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B208 on 11/12/2016.
 */
public class MyMethod {
    /*public int getNumSubjects(boolean student, boolean working) {
        int numSubjects = 6;
        if (!working) {
            numSubjects = student ? 7 : 5;
        }
        return numSubjects;

    }*/
    /*public static int loop() {
        int n = 1;
        int sum = 0;
        while (n <= 6) {
            sum = sum + n;
            n++;
        }
        return sum;
    }*/

    /*public static void loop(int n, int sum) {
        while (n <= 6) {
            sum += n;
            n++;
        }
        System.out.println("Sum = " + sum);
    }*/

    /*public static void loop(int n, int prints) {
        do {
            System.out.print("[" + n + "] ");
            n++;
        }
        while (n <= prints);
    }*/

    /*public static void loop(int n, int prints) {
        do {
            System.out.print("[" + n + "] ");
            n++;
        }
        while (n <= prints);
    }*/

    public static String getFriends(int i) {
        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Gart");
        myFriends.add("Mark");
        myFriends.add("Marl");
        myFriends.add("Wayn");
        myFriends.add("Fred");

        Random rand = new Random();
        int n = rand.nextInt(i);

        String randFriend;
        randFriend = "" + myFriends.get(n) + "";
        return randFriend;
    }
    public static String getFriends2(int i) {
        List<String> myFriends2 = new ArrayList<String>();
        myFriends2.add("Sheena");
        myFriends2.add("Maria");
        myFriends2.add("Coleen");
        myFriends2.add("Anne");
        myFriends2.add("Angel");

        Random rand2 = new Random();
        int n2 = rand2.nextInt(i);

        String randFriend2;
        randFriend2 = "" + myFriends2.get(n2) + "";
        return randFriend2;
    }
    public static String getRelation(int i) {
        List<String> myRelation = new ArrayList<String>();
        myRelation.add(" hates ");
        myRelation.add(" loves ");
        myRelation.add(" is in a relationship with ");
        myRelation.add(" is comfortable with ");
        myRelation.add(" likes ");

        Random rand3 = new Random();
        int x = rand3.nextInt(i);

        String relation;
        relation = "" + myRelation.get(x) + "";
        return relation;
    }
}
