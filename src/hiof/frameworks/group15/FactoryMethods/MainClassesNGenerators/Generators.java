package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.MainSection.Footer;
import hiof.frameworks.group15.mainTags.MainTag;

import java.io.IOException;


public class Generators  extends FileGenerator{


    //----------------------------HEADER SECTION---------------------------------//





    public static void createNewHTMLfile(Header header, MainTag maintag, Footer footer, String fileName) throws IOException {
        Page holder = Page.generate(header, maintag, footer);

        generateFile(fileName, holder.toString(), "html");

    }
/*
    public static void createNewCSSfile(CSS,  String fileName){
        CSS holder = generateCSS(fileName, CSS.toString(), "CSS");

        generateFile(fileName, holder.toString(), "html");

    }

 */
    //----------------------------OTHER  METHOD SECTION---------------------------------//




    public String groupUpTagStrings(String[] listOfTags){
        String holder = "";
        for (String tags: listOfTags) {
            holder +=tags +"\n";
        }
        return holder;
    }

    public String groupUpTagString(String tagInFront, String tagAfter){
        String holder = tagInFront + "\n" + tagAfter;

        return holder;
    }
}
