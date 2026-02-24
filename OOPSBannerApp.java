public class OOPSBannerApp {

    public static String[] getO() {
        return new String[] {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
    }

    public static String[] getP() {
        return new String[] {
            " ***** ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    public static String[] getS() {
        return new String[] {
            "  ***** ",
            " *      ",
            "  ***** ",
            "      * ",
            "      * ",
            " *****  "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();


        for (int i = 0; i < O.length; i++) {
            String line = String.join("   ", O[i], P[i], P[i], S[i]);
            System.out.println(line);
        }
    }
}