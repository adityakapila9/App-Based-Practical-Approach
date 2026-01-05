public class UcThree
{
    public static String[] getOPattern()
    {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }
    public static String[] getPPattern()
    {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }
    public static String [] getSPattern()
    {
        return new String[]{
                "  ***** ",
                " *      ",
                " *      ",
                "  ***** ",
                "       *",
                "       *",
                "  ***** "
        };
    }
    static void main() {
        String[][] letters = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        for (int row = 0; row < letters[0].length; row++) {
            String line = "";
            for (String[] letter : letters) {
                line += letter[row] + "  ";
            }
            System.out.println(line);
        }
    }
}
