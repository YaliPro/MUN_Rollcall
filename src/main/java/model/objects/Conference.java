package model.objects;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Quentin on 7/27/16.
 */
public class Conference implements Serializable {

    private static final long serialVersionUID = 7923961898031130969L;

    private String name;

    private String topic;

    private int numberOfSessions;

    private List<Session> sessions;

    private int sessionIndex;

    /*private ConferenceRepository conferenceRepository;

    public Conference(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;

        name = conferenceRepository.getName();
        topic = conferenceRepository.getTopic();
        numberOfSessions = conferenceRepository.getNumOfSessoins();

        sessionIndex = 1;
        sessions = new ArrayList<Session>();
    }

    /**
     * called when one session ends
     * @param session
     */
    public void addSession(Session session) {
        sessions.add(session);
        ++sessionIndex;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public int getNumberOfSessions() {
        return numberOfSessions;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public int getSessionIndex() {
        return sessionIndex;
    }
}
