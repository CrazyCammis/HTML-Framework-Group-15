package hiof.frameworks.group15;

import hiof.frameworks.group15.headerstuff.Header;
import hiof.frameworks.group15.headerstuff.Nav;
import hiof.frameworks.group15.mainTags.FormOption;

public class generators {

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

//CHECK IF FORM OPTION IS VAID HERE
    private FormOption genFormOption(String formOptionID, String description, String type){
        if(!typeValid)

    }


    private typeValid(String check)
}
