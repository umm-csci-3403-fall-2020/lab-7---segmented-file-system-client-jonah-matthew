package segmentedfilesystem;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FileRetriever {
        String retrievedServer;
        int retrievedPort;

        public FileRetriever(String server, int port) {
                // Save the server and port for use in `downloadFiles()`
                // ...
                retrievedServer = server;
                retrievedPort = port;
        }

        public void downloadFiles() throws IOException {
        // Do all the heavy lifting here.
        // This should
        //   * Connect to the server
        //   * Download packets in some sort of loop
        //   * Handle the packets as they come in by, e.g.,
        //     handing them to some PacketManager class
        // Your loop will need to be able to ask someone
        // if you've received all the packets, and can thus
        // terminate. You might have a method like
        // PacketManager.allPacketsReceived() that you could
        // call for that, but there are a bunch of possible
        // ways.
                DatagramSocket socket = new DatagramSocket();
                byte[] sendBuf = new byte[1028];
                InetAddress address = InetAddress.getByName(retrievedServer);
        
                byte[] buf = new byte[1028];
                DatagramPacket packet = new DatagramPacket(buf, buf.length, address, retrievedPort);
                socket.send(packet);
        
                while(true){
                        packet = new DatagramPacket(buf, buf.length);
                        socket.receive(packet);

                        // Give packet to PacketManager.java
                        PacketManager.recievePacket(packet);
                }
                //socket.close();
	}
}
