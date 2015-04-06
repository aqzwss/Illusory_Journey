package net.moonlithome.game.server.map.serviceImpl;

import net.moonlithome.game.common.dto.map.MapInfoDto;
import net.moonlithome.game.server.map.mapper.MapMapper;
import net.moonlithome.game.server.map.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by MF on 3/29/2015.
 */
public class MapServiceImpl implements MapService{

    @Autowired
    private MapMapper mapMapper;

    @Override
    public List<MapInfoDto> getMapInfo(String mapId) {
        List<MapInfoDto> resultMap;
        resultMap =  mapMapper.getMapInfo(mapId);
        if(resultMap != null){
            return resultMap;
        } else {
            return new ArrayList<MapInfoDto>();
        }
    }

    @Override
    public void moveMap(String userId, String currentMapId, String targetMapId) {

    }

    @Override
    public List<MapInfoDto> getSendableMap(String mapId) {
        MapInfoDto currentMap = this.getMapInfo(mapId).get(0);
        MapInfoDto cacheMap = null;
        List<MapInfoDto> resultMapList = new ArrayList<MapInfoDto>();
        if(currentMap != null){
            String[] sendableIdList = currentMap.getSend().split(",");
            for(int i=0; i < sendableIdList.length; i++){
                cacheMap = this.getMapInfo(sendableIdList[i]).get(0);
                if(cacheMap != null){
                    resultMapList.add(cacheMap);
                }
            }
        }
        return resultMapList;
    }
}
