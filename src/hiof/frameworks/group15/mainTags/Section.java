package hiof.frameworks.group15.mainTags;

import java.util.Arrays;

public class Section {
    private Article[] articles;

    public Section(Article[] articles) {
        this.articles = articles;
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
