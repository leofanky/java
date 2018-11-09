public class Slang {

    static String[] split;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        split = input.split(" ");
        fixAbbreviations(split);
        fixSmiles(split);
        for(int i=0;i<split.length;i++)
        {
          System.out.print(split[i] + " ");
        }  
    }

    public static void fixAbbreviations(String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(":)")) {
                s[i] = "please ";
            }
            if (s[i].equals(":(")) {
                s[i] = "as soon as possible ";
            }
            if (s[i].equals("¯\\_(ツ)_/¯")) {
                s[i] = "[such is life]";
            }
        }
    }

    public static void fixSmiles(String[] s) {
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("PLZ")) {
                split[i] = "please ";
            }
            if (split[i].equals("ASAP")) {
                split[i] = "as soon as possible ";
            }
            if (split[i].equals("GTFO")) {
                split[i] = "please, leave me alone ";
            }
            if (split[i].equals("FYI")) {
                split[i] = "for your information";
            }

        }
    }
}
