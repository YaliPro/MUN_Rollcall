package controller;

import model.objects.Motion;
import model.repository.DelegateRepository;
import model.repository.SessionRepository;
import views.interfaces.MotionUpdate;

import java.util.List;

/**
 * <p>Controller for storing into and retrieving from
 * {@code SessionRepository} the motion information.</p>
 * <p>
 * <p>During a session, new motions will be proposed,
 * corresponding {@code Motion} objects will be saved
 * by calling the method {@code motion} of this class,
 * and remaining tasks will be delegated to a newly created
 * {@code MotionController}. </p>
 * <p>
 * <p>Any subclass that implements this interface should maintain
 * a private list for holding {@code Motion} objects,
 * and for every ten minutes the method {@code saveMotions} should be called
 * to save information and all references the list holds should be deleted.</p>
 *
 * @see controller.MotionController
 * @see model.objects.Motion
 * @see model.repository.SessionRepository
 * @see views.interfaces.MotionUpdate
 * @see java.util.List
 */
public abstract class SessionController {

    /**
     * Internal list to maintain for
     * holding references to {@code Motion} objects.
     *
     * @see java.util.List
     */
    private List<Motion> motions;

    /**
     * Repository to save or retrieve {@code Delegate} objects.
     *
     * @see model.repository.DelegateRepository
     */
    private DelegateRepository delegateRepository;

    /**
     * Repository to save or retrieve {@code Motion} objects.
     *
     * @see model.repository.SessionRepository
     */
    private SessionRepository sessionRepository;

    /**
     * Interface to update GUI components
     */
    private MotionUpdate updateObject;

    /**
     * Controller for motion
     */
    private MotionController motionController;

    /**
     * Initializes a newly created {@code SessionController} to
     * save or retrieve {@code Motion} objects.
     *
     * @param delegateRepository repository to save or retrieve {@code Delegate} objects.
     * @param updateObject       interface to update GUI components
     * @param sessionRepository  repository to save or retrieve {@code Motion} objects.
     * @see controller.MotionController
     * @see model.objects.Motion
     * @see views.interfaces.MotionUpdate
     */
    public SessionController(DelegateRepository delegateRepository,
                             SessionRepository sessionRepository,
                             MotionUpdate updateObject) {

        this.delegateRepository = delegateRepository;
        this.sessionRepository = sessionRepository;
        this.updateObject = updateObject;
    }

    /**
     * When a new motion is proposed, this method will be called
     * and will delegate tasks to {@code MotionController} by initializing
     * a newly created {@code MotionController} and saves the reference to {@code motionController}.
     *
     * @param motion the new motion proosed
     * @see model.objects.Motion
     * @see controller.MotionController
     */
    public abstract void motion(Motion motion);

    /**
     * For every ten minutes, the method should be called
     * to save list of {@code Motion} objects by {@code SessionRepository}.
     *
     * @see model.objects.Motion
     * @see model.repository.SessionRepository
     * @see java.util.List
     */
    protected abstract void saveMotions();

    /**
     * During a motion, once a delegate starts to deliver speech,
     * this method will be called to start timer.
     * Because classes of view layer won't hold reference to
     * {@code MotionController} objects, this class is created to delegate
     * calls to {@code MotionController}.
     *
     * @see controller.MotionController
     */
    protected void startTimer() {
        motionController.startTimer();
    }
}
