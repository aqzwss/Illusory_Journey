package net.moonlithome.game.system.dao;

import net.moonlithome.game.common.dto.UserLevelDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by MF on 3/14/2015.
 */
public interface UserLevelManageDao {

    List<UserLevelDto> getUserLevel(@Param(value = "levelId")int levelId);

    void addUserLevel(UserLevelDto userLevelDto);

    void updateUserLevel(UserLevelDto userLevelDto);

    void removeUserLevel(int levelId);

}
