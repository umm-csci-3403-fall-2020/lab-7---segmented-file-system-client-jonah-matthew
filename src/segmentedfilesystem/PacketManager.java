package segmentedfilesystem;

import java.net.DatagramPacket;

public class PacketManager {

    //Decides whether a packet is a header or a data packet, constructs the packet, and adds it to the correct ReceivedFile object
    
    public static void recievePacket(DatagramPacket packet) {
        //I'm unsure what this looks like
        byte[] packetArray = packet.getData();
        
        if((Byte.toUnsignedInt(packetArray[0])%2) == 0 ) {
            //then header packet
        } else {
            //then data packet
        }
    }
}
