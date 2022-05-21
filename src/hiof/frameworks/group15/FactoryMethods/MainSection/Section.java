package hiof.frameworks.group15.FactoryMethods.MainSection;

public class Section {
    private Article[] articles;

    private Section(Article[] articles) {
        this.articles = articles;
    }


    public static  Section generate(Article[] articles){
        Section holder = new Section(articles);
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
