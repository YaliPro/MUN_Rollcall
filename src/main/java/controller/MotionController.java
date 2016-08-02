package controller;

import model.objects.Motion;
import views.interfaces.MotionUpdate;

/**
 * Created by Quentin on 8/1/16.
 */
public abstract class MotionController {

    private MotionUpdate update;

    private TimerController timerController;

    private String topic;

    private Motion motion;

    public MotionController(MotionUpdate update, Motion motion) {
        this.update = update;

        initTimerController();
    }

    // each time called, check whether or not the motion will end
    // if so, call endMotion
    public abstract void startTimer();

    protected abstract void initTimerController();

    protected void endMotion() {
        update.endMotion();
    }

}
