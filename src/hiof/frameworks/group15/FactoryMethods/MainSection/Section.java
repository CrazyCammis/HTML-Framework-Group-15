package hiof.frameworks.group15.FactoryMethods.MainSection;

public class Section {
    private Article[] articles;
    private String sectionID, sectionClass;

    private Section(Article[] articles, String sectionID, String sectionClass) {
        this.articles = articles;
        this.sectionID = sectionID;
        this.sectionClass = sectionClass;
    }

    public static  Section generate(Article[] articles, String sectionID, String sectionClass){
        Section holder = new Section(articles, sectionID,  sectionClass);
        return  holder;
    }

    @Override
    public String toString() {
        String holder = generateSectionString(this.articles);
        return  holder;
    }

    private String generateSectionString(Article[] articles) {
        String holder = "";
        String section = "";

        for (Article article : articles) {
            holder += holder + article.toString() + "\n";
        }
        section = "<Section> \n  " + holder + "\n</section>";
        return section;
    }
}
