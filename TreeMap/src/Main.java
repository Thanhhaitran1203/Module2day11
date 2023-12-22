import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class Main {
    public static void main(String[] args) {
        String text = "Over time, computer engineers take advantage of each other's work and invent algorithms for new things. Algorithms combine with other algorithms to utilize the results of other algorithms, in turn producing results for even more algorithms.";
        text = text.replaceAll("\\p{Punct}", "");
        text = text.toLowerCase();
        String[] wordArr = text.split(" ");
        Map<String, Integer> wordCount = new TreeMap<>();

        // Collect the word count
        for (String word : wordArr) {
            if(!wordCount.containsKey(word)){
                wordCount.put(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }
        System.out.println(wordCount);
//        Iterator<Entry<String, Integer>> iter = wordCount.entrySet().iterator();
//        System.out.println("Output: ");
//        while(iter.hasNext()) {
//            Entry<String, Integer> entry = iter.next();
//            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}