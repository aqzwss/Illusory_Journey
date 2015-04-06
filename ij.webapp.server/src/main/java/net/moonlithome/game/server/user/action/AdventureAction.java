package net.moonlithome.game.server.user.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by MF on 3/29/2015.
 */
@RequestMapping("/adventure")
public class AdventureAction {

    @RequestMapping(value = "/moveMap", method = RequestMethod.POST)
    public void moveMap(HttpServletRequest request, HttpServletResponse response){

    }

    @RequestMapping(value = "/getSendable", method = RequestMethod.POST)
    public void getSendable(HttpServletRequest request, HttpServletResponse response){

    }

    @RequestMapping(value = "/getLocation", method = RequestMethod.POST)
    public void getLocation(HttpServletRequest request, HttpServletResponse response){

    }

    @RequestMapping(value = "moveLocation", method = RequestMethod.POST)
    public void moveLocation(HttpServletRequest request, HttpServletResponse response){

    }

}
