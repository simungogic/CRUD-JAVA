package main;

import gui.Gui;
import controller.*;
import model.User;

public class Crud {

    public static void main(String[] args){

        Gui gui = new Gui(500,500);
        Controller controller = new Controller();
        gui.setGuiListener(new GuiListener(){
            public void guiEventOccured(GuiEvent e){

               controller.addUser(e);

            }
        });


    }
}
