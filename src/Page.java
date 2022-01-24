
//framework for lesing og skriving av filer


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page {

    public void generateFile(String filename) throws IOException {
        String html = ".html";
        //concat binder to strings sammen til en
        filename = filename.concat(html);
        File page = new File(filename);
        if (!page.exists())
            try {
                FileWriter myWriter = new FileWriter(filename);
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }


}