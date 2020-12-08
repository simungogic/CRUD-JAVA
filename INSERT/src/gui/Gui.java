package gui;

import main.GuiEvent;
import main.GuiListener;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JButton insertBtn;
    private JPanel panel;
    private JLabel lastNameLbl;
    private JLabel firstNameLbl;
    private JLabel emailLbl;
    private JTextField firstNameTxt;
    private JTextField lastNameTxt;
    private JTextField emailTxt;
    private GuiListener guiListener;

    public Gui(int width, int height){
        super("CRUD");
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        insertBtn = new JButton("INSERT");

        firstNameLbl = new JLabel("Ime");
        lastNameLbl = new JLabel("Prezime");
        emailLbl = new JLabel("Email");

        firstNameLbl.setBounds(50,50,100,20);
        lastNameLbl.setBounds(50,100,100,20);
        emailLbl.setBounds(50,150,100,20);

        firstNameTxt = new JTextField();
        lastNameTxt = new JTextField();
        emailTxt = new JTextField();

        firstNameTxt.setBounds(150,50,200,20);
        lastNameTxt.setBounds(150,100,200,20);
        emailTxt.setBounds(150,150,200,20);

        insertBtn.setBounds(150,200,100,30);

        panel.add(firstNameTxt);
        panel.add(lastNameTxt);
        panel.add(emailTxt);
        panel.add(lastNameLbl);
        panel.add(emailLbl);
        panel.add(firstNameLbl);
        panel.add(insertBtn);

        setVisible(true);
        insertBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameTxt.getText().trim();
                String lastName = lastNameTxt.getText().trim();
                String email = emailTxt.getText().trim();

                GuiEvent fev = new GuiEvent(this, firstName, lastName, email);
                guiListener.guiEventOccured(fev);
            }
        });

    }
    public void setGuiListener(GuiListener listener){
        this.guiListener = listener;
    }
}
