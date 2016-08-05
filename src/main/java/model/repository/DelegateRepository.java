package model.repository;

import model.objects.Delegate;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <p>model.repository.DelegateRepository is the adapter
 * between application and data.
 * </p>
 * <p>
 * <p>Because current version only supports data storage by file writing,
 * any class that implements this interface should, for cross-platform compatibility,
 * notice the system on which the application runs by calling method {@code getSystemName}
 * of class {@code config.GlobalConfig} when saving data and thus use suitable file location
 * for specific platforms. </p>
 * <p>
 * <p>This version supports one-delegate-for-one-nation scenario. </p>
 *
 * @see config.GlobalConfig
 * @see model.objects.Delegate
 */
public interface DelegateRepository {


    /**
     * When singleton object of this class that implements this interface
     * is initialized, this method should also be called to retrieve data
     * and store data in a private list maintained by the subclass.
     *
     * @return list of Delegates objects which represent delegates attending a conference
     * @see model.objects.Delegate
     * @throws IllegalStateException the size of returned list is zero
     */
    List<Delegate> getDelegates() throws IllegalStateException;

    /**
     * * The {@code Delegate} object should be found inside
     * the private list maintained by the subclass.
     *
     * @param nation the nation the delegate represents
     * @return model.objects.Delegate object that matches specified nation;
     * otherwise a model.objects.Delegate object with null values will be returned.
     * @see model.objects.Delegate
     * @throws IllegalArgumentException {@code Delegate} object corresponding to argument 'nation' is not found
     */
    Delegate findDelegateByNation(String nation) throws IllegalArgumentException;



    /**
     * The {@code Delegate} object should be found inside
     * the private list maintained by the subclass.
     *
     * @param name the name of delegate
     * @return model.objects.Delegate object that matches specified nation;
     * otherwise a model.objects.Delegate object with null values will be returned.
     * @see model.objects.Delegate
     * @throws IllegalArgumentException {@code Delegate} object corresponding to argument 'name' is not found
     */
    Delegate findDelegateByName(String name) throws IllegalArgumentException;


    /**
     * After each session, delegate's information
     * should be updated in the database
     * or should be stored after setting of conference is to be altered;
     * This method should thus be called after the end of each session.
     *
     * @param delegates list of getDelegates whose info is to be updated or be stored
     * @see model.objects.Delegate
     */
    void updateDelegates(@NotNull List<Delegate> delegates);
}
