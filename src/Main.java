import hiof.frameworks.group15.HTMLMaker;
import hiof.frameworks.group15.HeaderClass;
import hiof.frameworks.group15.MainParts;

import java.io.IOException;

public class Main {

    private  static String[] linksList = new String[]{"www.google.com","www.amazon.com", "www.pottermore.com"};
    private  static String[] linksNameList = new String[]{"google","amazon", "pottermore"};

    static HTMLMaker testHTMLMaker = new HTMLMaker();
    static HeaderClass  headerMaker= new HeaderClass();
    static MainParts mainpart = new MainParts();

    public static void main(String[] args) throws IOException {
        System.out.println("test");


        String article = mainpart.generateArticle("CHEESE IS ON SALE", "Lorem ipsum", "article test", "articleClass");
        System.out.println(article);

        String navListTest = headerMaker.generateNavList(linksList,  linksNameList, "testNavId", "navigation" );
        String footerTest = testHTMLMaker.generateFooter("lmao@outlook.com");




        testHTMLMaker.generateFile("TestFileLinkList", navListTest);
        testHTMLMaker.generateFile("TestFooter", footerTest);


    }
}
