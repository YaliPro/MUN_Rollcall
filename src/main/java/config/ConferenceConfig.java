package config;

/**
 * Conference configuration.
 */
public class ConferenceConfig {

    private static int numOfSessions = 5;
    private static String name = "Yali High School";
    private static String topic = "GA";

    public ConferenceConfig() {}


    public static int getNumOfSessions() {
        return numOfSessions;
    }

    public static void setNumOfSessions(int numOfSessions) {
        ConferenceConfig.numOfSessions = numOfSessions;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ConferenceConfig.name = name;
    }

    public static String getTopic() {
        return topic;
    }

    public static void setTopic(String topic) {
        ConferenceConfig.topic = topic;
    }
}
