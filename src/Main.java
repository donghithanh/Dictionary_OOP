import java.util.Scanner;

public class Main {
    /**
     * phuong thuc main test.
     * @param arg .
     */
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        DictionaryCommandline.dictionaryBasic(text);
        text = sc.nextLine();
        DictionaryCommandline.dictionaryBasic(text);
    }
}
