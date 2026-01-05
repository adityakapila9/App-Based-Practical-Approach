public class UcFour
{
    public static class BannerCharacter {
        private char character;
        private String[] pattern;

        public BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    static void main() {
        BannerCharacter O = new BannerCharacter('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        BannerCharacter P = new BannerCharacter('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        BannerCharacter S = new BannerCharacter('S', new String[]{
                "  ***** ",
                " *      ",
                " *      ",
                "  ***** ",
                "       *",
                "       *",
                "  ***** "
        });

        BannerCharacter[] letters = {O, O, P, S};
        for (int row = 0; row < 7; row++) {
            String line = "";
            for (BannerCharacter letter : letters) {
                line += letter.getPattern()[row] + "  ";
            }
            System.out.println(line);
        }
    }
}
