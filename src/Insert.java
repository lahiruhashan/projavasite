/**
 * Created by Hashan on 3/27/2018.
 */
public class Insert {
    public static void main(String[] args) {
        //create StringBuilder object
        StringBuilder text = new StringBuilder("I Love ProJavaSite!");
        text.insert(6, " Your");
        System.out.println(text);

        text.insert(23,' ');// inserting a char
        text.insert(24,4);// inserting an int
        text.insert(25, new String(" Times")); // inserting a String object
        System.out.println(text);

        //an exception will be thrown if the index you provide does not exist

        try{
            text.insert(50, "Out Of Bound Text");
            System.out.println(text);
        }catch (Exception ex){
            System.out.println("Error is : " + ex);
        }
    }
}
