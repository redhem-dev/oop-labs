package QUIZ1_Preperation;

public class Task2Try2 {
    public static void main(String[] args) {

        String newwstring = "Salih i Giga su proslo sve predmete sa prve godine.";
        printWordsFromSentence(newwstring);

    }

    public static void printWordsFromSentence(String str){

        String[] newstr = str.split(" ");

        for (String w : newstr){
            System.out.println(w);
        }

    }
}
