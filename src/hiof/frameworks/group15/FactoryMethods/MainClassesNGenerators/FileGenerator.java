package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FileGenerator {

    public static void generateFile(String filename, String info, String fileFormat) {
        filename = filename+ "." +fileFormat;
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
