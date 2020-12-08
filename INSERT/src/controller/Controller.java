package controller;

import main.GuiEvent;
import model.*;

import java.util.ArrayList;

public class Controller {

    Database db = new Database();

    public void addUser(GuiEvent e){
        User user = new User(e.getFirstName(),e.getLastName(), e.getEmail());
        db.addUser(user);
    }

    public ArrayList<User> getUsers(){
        return db.getUsers();
    }
}
