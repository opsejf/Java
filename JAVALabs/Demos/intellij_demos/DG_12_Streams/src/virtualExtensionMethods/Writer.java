package virtualExtensionMethods;

public interface Writer {
    // Demo 12 - Virtual Extension Methods
    // Allow for default implementation of methods to be included

    public default void write(String msg) {
        System.out.println(msg);
    }
}
