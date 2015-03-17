package net.moonlithome.game.server.user.scheduleImpl;

import net.moonlithome.game.common.contant.UserContantData;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.server.user.schedule.UserExperienceSchedule;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by moonlithome on 2015/3/16.
 */
@Configuration
@EnableScheduling
public class UserExperienceScheduleImpl implements UserExperienceSchedule {

    @Scheduled(cron = "0 */2 * * * ?")
    public void gainExperience(){
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
