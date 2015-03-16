package net.moonlithome.game.server.user.scheduleImpl;

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

    @Scheduled(cron = "0 */1 * * * ?")
    public void gainExperience(){

    }
}
