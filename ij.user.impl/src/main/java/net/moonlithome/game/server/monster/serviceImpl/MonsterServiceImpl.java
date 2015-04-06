package net.moonlithome.game.server.monster.serviceImpl;

import net.moonlithome.game.common.dto.monster.MonsterInfoDto;
import net.moonlithome.game.server.monster.mapper.MonsterMapper;
import net.moonlithome.game.server.monster.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by MF on 3/29/2015.
 */
public class MonsterServiceImpl implements MonsterService {

    @Autowired
    private MonsterMapper monsterMapper;

    @Override
    public List<MonsterInfoDto> getMonsterInfo(String monsterId) {
        return monsterMapper.getMonsterInfo(monsterId);
    }
}
