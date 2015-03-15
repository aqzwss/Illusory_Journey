package net.moonlithome.game.system.dao;

import net.moonlithome.game.common.dto.UserLevelServerDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by MF on 3/14/2015.
 */
public interface UserLevelManageDao {

    List<UserLevelServerDto> getUserLevel(@Param(value = "levelId")int levelId);

    void addUserLevel(UserLevelServerDto userLevelDto);

    void updateUserLevel(UserLevelServerDto userLevelDto);

    void removeUserLevel(int levelId);

}
