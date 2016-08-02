package model.repository;

import model.objects.Delegate;

import java.util.List;

/**
 * <p>model.repository.DelegateRepository is the adapter
 * between application and data.
 * Classes that implement this interface is responsible for
 * retrieving data in a certain way.
 * </p>
 *
 * <p>Because current version only supports data storage by file writing,
 * any class that implements this interface should, for cross-platform compatibility,
 * get the system on which the application runs by calling method {@code getSystemName}
 * of class {@code config.GlobalConfig}. </p>
 *
 * <p>This version supports one-delegate-for-one-nation scenario. </p>
 *
 * @see config.GlobalConfig
 * @see model.objects.Delegate
 */
public interface DelegateRepository {

    /**
     * @return list of Delegates objects which represent delegates attending a conference
     *
     * @see model.objects.Delegate
     */
    List<Delegate> getDelegates();

    /**
     * @param nation the nation the delegate represents
     * @return model.objects.Delegate object that matches specified nation;
     *          otherwise a model.objects.Delegate object with null values will be returned.
     *
     * @see model.objects.Delegate
     */
    Delegate findDelegateByNation(String nation);

    /**
     * @param name the name of delegate
     * @return model.objects.Delegate object that matches specified nation;
     *          otherwise a model.objects.Delegate object with null values will be returned.
     *
     * @see model.objects.Delegate
     */
    Delegate findDelegateByName(String name);

    /**
     * After each session, delegate's information
     * should be updated in the database
     * or should be stored after setting of conference is to be altered;
     * This method should thus be called after the end of each session.
     * @param delegates list of getDelegates whose info is to be updated or be stored
     *
     *
     * @see model.objects.Delegate
     */
    void updateDelegates(List<Delegate> delegates);
}
