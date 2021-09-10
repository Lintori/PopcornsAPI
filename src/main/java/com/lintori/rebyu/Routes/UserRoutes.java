package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/users")
public class UserRoutes {

    @GetMapping()
    public ArrayList<User> getAllUsers() {
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(new User(
                "2",
                "imreyes",
                "Jorge",
                "Reyes",
                "profile picture",
                "email"
        ));
        return allUsers;
    }

    @GetMapping("/{id}")
    public User getUser(
            @PathVariable(value="id") int requestID
    ) {
        return new User(
                "2",
                "imreyes",
                "Jorge",
                "Reyes",
                "profile picture",
                "email"
        );
    }

    @PostMapping()
    public void postUser(
            @RequestBody User requestUser
    ) {

    }

    @PutMapping("/{id}")
    public void putUser(
            @PathVariable(value="id") int requestID
    ) {

    }

    @DeleteMapping("/{id}")
    public void deleteUser(
            @PathVariable(value="id") int requestID
    ) {

    }

}
