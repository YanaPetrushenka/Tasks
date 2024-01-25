
public class Characters {
    public static void main(String[] args) {
        char character = 'a';
        String words = "animal";
        int count = countCharAtWord(character, words);
        System.out.println(count);
    }

    public static int countCharAtWord(char character, String words) {
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}








