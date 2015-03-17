package net.moonlithome.game.server.user.scheduleImpl;

import net.moonlithome.game.common.contant.UserContantData;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.server.user.dao.UserInfoDao;
import net.moonlithome.game.server.user.schedule.UserExperienceSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moonlithome on 2015/3/16.
 */
@Configuration
@EnableScheduling
public class UserExperienceScheduleImpl implements UserExperienceSchedule {

    @Autowired
    private UserInfoDao userInfoDao;

    @Scheduled(cron = "0 */2 * * * ?")
    public void gainExperience(){
        databaseGainExperience();
//        cacheGainExperience();
    }

    private void databaseGainExperience() {
        UserInfoDto resultDto;
        List<UserInfoDto> userInfoDtoList = userInfoDao.getUserInfo(-100);
        for (UserInfoDto userInfoDto : userInfoDtoList){
            resultDto = new UserInfoDto();
            resultDto.setUserId(userInfoDto.getUserId());
            resultDto.setExperience(userInfoDto.getExperience() + userInfoDto.getExIncreaseRate());
            userInfoDao.updateUserInfo(resultDto);
        }
    }

    private void cacheGainExperience() {
        UserInfoDto userInfoDto;
        Object[] userInfoKey = UserContantData.allUserInfoMap.keySet().toArray();
        if(userInfoKey != null && userInfoKey.length > 0){
            for(int i = 0; i < userInfoKey.length; i++){
                if(UserContantData.allUserInfoMap.get(userInfoKey[i]) != null){
                    userInfoDto = (UserInfoDto) UserContantData.allUserInfoMap.get(userInfoKey[i]);
                    userInfoDto.setExperience(userInfoDto.getExperience() + userInfoDto.getExIncreaseRate());
                }
            }
        }
    }
}
