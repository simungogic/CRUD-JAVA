package model;

import java.util.ArrayList;

public class Database {
    private ArrayList<User> users;

    public Database(){
        users = new ArrayList<User>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }
}
