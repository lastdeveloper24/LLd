package SinkStrategy;

import java.io.*;
import java.util.*;
import java.nio.file.*;


public class FileSink implements Sink{
    String filePath ;
    public static int fileCount ;
    public FileSink(String path){
        this.filePath=path;
    }
    @Override

    public void write(String content) {
        String currentPath = null;
        try {
            currentPath = new java.io.File(".").getCanonicalPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(currentPath);

        String theFilePath = currentPath+filePath;


        try (FileReader fileReader = new FileReader(theFilePath)){

            int charCount = 0 ;
            int readChar;
            String str="";

            while((readChar = fileReader.read()) != -1){
                str += (char)readChar;
                charCount++;
            }

            int totalCharCount = charCount+content.length();
            List<String> fileNames=new ArrayList<>();
            if(totalCharCount>500){
                String directoryPath = currentPath+"/Sinks";
                try {
                    fileNames = listFileNamesInDirectory(directoryPath);
                    for (String fileName : fileNames) {
                        System.out.println(fileName);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                fileCount = fileNames.size();
                String newFilePath = currentPath+ "/Sinks/ApplicationLog" +Integer.toString(fileCount);
                fileCount++;
                try(FileWriter nfw = new FileWriter(newFilePath,true); FileWriter fw = new FileWriter(theFilePath)){
                        nfw.write(str);
                        fw.write(content);

                }
                catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                try(FileWriter fw = new FileWriter(theFilePath, true)){
                    fw.write(content+"\n");
                    System.out.println("Content has been written to the file: " + theFilePath);
                }
                catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    List<String> listFileNamesInDirectory(String directoryPath) throws IOException {
        List<String> fileNames = new ArrayList<>();
        Path dir = Paths.get(directoryPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file : stream) {
                if (Files.isRegularFile(file)) {
                    fileNames.add(file.getFileName().toString());
                }
            }
        }

        return fileNames;
    }
}
