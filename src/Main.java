public class Main {
    public static void main(String[] args) {
        //create StringBuilder object
        StringBuilder text = new StringBuilder("I Love ProJavaSite!");
        text.append(" ").append("Forever");//appending a string
        System.out.println(text);

        StringBuilder text1 = new StringBuilder("I Love ProJavaSite!");
        text1.append(" ").append('a');//appending a character
        System.out.println(text1);

        StringBuilder text2 = new StringBuilder("I Love ProJavaSite!");
        text2.append(" ").append(true);// appending a boolean value
        System.out.println(text2);

        StringBuilder text3 = new StringBuilder("I Love ProJavaSite!");
        text3.append(" ").append(458.266);// appending a floating value
        System.out.println(text3);

        StringBuilder text4 = new StringBuilder("I Love ProJavaSite!");
        text4.append(" ").append(new StringBuffer("So Much")); // appending a StringBuffer
        System.out.println(text4);
    }
}
