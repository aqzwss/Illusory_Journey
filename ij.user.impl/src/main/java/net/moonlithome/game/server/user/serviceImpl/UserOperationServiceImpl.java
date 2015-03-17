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
        UserAttributeDto userAttributeDto = null;
        UserStatusDto userStatusDto = null;
        int userId = UserContantData.userId;
        UserContantData.userId += 1;

        userInfoDto.setUserId(userId);
        userInfoDao.addUserInfo(userInfoDto);

        if("human".equalsIgnoreCase(userInfoDto.getRace())){
            userAttributeDto = new UserAttributeDto(userId, 10, 0, 2, 0, 0, 0, 0, 0);
            userStatusDto = new UserStatusDto(userId, 100, 100, 0, 0);
        } else {

        }

        userAttributeDao.addUserAttribute(userAttributeDto);
        userStatusDao.addUserStatus(userStatusDto);

        return false;
    }

    @Override
    public boolean userUpgrade(int userId, String currentLevelFlag, String typeFlag) {
        if("user_level".equals(typeFlag)){
            UserInfoDto userInfoDto = new UserInfoDto();
            userInfoDto.setUserId(userId);
            userInfoDto.setLevelFlag(String.valueOf(Integer.valueOf(currentLevelFlag) + 1));
            userInfoDao.updateUserInfo(userInfoDto);
//            ((UserInfoDto) UserContantData.allUserInfoMap.get(userId)).setLevelFlag(currentLevelFlag + 1);
        }
        return false;
    }

    @Override
    public boolean gainExperience(int userId, int experience) {

        return false;
    }
}
