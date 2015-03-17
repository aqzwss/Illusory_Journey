package net.moonlithome.game.server.user.service;

import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.service.BaseService;

/**
 * Created by moonlithome on 2015/3/16.
 */
public interface UserOperationService extends BaseService{

    public boolean userRegister(UserInfoDto userInfoDto);

    public boolean userUpgrade(String userId, String currentLevelFlag, String typeFlag);

    public boolean gainExperience(String userId, int experience);



}
