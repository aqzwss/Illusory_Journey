package net.moonlithome.game.server.monster.mapper;

import net.moonlithome.game.common.dto.monster.MonsterInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by MF on 3/29/2015.
 */
public interface MonsterMapper {

    List<MonsterInfoDto> getMonsterInfo(@Param(value = "monsterId")String monsterId);

}
