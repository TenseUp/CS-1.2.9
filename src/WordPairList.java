import java.util.ArrayList;
public class WordPairList {

    private ArrayList<WordPair> allPairs = new ArrayList<WordPair>();;


    public WordPairList(String[] words) {
        for (int i = 0; i < words.length - 1; i++) for (int j = i + 1; j < words.length; j++) {
                WordPair p = new WordPair(words[i], words[j]);
                allPairs.add(p);
            }
    }

    public int numMatches() {
        int c = 0;
        for (WordPair i : allPairs) if (i.getFirst().equals(i.getSecond())) c++;
        return c;
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }
}