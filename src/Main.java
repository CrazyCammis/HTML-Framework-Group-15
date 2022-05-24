import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.HeaderSection.Nav;
import hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators.CSS;
import hiof.frameworks.group15.FactoryMethods.SubObjects.CSSBracket;

import java.io.IOException;

public class Main {

    private  static String[] linksList = new String[]{"www.google.com","www.amazon.com", "www.pottermore.com"};
    private  static String[] linksNameList = new String[]{"google","amazon", "pottermore"};
    
    public static void main(String[] args) throws IOException {


        Nav navigation = Nav.generate(linksList, linksNameList, "mainNav",
                "navClass");



        Header header = Header.generate("HIOF HJEMMESIDE", navigation);
























        CSSBracket h4 = CSSBracket.generate("main", "tag");
        CSSBracket h2 = CSSBracket.generate("erw2", "class");
        CSSBracket h3 = CSSBracket.generate("erw5", "id");

        h4.addFontSize("px", 23);
        h2.setInline();
        h3.setInline();


        CSSBracket[] list = new CSSBracket[]{h4, h2, h3};

        CSS holder = CSS.generate(list);
        holder.generateFile("reee");

        System.out.println(holder.toString()+ "reeee");


    }
}
