package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by demo on 1/17/16.
 */
public class AllProfWindow {
        String show() throws IOException {

            PrintWriter out = new PrintWriter(Connect.getSock().getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(Connect.getSock().getInputStream()));
            String fromUser = "14";
            out.println(fromUser);
            String str = "";
            String fromServer;
            while (in.ready()&&(fromServer = in.readLine()) != null) {
                str = str + fromServer + '\n';
            }
            return str;
        }
    }

