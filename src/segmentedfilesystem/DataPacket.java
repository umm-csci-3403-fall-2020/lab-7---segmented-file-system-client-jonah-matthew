package segmentedfilesystem;

public class DataPacket extends Packet{
    
    //Parses the packet data as a data packet. Has methods like getData() and isLastPacket()

    //1 status byte | 1 file ID byte | 2 packet number bytes | rest of bytes are data

    public byte[] getData(byte[] bytes){

        return ;
    }

    public int returnPacketNumber(byte[] bytes){
        //This is to get packet number
        int x = Byte.toUnsignedInt(bytes[2]);
        int y = Byte.toUnsignedInt(bytes[3]);

        int packetNumber = (256*x) + y;
        return packetNumber;
    }

    public boolean isLastPacket(byte[] bytes){
        if(Byte.toUnsignedInt(bytes[0])%4 == 3 ){
            return true;
        } else {
            return false;
        }
    }
  
}


