package com.example.restapi.restapidev.service;

import com.example.restapi.restapidev.domain.Item;
import com.example.restapi.restapidev.dto.ItemDto;
import com.example.restapi.restapidev.repository.ItemRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public void saveItem(ItemDto itemDto){
        Item item = Item.builder()
                .name(itemDto.getName())
                    .count(itemDto.getCount())
                        .build();

        itemRepository.save(item);
    }

    public ItemDto findItemById(Long id){
        Item item = itemRepository.findById(id);

        return ItemDto.builder()
            .id(item.getId())
            .name(item.getName())
            .count(item.getCount())
            .build();
    }

    public List<ItemDto> findAllItem(){
        return itemRepository.findAll()
            .stream()
            .map(item ->ItemDto.builder()
                .id(item.getId())
                .name(item.getName())
                .count(item.getCount())
                .build())
                .toList();
    }

    public void updateItemById(Long id, ItemDto itemDto){
        Item findItem = itemRepository.findById(id);
        findItem.updateItem(itemDto.getName(), itemDto.getCount());

        itemRepository.updateById(id, findItem);
    }

    public void deleteItemById(Long id){
        itemRepository.deleteById(id);
    }
}
