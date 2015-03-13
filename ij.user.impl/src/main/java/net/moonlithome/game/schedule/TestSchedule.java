package net.moonlithome.game.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * Created by neusoft on 2015/3/13.
 */
@Configuration
@EnableScheduling
public class TestSchedule {

    @Scheduled(cron = "*/3 * * * * *")
//    @Scheduled(fixedDelay = 5000)
    public void test(){
        System.out.println("now is :" + new Date());
    }

}
