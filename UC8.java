import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Function to render banner
    public static void printBanner(String word, Map<Character, String[]> map) {

        int height = map.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        // O
        map.put('O', new String[]{
                " **** ",
                "*    *",
                "*    *",
                "*    *",
                " **** "
        });

        // P
        map.put('P', new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        });

        // S
        map.put('S', new String[]{
                " **** ",
                "*     ",
                " **** ",
                "     *",
                " **** "
        });

        String word = "OOPS";

        printBanner(word, map);
    }
}