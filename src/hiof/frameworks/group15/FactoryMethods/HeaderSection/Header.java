package hiof.frameworks.group15.FactoryMethods.HeaderSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;
/**
 * Header class for HTML header tag
 * @author Anders
 *
 */
public class Header {

    private final String title;
    private Paragraph paragraph;
    private Nav nav;


    private Header(String title) {
        this.title = title;
    }

    private Header(String title, Paragraph paragraph) {
        this.title = title;
        this.paragraph = paragraph;
    }

    private Header(String title, Nav nav) {
        this.title = title;
        this.nav = nav;
    }


    private Header(String title, Paragraph paragraph, Nav nav) {
        this.title = title;
        this.paragraph = paragraph;
        this.nav = nav;
    }

    /**
     * Generates a Header with just a title
     * @param headline
     * @return  Generated Header with title
     */
    public static Header generate(String headline) {
        return new Header(headline);
    }

    /**
     * Generates a Header with a title and paragraph
     * @param headline
     * @param paragraph
     * @return Generated Header with title and paragraph 
     */
    public static Header generate(String headline, Paragraph paragraph) {
        return new Header(headline, paragraph);
    }
 
    /**
     * Generates a Header with title and a navigation
     * @param headline title
     * @param nav nav
     * @return Generated Header with title and nav
     */
    public static Header generate(String headline, Nav nav) {
        return new Header(headline, nav);
    }

    /**
     * Generates a header with title, a paragraph and a nav
     * @param headline title
     * @param paragraph paragraph
     * @param navList nav
     * @return Generated Header with title, paragraph and nav
     */
    public static Header generate(String headline, Paragraph paragraph, Nav nav) {
        return new Header(headline, paragraph, nav);
    }

    private String generateHeaderString1(String headline) {
        return "   <header>\n" +
                "       <h1>" + headline + "</h1>" +
                "</header>";
    }

    private String generateHeaderString2(String headline, Paragraph paragraph) {
        return "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       " + paragraph.toString() +
                "</header>\n";
    }

    private String generateHeaderString3(String headline, Nav navList) {
        return "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                navList.toString() +
                "</header>\n";
    }

    private String generateHeaderString4(String headline, Paragraph paragraph, Nav navList) {
        return "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       " + paragraph.toString() +
                navList.toString() +
                "</header>\n";
    }

    /**
     * To string method, detects arguments automatically and gives 
     */
    @Override
    public String toString() {
        String headerString;

        if (paragraph != null && nav == null) {
            headerString = generateHeaderString2(title, paragraph);
        }
        // FOR STRING
        else if (paragraph == null && nav != null) {
            headerString = generateHeaderString3(title, nav);
        }
        //For PARAGRAPH
        else if (paragraph != null) {
            headerString = generateHeaderString4(title, paragraph, nav);
        } else
            headerString = generateHeaderString1(title);
        return headerString;
    }
}



