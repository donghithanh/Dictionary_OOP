public class Dictionary {
    /**
     * class luu tu dien
     */
    static Word[] dictionary = new Word[1000];
    static int numberOfWord ;

    /**
     * tao tu thu i trong mang tu.
     * @param word_target tu.
     * @param word_explain nghia cua tu.
     * @param i bien dem.
     */
    public static void setDictionary(String word_target, String word_explain, int i) {
        dictionary[i] = new Word(word_target,word_explain);
    }
}
