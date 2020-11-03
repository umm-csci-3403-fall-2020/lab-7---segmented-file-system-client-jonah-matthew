package segmentedfilesystem;

import java.util.SortedMap;
import java.util.TreeMap;

public class ReceivedFile {
    // Collects all the packets for a file. SortedMap might be useful.
    SortedMap<Integer, byte[]> sortedMap = new TreeMap<Integer, byte[]>(); 
}
