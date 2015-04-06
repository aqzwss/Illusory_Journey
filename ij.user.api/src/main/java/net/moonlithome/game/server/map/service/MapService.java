package net.moonlithome.game.server.map.service;

import net.moonlithome.game.common.dto.map.MapInfoDto;

import java.util.List;

/**
 * Created by MF on 3/29/2015.
 */
public interface MapService {

    /**
     * get map information
     * @param mapId
     * @return
     */
    public List<MapInfoDto> getMapInfo(String mapId);

    /**
     * move user from current map to new map
     * @param userId
     * @param currentMapId
     * @param targetMapId
     */
    public void moveMap(String userId, String currentMapId, String targetMapId);

    /**
     * get sendable map
     * @param mapId
     * @return
     */
    public List<MapInfoDto> getSendableMap(String mapId);
}
