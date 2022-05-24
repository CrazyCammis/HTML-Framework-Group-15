package hiof.frameworks.group15.FactoryMethods.MainSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;

public class Article {
    String title, paragraphString, articleID, groupClass;
    Paragraph paragraph;

    public String getArticleID() {
        return articleID;
    }

    public String getGroupClass() {
        return groupClass;
    }

    private Article(String title, String paragraphString, String articleID, String groupClass) {
        this.title = title;
        this.paragraphString = paragraphString;
        this.articleID = articleID;
        this.groupClass = groupClass;
    }

    private Article(String title, Paragraph paragraph, String articleID, String groupClass) {
        this.title = title;
        this.paragraph = paragraph;
        this.articleID = articleID;
        this.groupClass = groupClass;
    }


    public static Article generate(String title, String paragraph, String articleID, String groupClass){
        Article holder = new Article(title, paragraph, articleID, groupClass);
        return  holder;
    }

    public static Article generate(String title, Paragraph paragraph, String articleID, String groupClass){
        Article holder = new Article(title, paragraph, articleID, groupClass);
        return  holder;
    }

    @Override
    public String toString() {
        String holder = generateArticleString(this.title, this.paragraphString, this.articleID, this.groupClass);
        return holder;
    }


    private String generateArticleString(String title, String paragraphString, String articleID, String groupclass) {
        String article = "  <article id=\"" + articleID + "\" class= \"" + groupclass + "\">\n" +
                "       <header>" + title + "</header>" +
                "       <p>" + paragraphString + "</p>" +
                "   </article>";

        return article;
    }

}
