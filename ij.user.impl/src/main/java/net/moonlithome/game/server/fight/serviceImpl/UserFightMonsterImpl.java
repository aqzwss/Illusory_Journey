package net.moonlithome.game.server.fight.serviceImpl;

import net.moonlithome.game.common.dto.monster.MonsterInfoDto;
import net.moonlithome.game.common.dto.user.UserAttributeDto;
import net.moonlithome.game.common.dto.user.UserInfoDto;
import net.moonlithome.game.common.dto.user.UserStatusDto;
import net.moonlithome.game.server.Fight.service.UserFightMonster;

/**
 * Created by MF on 3/29/2015.
 */
public class UserFightMonsterImpl implements UserFightMonster {

    private int round;
    private UserInfoDto userInfoDto;
    private UserAttributeDto userAttributeDto;
    private UserStatusDto userStatusDto;
    private MonsterInfoDto monsterInfoDto;

    public UserFightMonsterImpl(UserInfoDto userInfoDto, MonsterInfoDto monsterInfoDto){
        this.userInfoDto = userInfoDto;
        this.monsterInfoDto = monsterInfoDto;
    }

    @Override
    public void attack(String act, String passivity) {

    }
}
