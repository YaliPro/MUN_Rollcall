package config;

/**
 * Created by Quentin on 8/2/16.
 */
public class GlobalConfig {

    public static final int SYSTEM_WINDOWS = 1;
    public static final int SYSTEM_LINUX = 2;
    public static final int SYSTEM_MAC = 3;

    private static int system = -999;

    public static int getSystemName() {
        if (system == -999) {
            system = getSystem();
            return system;
        } else
            return system;
    }

    private static int getSystem() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.startsWith("win")) return SYSTEM_WINDOWS;
        else if (os.startsWith("lin")) return SYSTEM_LINUX;
        else return SYSTEM_MAC;
    }

}
