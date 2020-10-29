package segmentedfilesystem;

public class Packet {
    
    //Abstract class that has the shared logic like getFileID()

    //Two kinds of packets, header and data

    //Packet starts with status byte, even means header packet, odd means data packet
    //If the second byte is also 1 so ...11, it is the last data packs of the file

    public int getFileID(byte[] bytes){
        int x = Byte.toUnsignedInt(bytes[1]);

        return x;
    }
}
