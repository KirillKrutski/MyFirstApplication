package Server;

import Chat.RegistrationWindow;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
    public final static int PORT = 8290;
    private volatile List<Client> clients = new ArrayList<Client>();

    public void start(){
        System.out.println("==START SERVER==");
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            Socket socket = null;
            while (true) {
                if (socket == null) {
                    socket = serverSocket.accept();
                } else {
                    RegistrationWindow clientEntity = new RegistrationWindow(socket , this);
                    new Thread(clientEntity).start();
                    socket = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
