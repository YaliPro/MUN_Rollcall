package model.repository;

import model.objects.Delegate;

import java.util.List;

/**
 * model.repository.DelegateRepository is the adapter between
 * application and database;
 * classes that implement this interface
 * is in charge of retrieving values
 * from database.
 *
 * this version supports one-delegate-for-one-nation scenario.
 */
public interface DelegateRepository {

    /**
     * @return list of getDelegates in the database
     */
    List<Delegate> getDelegates();

    /**
     * @param nation the nation the delegate represents
     * @return model.objects.Delegate object that matches specified nation;
     *          otherwise a model.objects.Delegate object with null values will be returned.
     */
    Delegate findDelegateByNation(String nation);

    /**
     * @param name the name of delegate
     * @return model.objects.Delegate object that matches specified nation;
     *          otherwise a model.objects.Delegate object with null values will be returned.
     */
    Delegate findDelegateByName(String name);

    /**
     * After each session, delegate's information
     * should be updated in the database
     * or should be stored after setting of conference is to be altered;
     * This method should thus be called after the end of each session.
     * @param delegates list of getDelegates whose info is to be updated or be stored
     */
    void updateDelegates(List<Delegate> delegates);
}
