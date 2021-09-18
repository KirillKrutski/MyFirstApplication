package Chat;


import Server.MyServer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;


public class ServiceStartImpl extends RegistrationWindow implements ServiceStart , ActionListener {

    public ServiceStartImpl(Socket socket, MyServer server){
        super(socket, server);
    }

    @Override
    public void start() {

        //create objects
        JFrame chatJFrame = new JFrame("KruChat");
        JButton registrationButton = new JButton("registration");
        //JPanel panel = new JPanel();


        // window
        chatJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatJFrame.setSize(540 , 360); // size of application
        chatJFrame.setLayout(null);
        chatJFrame.setVisible(true);

        // add button "registration"
        registrationButton.setBounds(160, 120, 200,40);
        registrationButton.setFocusable(false);
        registrationButton.addActionListener(this);
        chatJFrame.add(registrationButton);

        //
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        startRegistration();
    }

}
