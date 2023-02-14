package ex7;

public class WordCount {
    private String word;
    private int count;

    public WordCount(String word) {
        this.word = word;
        count = 1;
    }

    public void increment() {
        count++;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object obj) {
        return word.equals(((WordCount) obj).word);
    }

    public String toString() {
        return word + ": " + count+"\n";
    }


}
