package views.interfaces;

/**
 * Any class that implements this interface should
 * extend from {@code JPanel} or {@code JFrame} and
 * update TimerController in GUI Component.
 */
public interface MotionUpdate {

    /**
     * Updates the timer.
     * @param info remaining time for a speaker
     */
    void updateTimer(String info);
    void updateTimeForEachSpeaker(String time);
    void endMotion();
}
