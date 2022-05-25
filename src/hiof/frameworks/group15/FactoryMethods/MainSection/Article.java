package hiof.frameworks.group15.FactoryMethods.MainSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;

public class Article {
    private final String title;
    private String paragraphString;
    private final String articleID;
    private final String groupClass;
    private Paragraph paragraph;
    private Form form;

    public String getID() {return articleID;}
    public String getClassName() {return groupClass;}

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

    private Article(String title, String articleID, String groupClass, Paragraph paragraph, Form form) {
        this.title = title;
        this.articleID = articleID;
        this.groupClass = groupClass;
        this.paragraph = paragraph;
        this.form = form;
    }
    private Article(String title, String articleID, String groupClass, String paragraphString, Form form) {
        this.title = title;
        this.articleID = articleID;
        this.groupClass = groupClass;
        this.paragraphString = paragraphString;
        this.form = form;
    }

    public static Article generate(String title, String paragraphString, String articleID, String groupClass){
        return new Article(title, paragraphString, articleID, groupClass);
    }

    public static Article generate(String title, String paragraphString, String articleID, String groupClass, Form form){
        return new Article( title,  articleID,  groupClass,  paragraphString,  form);
    }


    public static Article generate(String title, Paragraph paragraph, String articleID, String groupClass){
        return new Article(title, paragraph, articleID, groupClass);
    }

    public static Article generate(String title, Paragraph paragraph, String articleID, String groupClass, Form form){
        return new Article( title,  articleID,  groupClass,  paragraph,  form);
    }

    @Override
    public String toString() {
        if(paragraphString != null && form == null && paragraph == null)
        return generateArticleString1(title, paragraphString, articleID, groupClass);
        else if(paragraphString != null && form != null && paragraph == null){
         return    generateArticleString2( title,  paragraphString, articleID,  groupClass,  form);
        }
        else if(paragraphString == null && form == null && paragraph != null){
         return  generateArticleString3( title,  paragraph,  articleID,  groupClass);
        }
        else
            return generateArticleString4( title,  paragraph,  articleID,  groupClass, form);
    }


    private String generateArticleString1(String title, String paragraphString, String articleID, String groupClass) {
        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       <p>" + paragraphString + "</p>\n" +
                "   </article>";
    }

    private String generateArticleString2(String title, String paragraphString, String articleID, String groupClass, Form form) {
        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       <p>" + paragraphString + "</p>\n" +
                "       " + form.toString() + "\n" +
                "   </article>";
    }
    private String generateArticleString3(String title, Paragraph paragraph, String articleID, String groupClass) {

        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       <p>" + paragraph.toString() + "</p>\n" +
                "   </article>";
    }
    private String generateArticleString4(String title, Paragraph paragraph, String articleID, String groupClass, Form form) {
        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       <p>" + paragraph.toString() + "</p>\n" +
                "       " + form.toString() + "\n" +
                "   </article>";
    }

}
