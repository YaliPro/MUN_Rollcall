package viewModel;

import views.interfaces.MotionUpdate;

/**
 * <p>When a delegate motions for a topic, the delegate needs to
 * specify the time and number of numOfSpeakers for the motion.
 * The corresponding time for each speaker will be
 * computed by method {@code setTimeForEachSpeaker()}.
 * Then the corresponding time should be updated to the GUI component by method
 * {@code updateTimeForEachSpeaker()}.
 * When the method {@code startTimer()} is called, the method {@code updateTimer()}
 * should also be called to update timer of the GUI component.
 * When the motion runs out of time, that is,
 * each speaker has delivered the speech and there is no time left,
 * the method {@code endMotion} should be called. </p>
 *
 * <p>{@code MotionUpdate} is the interface for updating info for the GUI components.
 * That said, each action related updating GUI components needs to call methods of {@code MotionUpdate}</p>
 *
 * @see MotionUpdate
 */
public abstract class TimerController {

    /**
     * The total minutes of a motion.
     * The expected value is a integer.
     */
    private int totalMins;

    /**
     * The total number of numOfSpeakers of a motion
     */
    private int numOfSpeakers;

    /**
     * The interface with methods to call for updating information
     * to the GUI component
     */
    private MotionUpdate updateObject;

    /**
     * Initializes a newly created {@code TimerController} object that handles
     * time computation and timer updating.
     * @param totalMins The total minutes of a motion
     * @param numOfSpeakers The total number of numOfSpeakers of a motion
     * @param updateObject The interface with methods to call for updating information to the GUI component
     */
    public TimerController(
            int totalMins, int numOfSpeakers, MotionUpdate updateObject) {
        this.totalMins = totalMins;
        this.numOfSpeakers = numOfSpeakers;
        this.updateObject = updateObject;

        updateTimeForEachSpeaker();
    }

    /**
     * Start timer when this method is called and
     * update timer by calling {@code updateTimer()}.
     *
     * Before the timer starts, it will be reset to the time
     * each speaker has.
     */
    public abstract void startTimer();

    /**
     * Updates the time each speaker has by calling the method
     * {@code updateTimeForEachSpeaker()} of {@code MotionUpdate} object.
     *
     * The format of method parameter should be "mm:ss".
     */
    protected abstract void updateTimeForEachSpeaker();

    /**
     * Updates timer of GUI component by calling the method
     * {@code updateTimer()} of {@code MotionUpdate} object.
     *
     * The format of method parameter should be "mm:ss".
     */
    protected abstract void updateTimer();

    /**
     * When the motion runs out of time, this method is
     * called to inform GUI components of the ending of
     * a motion.
     */
    protected void endMotion() {
        updateObject.endMotion();
    }

    /**
     * @return The total minutes of a motion.
     */
    protected int getTotalMins() {
        return totalMins;
    }

    /**
     * @return The total number of numOfSpeakers of a motion
     */
    protected int getNumOfSpeakers() {
        return numOfSpeakers;
    }

    /**
     * @return The interface with methods to call for updating information to the GUI component
     */
    protected MotionUpdate getUpdateObject() {
        return updateObject;
    }

}
