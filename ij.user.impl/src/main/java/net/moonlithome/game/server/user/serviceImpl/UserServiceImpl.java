package net.moonlithome.game.server.user.serviceImpl;

import net.moonlithome.game.common.dto.user.UserAttributeDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.dto.user.UserStatusDto;
import net.moonlithome.game.common.util.UserOperationUtil;
import net.moonlithome.game.server.user.dao.UserAttributeDao;
import net.moonlithome.game.server.user.dao.UserInfoDao;
import net.moonlithome.game.server.user.dao.UserStatusDao;
import net.moonlithome.game.server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by moonlithome on 2015/3/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private UserAttributeDao userAttributeDao;

    @Autowired
    private UserStatusDao userStatusDao;

    @Override
    public boolean userRegist(UserInfoDto userInfoDto) {
        UserAttributeDto userAttributeDto = null;
        UserStatusDto userStatusDto = null;
        String userId = UserOperationUtil.generateUserId();

        userInfoDto.setUserId(userId);
        userInfoDao.addUserInfo(userInfoDto);

        if("human".equalsIgnoreCase(userInfoDto.getRace())){
            userAttributeDto = new UserAttributeDto(userId, 10, 0, 2, 0, 0, 0, 0, 0);
            userStatusDto = new UserStatusDto(userId, 100, 100, 0, 0);
        } else {
            //TODO other race initialization
        }

        userAttributeDao.addUserAttribute(userAttributeDto);
        userStatusDao.addUserStatus(userStatusDto);

        return false;
    }

    @Override
    public UserInfoDto getUserInfo(String accountId) {
        if(!StringUtils.isEmpty(accountId)){
            return userInfoDao.getUserInfo(accountId).get(0);
        }
        return null;
    }

    @Override
    public UserAttributeDto getUserAttribute(String userId) {
        return userAttributeDao.getUserAttribute(userId).get(0);
    }

    @Override
    public UserStatusDto getUserStatus(String userId) {
        return userStatusDao.getUserStatus(userId).get(0);
    }

    @Override
    public boolean userUpgrade(String userId, String currentLevelFlag, String typeFlag) {
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
    public boolean gainExperience(String userId, int experience) {

        return false;
    }
}
