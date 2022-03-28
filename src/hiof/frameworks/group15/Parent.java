package hiof.frameworks.group15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

abstract class Parent {


    protected void generateFile(String filename, String info, String fileType) throws IOException {

        //concat binder to strings sammen til en
        filename = filename.concat(fileType);
        File page = new File(filename);
        if (!page.exists())
            try {
                FileWriter myWriter = new FileWriter(filename);
                myWriter.write(info);
                myWriter.close();
                System.out.println("Successfully wrote to the file: " + info);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

