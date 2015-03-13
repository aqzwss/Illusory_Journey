package net.moonlithome.game.schedule;

import net.moonlithome.game.dao.TestMyBatis;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TestMyBatis testMyBatis;

    @Scheduled(cron = "0 */2 * * * *")
//    @Scheduled(fixedDelay = 5000)
    public void test(){
        testMyBatis.testInsert("aaaaaa", "verygood");
        testMyBatis.testInsertTwice("111", "1111");
        testMyBatis.testInsertTrible("1111");
        System.out.println("now is :" + new Date());
    }

}
