package hiof.frameworks.group15;

import hiof.frameworks.group15.headerstuff.*;

import hiof.frameworks.group15.mainTags.*;


public class generators {
    private static final String[] validTypesList = {"text", "email", "date", "image", "password",
            "number", "url", "time", "week"};

    private static Nav generateNav(String[] links, String[] linkText, String navTagID, String navTagClass) {
        Nav navTag = new Nav(links, linkText, navTagID, navTagClass);
        return  navTag;
    }

    private static Header generateHeader(String headline, String paragrap, Nav navList){
        Header headerHolder = new Header(headline, paragrap, navList);
        return  headerHolder;
    }
    private Header generateHeader(String headline, String paragrap){
        Header headerHolder = new Header(headline, paragrap);
        return  headerHolder;
    }
    private Header generateHeader(String headline){
        Header headerHolder = new Header(headline);
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

    private  Section generateSection(Article[] articles){
        Section holder = new Section(articles);
        return  holder;
    }



    private MainTag generateMainTag(String  info){
        MainTag holder = new MainTag(info);
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
}
