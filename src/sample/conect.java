package sample;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by demo on 1/15/16.
 */
public class conect {

    private static Socket socket = null;

    public static Socket getSock(){
        return socket;
    }
    public static void setSock(int port ,String ip) throws IOException {
        socket = new Socket(ip,port);;
    }
}
