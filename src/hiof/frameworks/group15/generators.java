package hiof.frameworks.group15;

import hiof.frameworks.group15.CSSStuff.CSS;
import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.HeaderSection.Nav;
import hiof.frameworks.group15.FactoryMethods.MaimSection.Article;
import hiof.frameworks.group15.FactoryMethods.MaimSection.Footer;
import hiof.frameworks.group15.mainTags.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class generators {
    private static final String[] validTypesList = {"text", "email", "date", "image", "password",
            "number", "url", "time", "week"};

    public void generateFile(String filename, String info, String type) {
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



    public static Header generateHeader(String headline){
        return  Header.generateHeader(headline);
    }

    public static Header generateHeader(String headline, String paragrap){
        return  Header.generateHeader(headline, paragrap);
    }

    public static Header generateHeader(String headline, Paragraph paragrap){
        return  Header.generateHeader(headline, paragrap);
    }

    public static  Header generateHeader(String headline, String paragrap, Nav navList){
        return  Header.generateHeader(headline, paragrap, navList);
    }

    public static  Header generateHeader(String headline, Paragraph paragrap, Nav navList){
        return  Header.generateHeader(headline, paragrap, navList);
    }

    public static  Nav generateNav(String[] links, String[] linkText, String navTagID, String navTagClass) {
        return Nav.generateNav(links, linkText, navTagID, navTagClass);
    }


    //----------------------------MAIN SECTION---------------------------------//


    public static Article generateArticle(String title, String paragraph, String articleID, String groupClass){
        return Article.generateArticle(title, paragraph, articleID, groupClass);
    }

    public static Article generateArticle(String title, Paragraph paragraph, String articleID, String groupClass){
        return Article.generateArticle(title, paragraph, articleID, groupClass);
    }


    public static  Footer generateFooter(String email){
        return Footer.generateFooter(email);
    }
    public static Footer generateFooter(String email, String info1){
        return Footer.generateFooter(email, info1);
    }

    public static  Footer generateFooter(String email, String info1,String info2){
        return Footer.generateFooter(email, info1, info2);
    }


    public static Form generateForm(String title, String formID, FormOption[] formOptions){
        return  Form.generateForm(title, formID, formOptions);
    }


    //----------------------------OTHER SECTION---------------------------------//

    public static CSS generateCSS(){
        CSS holder = new CSS("");
        return  holder;
    }





    public static FormOption generateFormOption(String formOptionID, String description, String type){
        if(!typeValid(type)){
            System.out.println("ERROR WRONG TYPE INSERTET ON FORM OPTION "+ formOptionID
                    + " WITH DESCRITPTION OF \n"
                    + description );
        }
        FormOption holder =   new FormOption(formOptionID, description, type);
        return holder;
    }

    public static  Image generateImage(String url, String caption, String imageID, String imageClass){
        Image holder = new Image(url, caption, imageID, imageClass);
        return  holder;
    }

    public static MainTag generateMainTag(String  info){
        MainTag holder = new MainTag(info);
        return  holder;
    }

    public static MainTag generateMainTag(String[]  info){
        MainTag holder = new MainTag(info);
        return  holder;
    }


    public static  Paragraph generateParagraph(String info, String paragraphID){
        Paragraph holder = new Paragraph(info, paragraphID);
        return  holder;
    }


    public static  Section generateSection(Article[] articles){
        Section holder = new Section(articles);
        return  holder;
    }




    //----------------------------OTHER  SECTION---------------------------------//

    private String[]  idChecker(String[] toCheck, String typeName){
        for (int i = 0; i <toCheck.length; i++) {
            toCheck[i] = typeName +i;
        }
        return  toCheck;
    }

    private boolean typeValid(String check){
        for(String types : validTypesList){
            if(check.equals(types)){
                return true;
            }
        }
        return false;
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
