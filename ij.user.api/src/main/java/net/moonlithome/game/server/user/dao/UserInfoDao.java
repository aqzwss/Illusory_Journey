package net.moonlithome.game.server.user.dao;

import net.moonlithome.game.common.dto.user.UserInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by moonlithome on 2015/3/15.
 */
public interface UserInfoDao {

    List<UserInfoDto> getUserInfo(@Param(value = "userId")String userId);

    void addUserInfo(UserInfoDto userInfoDto);

    void updateUserInfo(UserInfoDto userInfoDto);

    void removeUserInfo(@Param(value = "userId")String userId);

}
