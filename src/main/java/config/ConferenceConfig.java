package config;

/**
 * Created by Quentin on 8/1/16.
 */
public class ConferenceConfig {

    private static int numOfSessions = 5;
    private static String Name = "Yali High School";
    private static String Topic = "GA";

    public ConferenceConfig() {}


    public static int getNumOfSessions() {
        return numOfSessions;
    }

    public static void setNumOfSessions(int numOfSessions) {
        ConferenceConfig.numOfSessions = numOfSessions;
    }

    public static String getName() {
        return Name;
    }

    public static String getTopic() {
        return Topic;
    }

    public static void setName(String name) {

        Name = name;
    }

    public static void setTopic(String topic) {
        Topic = topic;
    }
}
