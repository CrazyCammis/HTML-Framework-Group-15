package hiof.frameworks.group15.mainTags;

public class Article {
    String title, paragraph, articleID, groupClass;

    public Article(String title, String paragraph, String articleID, String groupClass) {
        this.title = title;
        this.paragraph = paragraph;
        this.articleID = articleID;
        this.groupClass = groupClass;
    }


    @Override
    public String toString() {
        String holder = generateArticleString(this.title, this.paragraph, this.articleID, this.groupClass);
        return holder;

    }



    private String generateArticleString(String title, String paragraph, String articleID, String groupclass) {
        String article = "  <article id=\"" + articleID + "\" class= \"" + groupclass + "\">\n" +
                "       <header>" + title + "</header>" +
                "       <p>" + paragraph + "</p>" +
                "   </article>";

        return article;
    }
}
