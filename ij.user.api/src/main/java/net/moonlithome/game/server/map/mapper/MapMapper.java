package net.moonlithome.game.server.map.mapper;

import net.moonlithome.game.common.dto.map.MapInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by MF on 3/29/2015.
 */
public interface MapMapper {

    List<MapInfoDto> getMapInfo(@Param(value = "mapId")String mapId);

}
