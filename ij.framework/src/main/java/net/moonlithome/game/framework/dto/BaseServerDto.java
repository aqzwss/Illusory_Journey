package net.moonlithome.game.framework.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by MF on 3/14/2015.
 */
public class BaseServerDto implements Serializable {
    private int id;
    private Date createTime;
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
