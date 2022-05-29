package CHATBOX;

import java.lang.*;
import java.net.*;
import java.io.*;

public final class Server2 {
    public ServerSocket ss;
    public Socket s;
    public BufferedReader brk;
    public BufferedReader br;
    public String s1, s2;
    public PrintStream ps;

    public Server2() {
        try {
            ss = new ServerSocket(1100);
            s = ss.accept();
            System.out.println("connection Succesful");
            brk = new BufferedReader(new InputStreamReader(System.in));
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());

        } catch (Exception obj) {
        }
    }

    public void cummunicate() {
        try {
            while ((s1 = br.readLine()) != null) {
                System.out.println("Client says :" + s1);
                System.out.println("Enter messsage for client :");
                s2 = brk.readLine();
                ps.println(s2);

            }

        } catch (Exception obj) {
        }
    }

    protected void finalize() {
        this.s = null;
        this.ss = null;
        this.br = null;
        this.brk = null;
        this.ps = null;
        this.s1 = null;
        this.s2 = null;
    }

}
