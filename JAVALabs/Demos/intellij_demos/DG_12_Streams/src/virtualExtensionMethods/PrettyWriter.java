package virtualExtensionMethods;

public interface PrettyWriter extends Writer {

    // Demo 12 - Another Interface with a Virtual Extension Method

    @Override
    public default void write(String msg) {
        System.out.println("**** " + msg + " ++++");
    }
}
