package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File generator class for FileGenerator
 * @author ander
 *
 */
public abstract class FileGenerator {

	/**
	 * Creates file for storage of bits of tags instead a completly new page
	 * @param filename filename for the new file
	 * @param info What the file will contain
	 * @param fileFormat what kind of file it will be
	 */
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
        else
            throw new ArithmeticException("Error, file already exsist");
    }

}
