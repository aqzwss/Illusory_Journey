package net.moonlithome.game.common.dto.item;

import net.moonlithome.game.framework.dto.BaseServerDto;

/**
 * Created by neusoft on 2015/3/16.
 */
public class ItemInfoDto extends BaseServerDto{

    private String itemId;
    private String name;
    private String type;
    private String quality;
    private String effect;
    private String effectValue;
    private String subId;
    private int spaceSize;
    private int author;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(String effectValue) {
        this.effectValue = effectValue;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public int getSpaceSize() {
        return spaceSize;
    }

    public void setSpaceSize(int spaceSize) {
        this.spaceSize = spaceSize;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }
}
