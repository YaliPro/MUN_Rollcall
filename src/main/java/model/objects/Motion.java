package model.objects;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Objects of this class represent motions proposed by delegates.</p>
 * <p>
 * <p>When a delegate motions, the delegate needs to
 * specify the topic, the total time and number of speakers.</p>
 */
public class Motion implements Serializable {


    /**
     * {@code serialVersionUID} for {@code Serializable}
     */
    private static final long serialVersionUID = 7413663560546621305L;

    /**
     * The topic of a motion.
     */
    private String topic;

    /**
     * The name of the delegate who proposes motion.
     */
    private String delegate;

    /**
     * The list of name of speakers.
     * This size of this list is equal to the number of speakers.
     */
    private List<String> speakers;

    /**
     * The total time of a motion.
     */
    private int totalTime;

    /**
     * Initializes a newly created {@code Motion} object that represent a motion.
     * After initialization, value of each field needs to be set.
     */
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
