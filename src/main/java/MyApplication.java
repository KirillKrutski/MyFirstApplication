import Chat.RegistrationWindow;
import Chat.ServiceStart;
import Chat.ServiceStartImpl;
import Server.MainServer;
import Server.MyServer;
import jdk.tools.jaotc.Main;

public class MyApplication extends MyServer {
    public void main(String[] args) {
        ServiceStart serviceStart = new ServiceStartImpl(8290 , );
        serviceStart.start(); // application start
    }
}
