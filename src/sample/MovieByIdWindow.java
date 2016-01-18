package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by yardengum on 1/17/16.
 */
public class MovieByIdWindow {
    public String show(String id){
        try {
            String fromUser = "7 " + id;
            PrintWriter out = new PrintWriter((Connect.getSock()).getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader((Connect.getSock()).getInputStream()));
            out.println(fromUser);
            String fromServer="";
            String str;
            while (in.ready()&&(str = in.readLine()) != null){
                fromServer = fromServer +  str +'\n';
            }
            return fromServer;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
