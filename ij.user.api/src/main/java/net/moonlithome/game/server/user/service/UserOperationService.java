package net.moonlithome.game.server.user.service;

import net.moonlithome.game.common.dto.user.UserInfoDto;

/**
 * Created by moonlithome on 2015/3/16.
 */
public interface UserOperationService {

    public boolean userRegister(UserInfoDto userInfoDto);

    public boolean userUpgrade(UserInfoDto userInfoDto);

    public boolean gainExperience(UserInfoDto userInfoDto);



}
