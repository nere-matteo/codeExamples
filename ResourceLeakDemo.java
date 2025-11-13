import java.io.*;

public class ResourceLeakDemo {
    public void loadFile() throws Exception {
        FileInputStream fis = new FileInputStream("data.txt");
        byte[] buffer = new byte[50];
        fis.read(buffer);
    }
}