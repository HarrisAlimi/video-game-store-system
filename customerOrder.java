/**
 * @author Harris Alimi
 */
package AlimiHarrisProject1;

public class customerOrder {

    private int numGameCatOne = 0;
    private int numGameCatTwo = 0;
    private int numGameCatThree = 0;

    public customerOrder(int numGameCatOne, int numGameCatTwo, int numGameCatThree) {
        this.numGameCatOne = numGameCatOne;
        this.numGameCatTwo = numGameCatTwo;
        this.numGameCatThree = numGameCatThree;
    }

    public int getnumGameCatOne() {
        return this.numGameCatOne;
    }

    public void setnumGameCatOne(int valGameCatOne) {
        if (numGameCatOne < 0) {
            System.out.println("Error!");
            return;
        }
        this.numGameCatOne = valGameCatOne;
    }

    public int getnumGameCatTwo() {
        return this.numGameCatTwo;
    }

    public void setnumGameCatTwo(int valGameCatTwo) {
        if (numGameCatTwo < 0) {
            System.out.println("Error!");
            return;
        }
        this.numGameCatTwo = valGameCatTwo;
    }

    public int getnumGameCatThree() {
        return this.numGameCatThree;
    }

    public void setnumGameCatThree(int valGameCatThree) {
        if (numGameCatThree < 0) {
            System.out.println("Error!");
            return;
        }
        this.numGameCatThree = valGameCatThree;
    }

    public String toString() {
        return "customerOrder{" + "number of game category one copies:" + numGameCatOne
                + "number of game category two copies: " + numGameCatTwo + "number of game category three copies: "
                + numGameCatThree + '}';
    }

}
