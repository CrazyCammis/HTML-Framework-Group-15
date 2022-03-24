import hiof.frameworks.group15.Page;

import java.io.IOException;

public class Main {

    static Page testPage = new Page("ree");

    public static void main(String[] args) throws IOException {
        System.out.println("test");


        testPage.generateFile("TestFile", "ree");

    }
}
