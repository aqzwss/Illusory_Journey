package net.moonlithome.game.common.cache;

import net.moonlithome.game.common.dto.user.UserAttributeDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.dto.user.UserLevelDto;
import net.moonlithome.game.common.dto.user.UserStatusDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by MF on 4/6/2015.
 */
public class UserCache {

    /**
     * 在线用户UserId列表
     */
    public static List<String> onlineUserList = Collections.synchronizedList(new ArrayList<String>());
    /**
     * 所有用户信息
     * Map<UserId, UserInfo>
     */
    public static Map<String, UserInfoDto> allUserInfoMap = Collections.synchronizedMap(new ConcurrentHashMap<String, UserInfoDto>());

    /**
     * 所有用户属性
     * Map<UserId, UserAttributeDto>
     */
    public static Map<String, UserAttributeDto> allUserAttributeMap = Collections.synchronizedMap(new ConcurrentHashMap<String, UserAttributeDto>());

    /**
     * 所有用户状态
     * Map<UserId, UserStatusDto>
     */
    public static Map<String, UserStatusDto> allUserStatusMap = Collections.synchronizedMap(new ConcurrentHashMap<String, UserStatusDto>());

    /**
     * 所有用户等级
     */
    public static List<UserLevelDto> allLevelList = Collections.synchronizedList(new ArrayList<UserLevelDto>());


}
