package model.objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Quentin on 7/27/16.
 */
public class Session {

    private List<LinkedHashMap<String, String>> motions;
    private static final String MOTION_TOPIC = "topic";
    private static final String MOTION_DELEGATE = "delegate";

    private Date start;

    private Date end;

    public Session(Date start) {
        this.start = start;
        motions = new ArrayList<LinkedHashMap<String, String>>();
    }

    public void addMotion(String topic, String delegate) {
        throw new UnsupportedOperationException();
    }

    public List<LinkedHashMap<String, String>> getMotions() {
        return motions;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {

        this.end = end;
    }
}
