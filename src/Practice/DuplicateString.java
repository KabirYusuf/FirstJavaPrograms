package practice;

public class DuplicateString {
    public static void main(String[] args) {
        System.out.println(duplicateString("xyz"));
    }


    public static String duplicateString(String word){
        StringBuilder newWord = new StringBuilder(word);
        int wordLength = newWord.length();
        String duplicates = "";
        for (int i = 0; i < wordLength; i++) {
            for (int j = i + 1; j < wordLength; j++) {
                if(newWord.charAt(i) == newWord.charAt(j)){
                    duplicates += newWord.charAt(i);
                    newWord.deleteCharAt(j);
                    wordLength--;

                }
            }
        }

        return duplicates;
    }
}
