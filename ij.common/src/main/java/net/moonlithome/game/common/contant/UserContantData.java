package net.moonlithome.game.common.contant;

import net.moonlithome.game.common.dto.user.UserLevelDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by moonlithome on 2015/3/16.
 */
public class UserContantData {

    public static Map<String, Object> allUserInfoMap = Collections.synchronizedMap(new ConcurrentHashMap<String, Object>());
    public static Map<String, Object> allUserAttributeMap = Collections.synchronizedMap(new ConcurrentHashMap<String, Object>());
    public static Map<String, Object> allUserStatusMap = Collections.synchronizedMap(new ConcurrentHashMap<String, Object>());
    public static List<UserLevelDto> allLevelList = Collections.synchronizedList(new ArrayList<UserLevelDto>());

}
