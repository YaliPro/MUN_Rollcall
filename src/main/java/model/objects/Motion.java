package model.objects;

import com.sun.istack.internal.NotNull;

import java.util.List;

/**
 * Created by Quentin on 8/1/16.
 */
public class Motion {

    private String topic;
    private String delegate;
    private List<String> speakers;

    private int totalTime;

    public Motion() { }

    public String getTopic() {
        return topic;
    }

    public void setTopic(@NotNull String topic) {
        this.topic = topic;
    }

    public String getDelegate() {
        return delegate;
    }

    public void setDelegate(@NotNull String delegate) {
        this.delegate = delegate;
    }

    public List<String> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(@NotNull List<String> speakers) {
        this.speakers = speakers;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(@NotNull int totalTime) {
        this.totalTime = totalTime;
    }

    public int getNumOfSpeakers() {
        return speakers.size();
    }
}
