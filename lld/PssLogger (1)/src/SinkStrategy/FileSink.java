package SinkStrategy;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileSink implements Sink{
    String filePath ;

    public FileSink(String path){
        this.filePath=path;
    }
    @Override
    public void write(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content+"\n");
            System.out.println("Content has been written to the file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
