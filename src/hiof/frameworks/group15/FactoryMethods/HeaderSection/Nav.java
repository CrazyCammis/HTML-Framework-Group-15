package hiof.frameworks.group15.FactoryMethods.HeaderSection;
/**
 * Nav class for HTML nav tag
 * @author Anders Grindal
 *
 */
public class Nav {
   private String[] links, linkText;
   private  String navTagID, navTagClass;

    private String[] getLinks() {
        return links;
    }
    private String[] getLinkText() {
        return linkText;
    }

    /**
     * getter for ID 
     * @return ID identifier 
     */
    public String getID() {
        return navTagID;
    }
    /**
     * getter for class 
     * @return class identifier 
     */
    public String getClassName() {
        return navTagClass;
    }

    private Nav(String[] links, String[] linkText, String navTagID, String navTagClass) {
        this.links = links;
        this.linkText = linkText;
        this.navTagID = navTagID;
        this.navTagClass = navTagClass;
    }


    /**
     * Generates a Nav with links, click able text with n text that takes you to said links websites,
     *  an ID for CSS reference and a class identifier for CSS reference
     * @param links List of links
     * @param linkText List of chosen text
     * @param navTagID ID identifier
     * @param navTagClass class Identifer (CSS)
     * @return Generated nav object with links, texts, id and class
     */
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

    /**
     * To string method
     */
    @Override
    public String toString() {
        return generateNavListString(getLinks(), getLinkText(), getID(), getClassName());
    }
}
