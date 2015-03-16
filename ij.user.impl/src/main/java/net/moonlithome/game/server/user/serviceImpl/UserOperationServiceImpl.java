package net.moonlithome.game.server.user.serviceImpl;

import net.moonlithome.game.common.contant.UserContantData;
import net.moonlithome.game.common.dto.user.UserAttributeDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.dto.user.UserStatusDto;
import net.moonlithome.game.server.user.dao.UserAttributeDao;
import net.moonlithome.game.server.user.dao.UserInfoDao;
import net.moonlithome.game.server.user.dao.UserStatusDao;
import net.moonlithome.game.server.user.service.UserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by moonlithome on 2015/3/16.
 */
@Service
public class UserOperationServiceImpl implements UserOperationService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private UserAttributeDao userAttributeDao;

    @Autowired
    private UserStatusDao userStatusDao;

    @Override
    public boolean userRegister(UserInfoDto userInfoDto) {
        UserAttributeDto userAttributeDto = new UserAttributeDto();
        UserStatusDto userStatusDto = new UserStatusDto();
        int userId = UserContantData.userId;
        UserContantData.userId += 1;

        userInfoDto.setUserId(userId);
        userInfoDao.addUserInfo(userInfoDto);

        if("human".equalsIgnoreCase(userInfoDto.getRace())){

        }

        userAttributeDao.addUserAttribute(userAttributeDto);
        userStatusDao.addUserStatus(userStatusDto);

        return false;
    }

    @Override
    public boolean userUpgrade(UserInfoDto userInfoDto) {
        return false;
    }

    @Override
    public boolean gainExperience(UserInfoDto userInfoDto) {
        return false;
    }
}
