package com.example.restapi.restapidev.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Item {

    private long id; // 물건의 고유 id
    private String name; // 물건의 이름
    private Long count; // 물건 개수

    @Builder
    public Item(String name, Long count){
        this.name = name;
        this.count = count;
    }
    public void initId(Long id){
        this.id = id;
    }
    public void updateItem(String name, Long count){
        this.name = name;
        this.count = count;
    }
}
