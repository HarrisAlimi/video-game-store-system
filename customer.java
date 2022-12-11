package AlimiHarrisProject1;

import java.util.*;

/**
 * @author Harris Alimi
 */

public class customer {

    public static void main(String[] args) {

        customerOrder storeOrder = new customerOrder(100, 100, 100); // first element = game category 1, 2nd element
                                                                     // = game category 2, 3rd element = game category 3
        storeOrder.toString();

        Scanner sc = new Scanner(System.in);

        int num = 0;
        do {

            System.out.println("Please select from one of the options below:");
            System.out.println("\t 1. Purchase products");
            System.out.println("\t 2. Check inventory");
            System.out.println("\t 3. Return Video Game(s)");
            System.out.println("\t 4. EXIT KIOSK");

            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("How many copies of game category one would you like? ");
                    int gameCatOne = sc.nextInt();
                    storeOrder.setnumGameCatOne(storeOrder.getnumGameCatOne() - gameCatOne);
                    System.out.println("How many copies of game category two would you like?");
                    int gameCatTwo = sc.nextInt();
                    storeOrder.setnumGameCatTwo(storeOrder.getnumGameCatTwo() - gameCatTwo);
                    System.out.println("How many copies of game category three would you like?");
                    int gameCatThree = sc.nextInt();
                    storeOrder.setnumGameCatThree(storeOrder.getnumGameCatThree() - gameCatThree);
                    buy(gameCatOne, gameCatTwo, gameCatThree);
                    break;
                case 2:
                    System.out.println("Copies of game category one left:  " + storeOrder.getnumGameCatOne());
                    System.out.println("Copies of game category two left: " + storeOrder.getnumGameCatTwo());
                    System.out.println("Copies of game category three left: " + storeOrder.getnumGameCatThree());
                    break;
                case 3:
                    System.out.println("How many copies of game category one would you like to return?");
                    int returnGameCatOne = sc.nextInt();
                    storeOrder.setnumGameCatOne(storeOrder.getnumGameCatOne() + returnGameCatOne);
                    System.out.println("How many copies of game category two would you like to return?");
                    int returnGameCatTwo = sc.nextInt();
                    storeOrder.setnumGameCatTwo(storeOrder.getnumGameCatTwo() + returnGameCatTwo);
                    System.out.println("How many copies of game category three would you like to return?");
                    int returnGameCatThree = sc.nextInt();
                    storeOrder.setnumGameCatThree(storeOrder.getnumGameCatThree() + returnGameCatThree);
                    break;
                case 4:
                    // END THE DO WHILE LOOP
                    break;
                default:
                    System.out.println("ERROR! You must enter 1, 2, 3, 4, or 5.");

            } // END SWITCH CASE
        } while (num != 4);
    }

    public static String buy(int a, int b, int c) {
        int buygameCatOne;
        int buygameCatTwo;
        int buygameCatThree;

        buygameCatOne = a;
        buygameCatTwo = b;
        buygameCatThree = c;

        String order = "You are buying: " + buygameCatOne + " category one game(s)," + buygameCatTwo
                + " category two game(s)" + buygameCatThree + " category three game(s).";

        String total = "Total for the order is: $"
                + ((buygameCatOne * 10) + (buygameCatTwo * 15) + (buygameCatThree * 20));

        System.out.println(order);
        System.out.println(total);
        return order;
    }

    public static String ret(int d, int e, int f) {
        int retgameCatOne;
        int retgameCatTwo;
        int retgameCatThree;

        retgameCatOne = d;
        retgameCatTwo = e;
        retgameCatThree = f;

        String order = "You are returning: " + retgameCatOne + " category one game(s)," + retgameCatTwo
                + " category two game(s)" + retgameCatThree + " category three game(s).";

        String total = "Total refund is: $" + ((retgameCatOne * 10) + (retgameCatTwo * 15) + (retgameCatThree * 20));

        System.out.println(order);
        System.out.println(total);
        return order;
    }

}