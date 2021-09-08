package com.lintori.rebyu.Services;

import java.util.*;
import com.lintori.rebyu.Entities.Item;
import com.lintori.rebyu.Repository.ItemRepository;

public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List <Item> findAllMovies(){
        return this.itemRepository.findAll();
    }

    public Item findMovie (String id){
        return this.itemRepository.findById(id).orElse(null);
    }

    public void addMovie (Item item){
        this.itemRepository.save(item);   
    }

    public void updateMovie (Item updatedItem, String id){
        Item item = this.itemRepository.findById(id).orElse(null);
        item.setTitle(updatedItem.getTitle());
        this.itemRepository.save(item);
    }

    public void deleteMovie(String id){
        this.itemRepository.deleteById(id);
    }

    
    
}
