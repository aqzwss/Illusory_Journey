package net.moonlithome.game.server.user.service;

import net.moonlithome.game.common.dto.user.UserInfoDto;

/**
 * Created by moonlithome on 2015/3/16.
 */
public interface UserOperationService{

    public boolean userRegiste(UserInfoDto userInfoDto);

    public boolean userUpgrade(String userId, String currentLevelFlag, String typeFlag);

    public boolean gainExperience(String userId, int experience);



}
