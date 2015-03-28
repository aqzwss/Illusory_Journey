package net.moonlithome.game.server.user.service;

import net.moonlithome.game.common.dto.user.UserAttributeDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.dto.user.UserStatusDto;
import net.moonlithome.game.common.service.BaseService;

/**
 * Created by moonlithome on 2015/3/16.
 */
public interface UserService extends BaseService{

    public boolean userRegist(UserInfoDto userInfoDto);

    public UserInfoDto getUserInfo(String accountId);

    public UserAttributeDto getUserAttribute(String userId);

    public UserStatusDto getUserStatus(String userId);

    public boolean userUpgrade(String userId, String currentLevelFlag, String typeFlag);

    public boolean gainExperience(String userId, int experience);




}
