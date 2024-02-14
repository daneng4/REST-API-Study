package com.example.restapi.restapidev.repository;

import com.example.restapi.restapidev.domain.Item;
import java.util.List;

public interface ItemRepository {

    Item findById(Long id);
    List<Item> findAll();

    void save(Item item);
    void updateById(Long id, Item item);
    void deleteById(Long id);

}
