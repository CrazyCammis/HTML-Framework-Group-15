import hiof.frameworks.group15.HTMLMaker;
import hiof.frameworks.group15.HeaderClass;

import java.io.IOException;

public class Main {

    private  static String[] linksList = new String[]{"www.google.com","www.amazon.com", "www.pottermore.com"};
    private  static String[] linksNameList = new String[]{"google","amazon", "pottermore"};

    static HTMLMaker testHTMLMaker = new HTMLMaker();
    static HeaderClass  headerMaker= new HeaderClass();

    public static void main(String[] args) throws IOException {
        System.out.println("test");

        String navListTest = headerMaker.generateNavList(linksList,  linksNameList, "testNavId", "navigation" );
        String footerTest = testHTMLMaker.generateFooter("lmao@outlook.com");



        testHTMLMaker.newHTMLFile("TestFileLinkList", navListTest);
        testHTMLMaker.newHTMLFile("TestFooter", footerTest);


    }
}
