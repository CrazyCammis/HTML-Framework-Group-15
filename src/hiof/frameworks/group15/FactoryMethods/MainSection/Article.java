package hiof.frameworks.group15.FactoryMethods.MainSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;
/***
 * Article class for Article class 
 * @author Anders Grindal
 *
 */
public class Article {
    private final String title;
    private String paragraphString;
    private final String articleID;
    private final String groupClass;
    private Paragraph paragraph;
    private Form form;

    /**
     * Getter for ID
     * @return the articles ID identifier
     */
    public String getID() {return articleID;}
    
    /**
     * getter for class 
     * @return class identifier 
     */
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

    /**
     * Generates article with title, paragraph, ID identifier and class identifier
     * @param title title
     * @param paragraphString paragraph 
     * @param articleID ID identifier
     * @param groupClass class identifier
     * @return Generated article with title, paragraph, ID identifier and class identifier
     */
    public static Article generate(String title, String paragraphString, String articleID, String groupClass){
        return new Article(title, paragraphString, articleID, groupClass);
    }
    
    /**
     * Generates article with title, paragraph, ID identifier,  class identifier and a form
     * @param title title
     * @param paragraphString paragraph 
     * @param articleID ID identifier
     * @param groupClass class identifier
     * @param form  form
     * @return Generated article with title, paragraph, ID identifier and class identifier and a form 
     */
    public static Article generate(String title, String paragraphString, String articleID, String groupClass, Form form){
        return new Article( title,  articleID,  groupClass,  paragraphString,  form);
    }

    /**
     * Generates article with title, paragraph, ID identifier,  class identifier 
     * @param title Title
     * @param paragraph Paragraph
     * @param articleID ID identifier
     * @param groupClass class identifier
     * @return Generated article with title, paragraph, ID identifier and class identifier
     */
    public static Article generate(String title, Paragraph paragraph, String articleID, String groupClass){
        return new Article(title, paragraph, articleID, groupClass);
    }

    /**
     * Generates article with title, paragraph, ID identifier,  class identifier and a form
     * @param title title
     * @param paragraph paragraph 
     * @param articleID ID identifier
     * @param groupClass class identifier
     * @param form form
     * @return Generated article with title, paragraph, ID identifier and class identifier and a form 
     */
    public static Article generate(String title, Paragraph paragraph, String articleID, String groupClass, Form form){
        return new Article( title,  articleID,  groupClass,  paragraph,  form);
    }

    
    /**
     * To string method
     */
    @Override
    public String toString() {
        if(paragraphString != null && form == null && paragraph == null)
        return generateArticleString1();
        else if(paragraphString != null && form != null && paragraph == null){
         return    generateArticleString2();
        }
        else if(paragraphString == null && form == null && paragraph != null){
         return  generateArticleString3();
        }
        else
            return generateArticleString4( );
    }


    private String generateArticleString1() {
        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       <p>" + paragraphString + "</p>\n" +
                "   </article>";
    }

    private String generateArticleString2() {
        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       <p>" + paragraphString + "</p>\n" +
                "       " + form.toString() + "\n" +
                "   </article>";
    }
    private String generateArticleString3() {

        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       " + paragraph.toString() + "\n" +
                "   </article>";
    }
    private String generateArticleString4() {
        return "  <article id=\"" + articleID + "\" class= \"" + groupClass + "\">\n" +
                "       <header>" + title + "</header>\n" +
                "       " + paragraph.toString() + "\n" +
                "       " + form.toString() + "\n" +
                "   </article>";
    }

}
