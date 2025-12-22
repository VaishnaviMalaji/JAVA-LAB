import java.io.*;

class Sender extends Thread {
    PipedOutputStream out;

    Sender(PipedOutputStream out) {
        this.out = out;
    }

    public void run() {
        try {
            String msg = "Hello, Welcome to Java Lab from Sender Thread";
            out.write(msg.getBytes());
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}