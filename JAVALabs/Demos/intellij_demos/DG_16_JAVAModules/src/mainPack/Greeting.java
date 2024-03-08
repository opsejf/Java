package mainPack;
import namesPack.NameStore;
public class Greeting {
    public static void main(String[] args) {
        System.out.println("Welcome to Modules!");
        System.out.println("Hello " + NameStore.getName(2));
    }
}
