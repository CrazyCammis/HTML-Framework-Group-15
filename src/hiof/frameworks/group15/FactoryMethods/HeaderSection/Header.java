package hiof.frameworks.group15.FactoryMethods.HeaderSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;

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

    public static Header generate(String headline) {
        return new Header(headline);
    }

    public static Header generate(String headline, Paragraph paragraph) {
        return new Header(headline, paragraph);
    }

    public static Header generate(String headline, Nav nav) {
        return new Header(headline, nav);
    }

    public static Header generate(String headline, Paragraph paragraph, Nav navList) {
        return new Header(headline, paragraph, navList);
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



