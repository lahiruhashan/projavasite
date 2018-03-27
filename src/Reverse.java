/**
 * Created by Hashan on 3/27/2018.
 */
public class Reverse {
    public static void main(String[] args) {
        //creating another StringBuilder object
        StringBuilder text = new StringBuilder("Can You Reverse Me");
        text.reverse(); // reversing
        System.out.println("Reversed Text : " + text);

        //creating another StringBuilder object
        StringBuilder text1 = new StringBuilder("trap");
        text1.reverse();
        System.out.println("This is the best " + text1);
    }
}
