package model.repository;

import model.objects.Conference;

import javax.validation.constraints.NotNull;

/**
 * Created by Quentin on 9/6/16.
 */
public class SettingRepostioryImp implements SettingRepository {
    @Override
    public void saveConferenceConfig(@NotNull Conference conference) {

    }

    @Override
    public Conference getConferenceConfig() {
        return null;
    }
}
