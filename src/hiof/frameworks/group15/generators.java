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


    private Form genForm(String title, String formID, FormOption[] formOptions){
        Form holder = new Form(title, formID, formOptions);
    }


    private FormOption genFormOption(String formOptionID, String description, String type){
        if(!typeValid(type)){
            System.out.println("ERROR WRONG TYPE INSERTET ON FORM OPTION "+ formOptionID
                    + " WITH DESCRITPTION OF \n"
                    + description );
        }
        FormOption holder =   new FormOption(formOptionID, description, type);
        return holder;
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
