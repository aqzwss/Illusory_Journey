package net.moonlithome.game.server.monster.service;

import net.moonlithome.game.common.dto.monster.MonsterInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by MF on 3/29/2015.
 */
public interface MonsterService {

    /**
     * get monster information
     * @param monsterId
     * @return
     */
    public List<MonsterInfoDto> getMonsterInfo(String monsterId);

}
