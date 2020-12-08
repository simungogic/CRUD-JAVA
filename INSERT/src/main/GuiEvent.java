package main;

import java.util.EventObject;

public class GuiEvent extends EventObject {
    private String firstName;
    private String lastName;
    private String email;

    public GuiEvent(Object source) {
        super(source);
    }

    public GuiEvent(Object source, String firstName, String lastName, String email) {
        super(source);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
