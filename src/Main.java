import hiof.frameworks.group15.Page;

import java.io.IOException;

public class Main {

    private  static String[] linksList = new String[]{"www.google.com","www.amazon.com", "www.pottermore.com"};
    private  static String[] linksNameList = new String[]{"google","amazon", "pottermore"};

    static Page testPage = new Page("ree");

    public static void main(String[] args) throws IOException {
        System.out.println("test");

        String navListTest = testPage.generateNavList(linksList,  linksNameList, "testNavId", "navigation" );
        testPage.generateFile("TestFileLinkList", navListTest);

    }
}
