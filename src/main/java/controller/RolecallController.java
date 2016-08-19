package controller;

import model.objects.Delegate;
import model.repository.DelegateRepository;
import views.interfaces.RolecallUpdate;

import java.util.List;

/**
 * <p>When the conference starts roll call procedure
 * by calling method {@code startRolecall},
 * each delegate will be updated to GUI component
 * by calling method {@code updateDelegateInfo}
 * to confirm the presence or absence of the delegate
 * by calling either method {@code setDelegatePresent}
 * or method {@code setDelegateAbsent} </p>
 *
 * <p>Any subclass must maintain an internal index pointer
 * to loop through {@code Delegate} objects:
 * each delegate will be updated in succession
 * and the method {@code setDelegatePresent} or {@code setDelegateAbsent}
 * will be called once and only once for each delegate.</p>
 *
 * @see model.objects.Delegate
 * @see model.repository.DelegateRepository
 * @see views.interfaces.RolecallUpdate
 */
public abstract class RolecallController {

    /**
     * The repository to retrieve {@code Delegate} objects.
     *
     * @see model.repository.DelegateRepository
     */
    private DelegateRepository repository;

    /**
     * The list of delegates retrieved from {@code DelegateRepository}
     *
     * @see model.objects.Delegate
     * @see model.repository.DelegateRepository
     */
    private List<Delegate> delegates;

    /**
     * The interface to call for updating GUI component
     *
     * @see views.interfaces.RolecallUpdate
     */
    private RolecallUpdate updateObject;

    /**
     * Internal index pointer to maintain
     * so as to loop through the list {@code delegates}.
     */
    private int index;

    /**
     * Initializes a newly created {@code RolecallController}
     * which handles the role call process.
     *
     * @param repository The repository to retrieve {@code Delegate} objects.
     * @param updateObject The interface to call for updating GUI component
     *
     * @see model.repository.DelegateRepository
     * @see views.interfaces.RolecallUpdate
     */
    public RolecallController(
            DelegateRepository repository, RolecallUpdate updateObject) {
        this.repository = repository;
        this.updateObject = updateObject;
        delegates = repository.getDelegates();

        index = 0;
    }

    /**
     * When role call procedure starts, this method will be called to
     * start to loop through the list {@code delegates},
     * update each update in succession
     * and confirm delegate's presence or absence.
     */
    public abstract void startRolecall();

    /**
     * For each delegate when the list {@code delegates} is looped through,
     * delegate's presence will be confirmed by calling this method.
     *
     * @see model.objects.Delegate
     */
    public void setDelegatePresent() {
        delegates.get(index).increaseNumOfPresence();
    }

    /**
     * For each delegate when the list {@code delegates} is looped through,
     * delegate's presence will be confirmed by calling this method.
     * Because only the number of presence is counted, this method serves as
     * the public interface for GUI components.
     *
     * @see model.objects.Delegate
     */
    public void setDelegateAbsent() {
        // do nothing
    }

    /**
     * For each delegate when the list {@code delegates} is looped through,
     * this method will update delegate's information (name and country) to GUI components
     * by calling method {@code updateDelegateInfo} of {@code RolecallUpdate}.
     *
     * @see views.interfaces.RolecallUpdate
     */
    protected abstract void updateDelegateInfo();

    /**
     * When the loop is terminated,
     * this method calls method {@code endRolecall} of {@code RolecallUpdate}
     * to inform GUI components that the loop is over
     * and calls {@code updateDelegates} of {@code DelegateRepository} to save objects.
     *
     * @see views.interfaces.RolecallUpdate
     */
    protected void endRolecall() {
        updateObject.endRolecall();
    }

}
