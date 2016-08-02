package model.objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Quentin on 7/27/16.
 */
public class Session {

    private static int count = 0;

    public static final int ID = ++count;

    private List<Motion> motions;

    private Date start = new Date();

    private Date end;

    public Session(Date start) {
        this.start = start;
        motions = new ArrayList<Motion>();
    }

    public void addMotion(Motion motion) {
        motions.add(motion);
    }

    public List<Motion> getMotions() {
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
