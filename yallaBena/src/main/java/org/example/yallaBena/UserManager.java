package org.example.yallaBena;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class UserManager {

    private static List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public static List<User> getUsers (){
        return users;
    }

    public void removeUser(String userId) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (Objects.equals(user.getId(), userId)) {
                iterator.remove();
                break; // Stop after removing the user with matching ID
            }
        }
    }

    public User getUser(String userId) {
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }
        return null; // User not found
    }
}


