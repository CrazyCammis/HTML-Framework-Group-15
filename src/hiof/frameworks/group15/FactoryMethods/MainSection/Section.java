package hiof.frameworks.group15.FactoryMethods.MainSection;
/**
 * Section class for HTML section tag
 * @author Anders Grindal
 *
 */
public class Section {
    private final Article[] articles;
    private final String sectionID;
    private final String sectionClass;

    /**
     * Getter for ID
     * @return ID identifier
     */
    public String getID() { return sectionID;}

    /**
     * Getter for the article class in the array, useful for class CSS targeting
     * @return articles array class identifier
     */
    public  String getArticlesClass() {
        return articles[0].getClassName();
    }

    /**
     * getter for class
     * @return class identifier
     */
    public String getClassName() {return sectionClass;}

    private Section(Article[] articles, String sectionID, String sectionClass) {
        this.articles = articles;
        this.sectionID = sectionID;
        this.sectionClass = sectionClass;
    }

    /**
     * Generates a section with an array of articles, an ID identifier and a class identifier
     * @param articles articles array
     * @param sectionID ID
     * @param sectionClass class
     * @return Generated section with an array of articles, an ID identifier and a class identifier
     */
    public static  Section generate(Article[] articles, String sectionID, String sectionClass){
        return new Section(articles, sectionID,  sectionClass);
    }

    /**
     * To string method
     */
    @Override
    public String toString() {
        return generateSectionString();
    }

    private String generateSectionString() {
        StringBuilder holder = new StringBuilder();
        String section;

        for (Article article : articles) {
            holder.append(article.toString()).append("\n");
        }
        section = "<Section> \n  " + holder + "</section>";
        return section;
    }
}
