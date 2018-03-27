/**
 * Created by Hashan on 3/27/2018.
 */
public class Delete {
    public static void main(String[] args) {
        /**
         * delete method
         */
        //create StringBuilder object
        StringBuilder text = new StringBuilder("I Love ProJavaSite!");
        text.delete(7,10); //removing 'Pro' sub string
        System.out.println(text);

        //creating another StringBuilder object
        StringBuilder text2 = new StringBuilder("All Around The World");
        text2.delete(0, text2.length());// removing all the characters form the phrase.
        System.out.println("The result is : " + text2);

        /**
         * deleteCharAt method
         */
        //creating another StringBuilder object
        StringBuilder text3 = new StringBuilder("Please Delete Only This 'C'");
        text3.deleteCharAt( (text3.length() - 2) ); // removing C
        System.out.println(text3);

        text3.deleteCharAt(24);//removes the first quote
        text3.deleteCharAt(24);//removes the remaining quote
        System.out.println(text3);
    }
}
