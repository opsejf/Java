package namesPack;

public class NameStore {
    private static final String[] names = {"Alice", "Ben", "Chris", "Iggy", "Zen" };
    public static String getName(int nameNumber){
        if (nameNumber >= 0 && nameNumber < names.length){
            return names[nameNumber];
        } else {
            return "Whoops!";
        }
    }
}
