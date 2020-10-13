public class DictionaryCommandline {
    /**
     * phuong thuc show toan bo tu dien.
     * @param dictionary: mang tu.
     */
    public static void showAllWords(Word dictionary[]){
        for(int i = 0; i < Dictionary.numberOfWord; i++){
            System.out.println(dictionary[i].getWord_target());
            System.out.println(dictionary[i].getWord_explain());
        }
    }

    /**
     * phuong thuc goi ham show va insert.
     * @param sc: string tu commandline.
     */
    public static void dictionaryBasic(String sc){
        if(sc.equals("insertFromCommandline") || sc.equals("1")){
            DictionaryManagement.insertFromCommandline();
        }
        if(sc.equals("showAllWords") || sc.equals("2")){
            showAllWords(Dictionary.dictionary);
        }
    }
}
