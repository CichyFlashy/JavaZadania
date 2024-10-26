import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class zad2 {
    static String changeLetters(String word, String letters, String changedLetters)
    {
        String result = "";
        for(int i = 0; i < word.length(); i++) {
            for (int y = 0; y < letters.length(); y++) {
                if (word.charAt(i) == letters.charAt(y)) {
                    result += changedLetters.charAt(y);
                    break;
                } else {
                    continue;
                }
            }
            if (result.length() < i + 1) {
                result += word.charAt(i);
            }

        }
        return result;
    }

    static String removedDuplicates(String word){
        String result = ""+word.charAt(0);
        for(int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                continue;
            }
            else {
                result += word.charAt(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(changeLetters("abracadabra", "abc", "xyz"));
        System.out.println(removedDuplicates("aaaabbbbbccccd"));
        System.out.println(removedDuplicates("aaaabbbbbccccdd"));
    }
}