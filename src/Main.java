import hiof.frameworks.group15.HTMLParts.HTMLMaker;
import hiof.frameworks.group15.HTMLParts.HeaderClass;
import hiof.frameworks.group15.HTMLParts.MainParts;

import java.io.IOException;

public class Main {

    private  static String[] linksList = new String[]{"www.google.com","www.amazon.com", "www.pottermore.com"};
    private  static String[] linksNameList = new String[]{"google","amazon", "pottermore"};

    static HTMLMaker testHTMLMaker = new HTMLMaker();
    static HeaderClass  headerMaker= new HeaderClass();
    static MainParts.Builder mainpart1 = MainParts.Builder.setArticle("CHEESE IS ON SALE", "Lorem ipsum", "article test", "articleClass");

    public static void main(String[] args) throws IOException {
        System.out.println("test");


        //mainpart.setArticle("CHEESE IS ON SALE", "Lorem ipsum", "article test", "articleClass");
        System.out.println(mainpart1);

        String navListTest = headerMaker.generateNavList(linksList,  linksNameList, "testNavId", "navigation" );
        String footerTest = testHTMLMaker.generateFooter("lmao@outlook.com");




        testHTMLMaker.newHTMLFile("TestFileLinkList", navListTest);
        testHTMLMaker.newHTMLFile("TestFooter", footerTest);


    }
}
