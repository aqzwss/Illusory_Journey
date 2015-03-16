package net.moonlithome.game.common.dto.map;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by neusoft on 2015/3/16.
 */
public class MapInfoDto extends BaseServerDto {

    private int mapId;
    private String name;
    private int send;
    private int receive;
    private String monster;

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public int getReceive() {
        return receive;
    }

    public void setReceive(int receive) {
        this.receive = receive;
    }

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }
}
