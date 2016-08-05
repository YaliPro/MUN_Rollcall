package model.objects;

import java.io.Serializable;

/**
 * Created by Quentin on 7/27/16.
 */
public class Conference implements Serializable {

    private static final long serialVersionUID = 7923961898031130969L;

    private String name;

    private String topic;

    private int numberOfSessions;

    public Conference() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getNumberOfSessions() {
        return numberOfSessions;
    }

    public void setNumberOfSessions(int numberOfSessions) {
        this.numberOfSessions = numberOfSessions;
    }
}
