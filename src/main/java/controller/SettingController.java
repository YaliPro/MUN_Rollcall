package controller;

import model.objects.Conference;
import model.repository.SettingRepository;

/**
 * <p>Controller for saving to or retrieving from
 * {@code SettingRepository} object
 * the conference configuration.</p>
 *
 * @see model.repository.SettingRepository
 * @see model.objects.Conference
 */
public abstract class SettingController {

    /**
     * Repository to save or retrieve conference setting
     *
     * @see model.repository.SettingRepository
     */
    private SettingRepository repository;

    /**
     * Initializes a newly created {@code SettingController} object.
     *
     * @param repository repository to save or retrieve conference setting
     * @see model.repository.SettingRepository
     */
    public SettingController(SettingRepository repository) {
        this.repository = repository;
        initConferenceConfig(repository.getConferenceConfig());
    }

    /**
     * Retrieve and initialize conference configuration in {@code ConferenceConfig}
     * from {@code SettingRepository} object.
     *
     * @param conferenceConfig {@code Conference} object that stores conference configuration
     * @see model.objects.Conference
     * @see config.ConferenceConfig
     * @see model.repository.SettingRepository
     */
    public abstract void initConferenceConfig(Conference conferenceConfig);

    /**
     * Save conference configuration in {@code ConferenceConfig}
     * through {@code SettingRepository} object.
     *
     * @param conferenceConfig {@code Conference} object that stores conference configuration
     * @see model.objects.Conference
     * @see config.ConferenceConfig
     * @see model.repository.SettingRepository
     */
    public abstract void saveConferenceConfg(Conference conferenceConfig);


}
