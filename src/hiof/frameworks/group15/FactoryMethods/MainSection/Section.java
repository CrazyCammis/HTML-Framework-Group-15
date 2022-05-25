package hiof.frameworks.group15.FactoryMethods.MainSection;

public class Section {
    private final Article[] articles;
    private final String sectionID;
    private final String sectionClass;

    public String getID() { return sectionID;}

    public  String getArticlesClass() {
        return articles[0].getClassName();
    }

    public String getClassName() {return sectionClass;}

    private Section(Article[] articles, String sectionID, String sectionClass) {
        this.articles = articles;
        this.sectionID = sectionID;
        this.sectionClass = sectionClass;
    }

    public static  Section generate(Article[] articles, String sectionID, String sectionClass){
        return new Section(articles, sectionID,  sectionClass);
    }

    @Override
    public String toString() {
        return generateSectionString(this.articles);
    }

    private String generateSectionString(Article[] articles) {
        StringBuilder holder = new StringBuilder();
        String section;

        for (Article article : articles) {
            holder.append(article.toString()).append("\n");
        }
        section = "<Section> \n  " + holder + "</section>";
        return section;
    }
}
