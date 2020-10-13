import java.util.Scanner;

public class DictionaryManagement {
    /**
     * phuong thuc nhap du lieu tu dien tu tep.
     */
    public void insertFromFile(){

    }

    /**
     * phuong thuc nhap du lieu tu commandline.
     */
    public static void insertFromCommandline(){
        System.out.println("nhap so tu: ");
        Scanner sc = new Scanner(System.in);
        Dictionary.numberOfWord = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < Dictionary.numberOfWord; i++){
            System.out.println("nhap tu: ");
            String wordTarget = new String();
            wordTarget = sc.nextLine();
            System.out.println("giai nghia: ");
            String wordExplain = new String();
            wordExplain = sc.nextLine();
            Dictionary.setDictionary(wordTarget,wordExplain,i);
        }
    }
}
