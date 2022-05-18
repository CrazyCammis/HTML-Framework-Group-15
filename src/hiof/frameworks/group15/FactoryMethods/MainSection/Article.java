package hiof.frameworks.group15.FactoryMethods.MainSection;

public class Article {
    String title, paragraphString, articleID, groupClass;
    Paragraph paragraph;

    public Article(String title, String paragraphString, String articleID, String groupClass) {
        this.title = title;
        this.paragraphString = paragraphString;
        this.articleID = articleID;
        this.groupClass = groupClass;
    }

    public Article(String title, Paragraph paragraph, String articleID, String groupClass) {
        this.title = title;
        this.paragraph = paragraph;
        this.articleID = articleID;
        this.groupClass = groupClass;

    }




    public static Article generateArticle(String title, String paragraph, String articleID, String groupClass){
        Article holder = new Article(title, paragraph, articleID, groupClass);
        return  holder;
    }

    public static Article generateArticle(String title, Paragraph paragraph, String articleID, String groupClass){
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


    private String generateArticleString(String title, Paragraph paragraph, String articleID, String groupclass) {
        String article = "  <article id=\"" + articleID + "\" class= \"" + groupclass + "\">\n" +
                "       <header>" + title + "</header>" +
                "       " + paragraph.toString() +
                "   </article>";

        return article;
    }
}
