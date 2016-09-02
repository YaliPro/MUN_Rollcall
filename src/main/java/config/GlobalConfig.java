package config;

import java.rmi.UnknownHostException;

/**
 * <p>Utility class for querying the system
 * on which the application runs. </p>
 */
public class GlobalConfig {

    public static final int SYSTEM_WINDOWS = 1;
    public static final int SYSTEM_LINUX = 2;
    public static final int SYSTEM_MAC = 3;

    public static final String WINDOWS_FILE_PATH = "";
    public static final String LINUX_FILE_PATH = "";
    public static final String MAC_FILE_PATH = "";

    private static int system = -999;

    public static String getFilePath() throws UnknownHostException {
        switch (getSystemName()) {
            case SYSTEM_WINDOWS: return WINDOWS_FILE_PATH;
            case SYSTEM_MAC: return MAC_FILE_PATH;
            case SYSTEM_LINUX: return LINUX_FILE_PATH;
            default: throw new UnknownHostException("the program runs on unknown system");
        }
    }

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
