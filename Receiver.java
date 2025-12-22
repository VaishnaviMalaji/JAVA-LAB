import java.io.*;


class Receiver extends Thread {
    PipedInputStream in;

    Receiver(PipedInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
