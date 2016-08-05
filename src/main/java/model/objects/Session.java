package model.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>{@code Session} objects represent sessions
 * in a conference. </p>
 *
 * <p>Each {@code Session} object holds references to a list of
 * {@code Motion} objects, which represent motions proposed in
 * a corresponding motion. </p>
 *
 * <p>Note: objects of {@code Session} are only initialized when
 * statistics of session is reviewed, and thus this class is not supported
 * in current version. </p>
 *
 * @see model.objects.Motion
 */
public class Session implements Serializable {

    private static final long serialVersionUID = -300001188693719355L;

    private static int count = 0;

    private final int ID = ++count;

    private List<Motion> motions;

    private Date start;

    private Date end;

    public Session() {
        start = new Date();
        motions = new ArrayList<Motion>();
    }

    public Session(Date start, Date end, List<Motion> motions) {
        this.start = start;
        this.end = end;
        this.motions = motions;
    }

    public static int getCurrentSessionID() {
        return count;
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
