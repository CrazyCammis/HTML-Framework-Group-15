package hiof.frameworks.group15.FactoryMethods.MainSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;

public class Article {
    String title, paragraphString, articleID, groupClass;
    Paragraph paragraph;

    public String getArticleID() {return articleID;}
    public String getGroupClass() {return groupClass;}

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
        return new Article(title, paragraph, articleID, groupClass);
    }

    public static Article generate(String title, Paragraph paragraph, String articleID, String groupClass){
        return new Article(title, paragraph, articleID, groupClass);
    }

    @Override
    public String toString() {
        return generateArticleString(this.title, this.paragraphString, this.articleID, this.groupClass);
    }


    private String generateArticleString(String title, String paragraphString, String articleID, String groupClass) {

        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>" +
                "       <p>" + paragraphString + "</p>" +
                "   </article>";
    }

}
