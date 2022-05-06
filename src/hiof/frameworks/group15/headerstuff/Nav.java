package hiof.frameworks.group15.headerstuff;

import java.util.Arrays;

public class Nav {
   private String[] links, linkText;
   private  String navTagID, navTagClass;

    private String[] getLinks() {
        return links;
    }

    private String[] getLinkText() {
        return linkText;
    }

    private String getNavTagID() {
        return navTagID;
    }

    private String getNavTagClass() {
        return navTagClass;
    }

    public Nav(String[] links, String[] linkText, String navTagID, String navTagClass) {
        this.links = links;
        this.linkText = linkText;
        this.navTagID = navTagID;
        this.navTagClass = navTagClass;
    }

    private String generateNavListString(String[] links, String[] linkText, String navTagId, String navTagClas) {
        int size = links.length;
        String nav = "  <nav id=\"" + navTagId + "\" class= \"" + navTagClas + "\">\n"+
                "       <ul> \n";


        for (int i = 0; i < size; i++) {
            nav = nav.concat("          <li><a href=\"" + links[i] + "\">" + linkText[i] + "</a></li>\n");
        }

        nav = nav.concat("      </ul>\n   </nav>\n");
        return nav;
    }

    @Override
    public String toString() {
        String navTag = generateNavListString(getLinks(), getLinkText(),getNavTagID(), getNavTagClass());
        return navTag;
    }
}
