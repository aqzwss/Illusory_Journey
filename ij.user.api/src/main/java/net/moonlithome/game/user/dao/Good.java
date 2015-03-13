package net.moonlithome.game.user.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by MF on 3/13/2015.
 */
public interface Good {

    void testInsertTrible(@Param(value = "good")String good);
}
