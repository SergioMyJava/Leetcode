package designaddandsearchwordsdatastructure;


import java.util.Arrays;

public class WordDictionary {
    String[] arr;

    public WordDictionary() {
        arr = new String[0];
    }

    public void addWord(String word) {
        String[] newAarr = Arrays.copyOf(arr, arr.length + 1);
        arr = newAarr;
        arr[arr.length - 1] = word;
    }

    public boolean search(String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == word.length()) {
                int coincidences = 0;

                for (int y = 0; y < arr[i].length(); y++) {
                    if (word.charAt(y) == '.') {
                        coincidences++;
                        continue;
                    }
                    if (arr[i].charAt(y) == word.charAt(y)) {
                        coincidences++;
                    }
                }
                if (arr[i].length() == coincidences) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void getAllarr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "_");
        }
    }
}
