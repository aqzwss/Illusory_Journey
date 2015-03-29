package net.moonlithome.game.server.fight.action;

import net.moonlithome.game.server.Fight.service.UserFightMonster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by MF on 3/29/2015.
 */
@RequestMapping("/fight")
public class UserFightMonsterAction {

    @Autowired
    private UserFightMonster userFightMonster;

    @RequestMapping(value = "/createFight", method = RequestMethod.POST)
    public void createFight(HttpServletRequest request, HttpServletResponse response){

    }

    @RequestMapping(value = "/attack", method = RequestMethod.POST)
    public void attack(HttpServletRequest request, HttpServletResponse response){

    }

    @RequestMapping(value = "/closeFight", method = RequestMethod.POST)
    public void closeFight(HttpServletRequest request, HttpServletResponse response){

    }


}
