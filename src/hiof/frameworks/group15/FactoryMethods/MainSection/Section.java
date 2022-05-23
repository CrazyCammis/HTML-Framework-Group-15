package hiof.frameworks.group15.FactoryMethods.MainSection;

public class Section {
    private Article[] articles;
    private String sectionID;



    private Section(Article[] articles, String sectionID) {
        this.articles = articles;
        this.sectionID = sectionID;
    }

    public static  Section generate(Article[] articles, String sectionID){
        Section holder = new Section(articles, sectionID);
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
