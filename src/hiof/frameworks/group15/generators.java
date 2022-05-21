package hiof.frameworks.group15;

import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.MainSection.Footer;
import hiof.frameworks.group15.mainTags.MainTag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Generators {


    public static void generateFile(String filename, String info, String type) {
        filename = filename.concat("." + type);
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

    //----------------------------HEADER SECTION---------------------------------//





    public static void createNewHTMLfile(Header header, MainTag maintag, Footer footer, String fileName){
        Page holder =Page.generate(header, maintag, footer);

        generateFile(fileName, holder.toString(), "html");

    }
/*
    public static void createNewCSSfile(CSS,  String fileName){
        CSS holder = generateCSS(fileName, CSS.toString(), "CSS");

        generateFile(fileName, holder.toString(), "html");

    }

 */
    //----------------------------OTHER  METHOD SECTION---------------------------------//

    private String[]  idChecker(String[] toCheck, String typeName){
        for (int i = 0; i <toCheck.length; i++) {
            toCheck[i] = typeName +i;
        }
        return  toCheck;
    }



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
