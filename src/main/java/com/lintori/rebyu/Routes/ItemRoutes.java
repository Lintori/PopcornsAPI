package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.Item;
import com.lintori.rebyu.Entities.User;
import com.lintori.rebyu.Generic.Date;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/items")
public class ItemRoutes {

    @GetMapping()
    public ArrayList<Item> getAllItems() {
        ArrayList<Item> allItems = new ArrayList<>();
        allItems.add(new Item(
                (long) 1,
                "title",
                new User(
                        "1",
                        "Mario25",
                        "Mario",
                        "Chan",
                        "profile picture",
                        "email"),
                new Date(
                        2018,
                        11,
                        15
                ),
                new Date(
                        2020,
                        10,
                        15
                )
        ));
        return allItems;
    }

    @GetMapping("/{id}")
    public Item getItem(
            @PathVariable(value="id") int requestID
    ) {
        return new Item(
                (long) 1,
                "title",
                new User(
                        "1",
                        "Mario25",
                        "Mario",
                        "Chan",
                        "profile picture",
                        "email"),
                new Date(
                        2018,
                        11,
                        15
                ),
                new Date(
                        2020,
                        10,
                        15
                )
        );
    }

    @PostMapping()
    public void postItem(
            @RequestBody Item requestItem
    ) {

    }

    @PutMapping("/{id}")
    public void putItem(
            @PathVariable(value="id") int requestID
    ) {

    }

    @DeleteMapping("/{id}")
    public void deleteItem(
            @PathVariable(value="id") int requestID
    ) {

    }

}
