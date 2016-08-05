package model.repository;

import model.objects.Motion;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <p>{@code SessionRepository} is the
 * adapter between application and database.</p>
 * <p>
 * <p>Any class that implements this interface
 * is responsible for saving and retrieving motion information
 * by file reading and writing, using class {@code ObjectOutputStream}
 * to a specific file path, which is system-dependent.</p>
 *
 * @see java.io.ObjectOutputStream
 * @see model.objects.Session
 * @see model.objects.Motion
 */
public interface SessionRepository {

    /**
     * Each time the method is called, list of motion objects
     * related to certain {@code session_ID} will be retrieved and
     * stored at a {@code Map} maintained by subclass,
     * {@code session_ID} as key and {@code List<Motion>} as value.
     * <p>
     * Note: the parameter should be checked when the method is called
     * to ensure that the value of parameter {@code session_ID}
     * does not exceed session_ID that is going on, which could be retrieved
     * by call method {@code getCurrentSessionID} of class {@code Session}.
     *
     * @param session_ID ID of a certain session
     * @return list of {@code Motion} objects in a session.
     * @see model.objects.Session
     * @see model.objects.Motion
     * @throws IllegalArgumentException argument 'session ID' exceeds current Session ID or total number of sessions
     */
    List<Motion> findMotionsBySessionID(int session_ID) throws IllegalArgumentException;

    /**
     * Save list of {@code Motion} objects by file writing to a specific
     * file path, which is system-dependent.
     * <p>
     * Note: the parameter should be checked when the method is called
     * to ensure that the value of parameter {@code session_ID}
     * does not exceed session_ID that is going on, which could be retrieved
     * by call method {@code getCurrentSessionID} of class {@code Session}.
     *
     * @param session_ID the session in which the list of motions were proposed
     * @param motions    list of {@code Motion} objects to be saved
     * @see model.objects.Session
     * @see model.objects.Motion
     * @throws IllegalArgumentException argument 'session ID' exceeds current Session ID or total number of sessions
     */
    void saveMotionsBySessionID(int session_ID, @NotNull List<Motion> motions) throws IllegalArgumentException;

    /**
     * Save one {@code Motion} object by file writing to a specific
     * file path, which is system-dependent.
     * <p>
     * Note: the parameter should be checked when the method is called
     * to ensure that the value of parameter {@code session_ID}
     * does not exceed session_ID that is going on, which could be retrieved
     * by call method {@code getCurrentSessionID} of class {@code Session}.
     *
     * @param session_ID the session in which the motion was proposed
     * @param motion     a {@code Motion} object to be saved
     * @see model.objects.Session
     * @see model.objects.Motion
     * @throws IllegalArgumentException argument 'session ID' exceeds current Session ID or total number of sessions
     */
    void saveMotionBySessionID(int session_ID, @NotNull Motion motion) throws IllegalArgumentException;

}
