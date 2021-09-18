package Chat;
import lombok.SneakyThrows;
import Server.MyServer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;


public class RegistrationWindow extends JFrame implements ActionListener , Client, Runnable{

    private Server.MyServer MyServer;
    private Socket socket;


    JTextField loginText, passwordText;
    JLabel panelPassword, panelLogin;
    JButton buttonConnect;

    public RegistrationWindow(Socket socket, Server.MyServer server) {
        this.socket = socket;
        this.MyServer = server;
    }


    public void startRegistration() {

        buttonConnect = new JButton("connect");

        // Создание текстовых полей
        loginText = new JTextField(15);
        loginText.setBounds(100,20,165,25);

        //
        panelPassword = new JLabel("password");
        panelPassword.setBounds(10,50,80,25);

        panelLogin = new JLabel("login");
        panelLogin.setBounds(10,20,80,25);

        buttonConnect.setBounds(200,150,160,50);
        buttonConnect.setFocusable(false);

        // Поле с паролем
        passwordText = new JTextField(15);
        passwordText.setBounds(100,50,165,25);

        // Создание панели с текстовыми полями
        JPanel contents = new JPanel();
        contents.add(panelLogin);
        contents.add(loginText);
        contents.add(panelPassword);
        contents.add(passwordText);
        contents.add(buttonConnect);
        setContentPane(contents);

        // Определяем размер окна и выводим его на экран
        setSize(250 , 150);
        setVisible(true);

    }


    @Override
    public void login() {
        String login = loginText.getText();
    }

    @Override
    public void password() {
        String password = passwordText.getText();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void run() {

    }
}
