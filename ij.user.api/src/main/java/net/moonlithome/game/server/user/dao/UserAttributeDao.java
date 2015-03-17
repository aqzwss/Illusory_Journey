package net.moonlithome.game.server.user.dao;

import net.moonlithome.game.common.dto.user.UserAttributeDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by moonlithome on 2015/3/15.
 */
public interface UserAttributeDao {

    List<UserAttributeDto> getUserAttribute(@Param(value = "userId")String userId);

    void addUserAttribute(UserAttributeDto userAttributeDto);

    void updateUserAttribute(UserAttributeDto userAttributeDto);

    void removeUserAttribute(@Param(value = "userId")String userId);

}
