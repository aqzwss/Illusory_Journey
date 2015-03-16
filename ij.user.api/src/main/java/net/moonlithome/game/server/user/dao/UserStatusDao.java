package net.moonlithome.game.server.user.dao;

import net.moonlithome.game.common.dto.user.UserStatusDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by moonlithome on 2015/3/15.
 */
public interface UserStatusDao {

    List<UserStatusDto> getUserStatus(@Param(value = "userId")int userId);

    void addUserStatus(UserStatusDto userStatusDto);

    void updateUserStatus(UserStatusDto userStatusDto);

    void removeUserStatus(@Param(value = "userId")int userId);
}
