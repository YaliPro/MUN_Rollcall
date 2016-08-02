package controller;

import model.objects.Motion;
import model.repository.DelegateRepository;
import views.interfaces.MotionUpdate;

/**
 * Created by Quentin on 8/1/16.
 */
public abstract class SessionController {

    private TimerController timer;
    private DelegateRepository repository;
    private MotionUpdate updateObject;

    public SessionController(DelegateRepository repository,
                             MotionUpdate updateObject) {

    }

    public abstract void motion(Motion motion);

}
