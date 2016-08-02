package model.repository;

import model.objects.Motion;

import java.util.List;

/**
 * Created by Quentin on 8/2/16.
 */
public interface SessionRepository {

    List<Motion> findMotionsBySessionID(int session_ID);
    void saveMotionsBySessionID(int session_ID);
    
}
