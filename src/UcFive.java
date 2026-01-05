import java.util.*;

public class UcFive
{public static Map<Character, String[]> buildCharacterMap() {
    Map<Character, String[]> map = new HashMap<>();
    String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
    };
    map.put('O', O);


    String[] P = {
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
    };
    map.put('P', P);


    String[] S = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
    };
    map.put('S', S);

    return map;
}

    public static void displayBanner(String message, Map<Character, String[]> charMap) {
        int height = 7; // height of banner

        for (int row = 0; row < height; row++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    sb.append(pattern[row]).append("  "); // space between letters
                }
            }
            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {
        Map<Character, String[]> charMap = buildCharacterMap();
        displayBanner("OOPS", charMap);
    }
}




