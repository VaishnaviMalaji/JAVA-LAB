import java.io.*;

public class IPCExample {
    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Sender sender = new Sender(pos);
        Receiver receiver = new Receiver(pis);

        sender.start();
        receiver.start();
    }
}
