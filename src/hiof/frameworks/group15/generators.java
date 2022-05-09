package hiof.frameworks.group15;

import hiof.frameworks.group15.CSSStuff.CSS;
import hiof.frameworks.group15.headerstuff.*;

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
//HOW TO USE THIS?

    private CSS generateCSS(){
        CSS holder = new CSS("");
        return  holder;
    }


    private  Paragraph generateParagraph(String info, String paragraphID){
        Paragraph holder = new Paragraph(info, paragraphID);
        return  holder;
    }
    private  Nav generateNav(String[] links, String[] linkText, String navTagID, String navTagClass) {
        Nav navTag = new Nav(links, linkText, navTagID, navTagClass);
        return  navTag;
    }

    private Header generateHeader(String headline){
        Header headerHolder = new Header(headline);
        return  headerHolder;
    }

    private Header generateHeader(String headline, String paragrap){
        Header headerHolder = new Header(headline, paragrap);
        return  headerHolder;
    }

    private Header generateHeader(String headline, Paragraph paragrap){
        Header headerHolder = new Header(headline, paragrap);
        return  headerHolder;
    }
    private  Header generateHeader(String headline, String paragrap, Nav navList){
        Header headerHolder = new Header(headline, paragrap, navList);
        return  headerHolder;
    }

    private  Header generateHeader(String headline, Paragraph paragrap, Nav navList){
        Header headerHolder = new Header(headline, paragrap, navList);
        return  headerHolder;
    }




    private Form generateForm(String title, String formID, FormOption[] formOptions){
        Form holder = new Form(title, formID, formOptions);
        return holder;
    }


    private FormOption generateFormOption(String formOptionID, String description, String type){
        if(!typeValid(type)){
            System.out.println("ERROR WRONG TYPE INSERTET ON FORM OPTION "+ formOptionID
                    + " WITH DESCRITPTION OF \n"
                    + description );
        }
        FormOption holder =   new FormOption(formOptionID, description, type);
        return holder;
    }




    private Article generateArticle(String title, String paragraph, String articleID, String groupClass){
        Article holder = new Article(title, paragraph, articleID, groupClass);
        return  holder;
    }

    private Article generateArticle(String title, Paragraph paragraph, String articleID, String groupClass){
        Article holder = new Article(title, paragraph, articleID, groupClass);
        return  holder;
    }

    private  Section generateSection(Article[] articles){
        Section holder = new Section(articles);
        return  holder;
    }



    private MainTag generateMainTag(String  info){
        MainTag holder = new MainTag(info);
        return  holder;
    }

    private  Image generateImage(String url, String caption, String imageID, String imageClass){
        Image holder = new Image(url, caption, imageID, imageClass);
        return  holder;
    }

    private  Footer generateFooter(String email){
        Footer holder = new Footer(email);
        return  holder;
    }

    private  Footer generateFooter(String email, String info1){
        Footer holder = new Footer(email, info1);
        return  holder;
    }

    private  Footer generateFooter(String email, String info1,String info2){
        Footer holder = new Footer(email, info1, info2);
        return  holder;
    }

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
