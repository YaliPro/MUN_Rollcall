package controller;

import model.objects.Motion;
import views.interfaces.MotionUpdate;

/**
 * <p>Controller for managing each new motion proposed,
 * that is, a new {@code Motion} object initialized. </p>
 *
 * <p>Each time a new motion is proposed,
 * a new {@code MotionController} object will be created to
 * manage the motion: call method
 * {@code endMotion} of class {@code MotionUpdate}
 * when a session ends, that is,
 * the number of times the method {@code startTimer}
 * matches the number of speakers.</p>
 *
 * @see views.interfaces.MotionUpdate
 * @see controller.TimerController
 * @see model.objects.Motion
 */
public abstract class MotionController {

    /**
     * interface to call to update GUI components
     */
    private MotionUpdate update;

    /**
     * motion information
     */
    private Motion motion;

    /**
     * Controller for timer
     */
    private TimerController timerController;

    /**
     * Initializes a newly created {@code MotionController} object.
     *
     * @param update interface to call to update GUI components
     * @param motion motion information
     */
    public MotionController(MotionUpdate update, Motion motion) {
        this.update = update;
        timerController = initTimerController();
    }

    /**
     * Each time this method is called, the number of speakers
     * and number of speeches must be checked as if they match;
     * and if so, the method {@code endMotion} must be called.
     */
    public abstract void startTimer();

    /**
     * Template method to initialize {@code TimerController} object.
     *
     * @return a newly created {@code TimerController} object.
     * @see controller.TimerController
     */
    protected abstract TimerController initTimerController();

    /**
     * Call to update GUI components.
     */
    protected void endMotion() {
        update.endMotion();
    }

}
