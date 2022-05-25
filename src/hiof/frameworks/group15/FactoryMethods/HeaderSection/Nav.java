package hiof.frameworks.group15.FactoryMethods.HeaderSection;

public class Nav {
   private String[] links, linkText;
   private  String navTagID, navTagClass;

    private String[] getLinks() {
        return links;
    }
    private String[] getLinkText() {
        return linkText;
    }
    public String getID() {
        return navTagID;
    }
    public String getClassName() {
        return navTagClass;
    }

    private Nav(String[] links, String[] linkText, String navTagID, String navTagClass) {
        this.links = links;
        this.linkText = linkText;
        this.navTagID = navTagID;
        this.navTagClass = navTagClass;
    }


    public static   Nav generate(String[] links, String[] linkText, String navTagID, String navTagClass) {
        return new Nav(links, linkText, navTagID, navTagClass);
    }

    private String generateNavListString(String[] links, String[] linkText, String navTagId, String navTagClass) {
        int size = links.length;
        String nav = "  <nav id=\"" + navTagId + "\" class= \"" + navTagClass + "\">\n"+
                "       <ul> \n";

        for (int i = 0; i < size; i++) {
            nav = nav.concat("          <li><a href=\"" + links[i] + "\">" + linkText[i] + "</a></li>\n");
        }
        nav = nav.concat("      </ul>\n   </nav>\n");
        return nav;
    }

    @Override
    public String toString() {
        return generateNavListString(getLinks(), getLinkText(), getID(), getClassName());
    }
}
