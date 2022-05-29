package CHATBOX;

import java.lang.*;
import java.net.*;
import java.io.*;

public final class Client2 {
    public Socket s;
    public BufferedReader brk;
    public BufferedReader br;
    public PrintStream ps;
    String s1, s2;

    public Client2() {
        try {
            s = new Socket("localhost", 1100);
            brk = new BufferedReader(new InputStreamReader(System.in));
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());
        } catch (Exception obj) {
        }
    }

    public void Communicate() {
        try {
            while (!(s1 = brk.readLine()).equals("end")) {
                ps.println(s1);
                s2 = br.readLine();
                System.out.println("Server says :" + s2);
                System.out.println("enter message for server :");

            }
        } catch (Exception obj) {
        }
    }

    protected void finalize() {
        this.s = null;
        this.brk = null;
        this.br = null;
        this.ps = null;
        this.s1 = null;
        this.s2 = null;
    }
}
