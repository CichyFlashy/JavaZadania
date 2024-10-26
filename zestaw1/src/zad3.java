public class zad3 {
    static String tolowerCase(String word)
    {
        String result = "";
        for(int i = 0; i < word.length(); i++)
        {
            if((byte)word.charAt(i) >= 65 && (byte)word.charAt(i) <= 90)
            {
                int letter = (byte)word.charAt(i) + 32;
                result += (char)letter;
                continue;
            }
            result += word.charAt(i);
        }
        return result;
    }

    static String toUpperCase(String word)
    {
        String result = "";
        for(int i = 0; i < word.length(); i++)
        {
            if((byte)word.charAt(i) >= 97 && (byte)word.charAt(i) <= 122)
            {
                int letter = (byte)word.charAt(i) - 32;
                result += (char)letter;
                continue;
            }
            result += word.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(tolowerCase("MaTeUsz"));
        System.out.println(toUpperCase("MaTeUsz"));
    }
}