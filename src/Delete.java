/**
 * Created by Hashan on 3/27/2018.
 */
public class Delete {
    public static void main(String[] args) {
        //create StringBuilder object
        StringBuilder text = new StringBuilder("I Love ProJavaSite!");
        text.delete(7,10); //removing 'Pro' sub string
        System.out.println(text);

        //creating another StringBuilder object
        StringBuilder text2 = new StringBuilder("All Around The World");
        text2.delete(0, text2.length());
        System.out.println("The result is : " + text2); // removing all the characters form the phrase.
    }
}
