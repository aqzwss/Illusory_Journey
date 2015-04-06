package net.moonlithome.game.server.user.scheduleImpl;

import net.moonlithome.game.common.cache.UserCache;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.server.user.mapper.UserInfoDao;
import net.moonlithome.game.server.user.schedule.UserExperienceSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * Created by moonlithome on 2015/3/16.
 * 每两分钟所有在线角色获取一次经验
 */
@Configuration
@EnableScheduling
public class UserExperienceScheduleImpl implements UserExperienceSchedule {

    @Autowired
    private UserInfoDao userInfoDao;

    @Scheduled(cron = "0 */2 * * * ?")
    public void gainExperience(){
//        databaseGainExperience();
        cacheAllUserGainExperience();
        cacheOnlineUserGainExperience();
    }

    /**
     * 在线用户获取经验
     */
    private void cacheOnlineUserGainExperience() {
        UserInfoDto userInfoDto;
        if(!UserCache.onlineUserList.isEmpty()){
            for(String userId : UserCache.onlineUserList){
                userInfoDto = UserCache.allUserInfoMap.get(userId);
                int experience = userInfoDto.getExperience() + userInfoDto.getExIncreaseRate();
                userInfoDto.setExperience(experience);
            }
        }
    }

    /**
     * 数据库方式获取经验
     */
    private void databaseGainExperience() {
        UserInfoDto resultDto;
        List<UserInfoDto> userInfoDtoList = userInfoDao.getUserInfo("");
        for (UserInfoDto userInfoDto : userInfoDtoList){
            resultDto = new UserInfoDto();
            resultDto.setUserId(userInfoDto.getUserId());
            resultDto.setExperience(userInfoDto.getExperience() + userInfoDto.getExIncreaseRate());
            userInfoDao.updateUserInfo(resultDto);
        }
    }

    /**
     * 所有用户通过缓存获取经验
     */
    private void cacheAllUserGainExperience() {
        UserInfoDto userInfoDto;
        Object[] userInfoKey = UserCache.allUserInfoMap.keySet().toArray();
        if(userInfoKey != null && userInfoKey.length > 0){
            for(int i = 0; i < userInfoKey.length; i++){
                if(UserCache.allUserInfoMap.get(userInfoKey[i]) != null){
                    userInfoDto = UserCache.allUserInfoMap.get(userInfoKey[i]);
                    userInfoDto.setExperience(userInfoDto.getExperience() + userInfoDto.getExIncreaseRate());
                }
            }
        }
    }
}
