package net.moonlithome.game.server.item.service;

import net.moonlithome.game.common.dto.item.ItemInfoDto;

/**
 * Created by moonlithome on 2015/3/18.
 */
public interface ItemOperationService {

    public void createItem(String userId, ItemInfoDto itemInfoDto);

    public void itemMove(String senderId, String receiverId, String itemId);

    public void useItem(String userId, String itemId);




}
