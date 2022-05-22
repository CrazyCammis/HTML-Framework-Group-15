package hiof.frameworks.group15.FactoryMethods.HeaderSection;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;

public class Header {

    private String title, paragraphString;
    private Paragraph paragraph;
    private Nav navList;


    private Header(String title) {
        this.title = title;
    }

    private Header(String title, String paragraphString) {
        this.title = title;
        this.paragraphString = paragraphString;
    }

    private Header(String title, Paragraph paragraph) {
        this.title = title;
        this.paragraph = paragraph;
    }

    private Header(String title, String paragraphString, Nav navList) {
        this.title = title;
        this.paragraphString = paragraphString;
        this.navList = navList;
    }

    private Header(String title, Paragraph paragraph, Nav navList) {
        this.title = title;
        this.paragraph = paragraph;
        this.navList = navList;
    }


    public static Header generate(String headline){
        Header headerHolder = new Header(headline);
        return  headerHolder;
    }

    public static Header generate(String headline, String paragrap){
        Header headerHolder = new Header(headline, paragrap);
        return  headerHolder;
    }

    public static Header generate(String headline, Paragraph paragrap){
        Header headerHolder = new Header(headline, paragrap);
        return  headerHolder;
    }
    public static  Header generate(String headline, String paragrap, Nav navList){
        Header headerHolder = new Header(headline, paragrap, navList);
        return  headerHolder;
    }


    //Can also use a nav
    private String generateHeaderString1(String headline) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>" +
                "</header>";

        return header;
    }



    private String generateHeaderString2(String headline, String paragrap) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       <p>" + paragrap + "<p/>\n" +
                "</header>\n";
        return header;
    }

    private String generateHeaderString3(String headline, Paragraph paragrap) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       "+ paragrap.toString() +
                "</header>\n";
        return header;
    }

    private String generateHeaderString4(String headline, String paragrap, Nav navList) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       <p>" + paragrap + "<p/>\n" +
                navList.toString() +
                "</header>\n";
        return header;
    }

    private String generateHeaderString5(String headline, Paragraph paragrap, Nav navList) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       "+ paragrap.toString() +
                navList.toString() +
                "</header>\n";
        return header;
    }
    @Override
    public String toString() {
        String headerString;

        if(paragraphString == null  || paragraph == null&& getNavList() == null) {
            headerString = generateHeaderString1(title);
        }
        // FOR STRING
        else if (paragraphString== null && paragraph == null && getNavList() == null) {
            headerString = generateHeaderString2(title, paragraphString);
        }
        //For PARAGRAPH
        else if (paragraphString == null && paragraph != null && getNavList() == null) {
            headerString = generateHeaderString3(title, paragraph);
        }
        //FOR STRING with nav
        else if (paragraphString!= null && paragraph == null && getNavList() != null){
            headerString=   generateHeaderString4(title, paragraphString, navList);
        }
        else
            headerString = generateHeaderString5(title, paragraph, navList);
        return headerString;
    }


    private Nav getNavList() {
        return navList;
    }


}



