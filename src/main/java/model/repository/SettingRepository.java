package model.repository;

import model.objects.Conference;

/**
 * <p>Repository to save or retrieve conference setting information.</p>
 * <p>
 * <p>Data should be saved in a file, and when no file is found
 * (possibly for the first time the application is run),
 * default values should be returned as following:
 * numOfSessions = 5;
 * name = "Yali High School";
 * topic = "GA";
 * </p>
 */
public interface SettingRepository {

    void saveConferenceConfig(Conference conference);
    Conference getConferenceConfig();
}
