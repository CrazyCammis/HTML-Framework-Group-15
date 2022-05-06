package hiof.frameworks.group15.headerstuff;

public class Header {

    private String title, paragraph;
    private Nav navList;


    public Header(String title) {
        this.title = title;
    }

    public Header(String title, String paragraph, Nav navList) {
        this.title = title;
        this.paragraph = paragraph;
        this.navList = navList;
    }

    public Header(String title, String paragraph) {
        this.title = title;
        this.paragraph = paragraph;
    }

    private String generateHeaderString1(String headline) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>" +
                "</header>";

        return header;
    }

    //Can also use a nav
    private String generateHeaderString2(String headline, String paragrap) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       <p>" + paragrap + "<p/>\n" +
                "</header>\n";
        return header;
    }

    private String generateHeaderString3(String headline, String paragrap, Nav navList) {
        String header = "   <header>\n" +
                "       <h1>" + headline + "</h1>\n" +
                "       <p>" + paragrap + "<p/>\n" +
                navList.toString() +
                "</header>\n";
        return header;
    }


    private static Nav generateNav(String[] links, String[] linkText, String navTagID, String navTagClass) {
        Nav navTag = new Nav(links, linkText, navTagID, navTagClass);
        return  navTag;
    }

    @Override
    public String toString() {
        String headerString;
        if(paragraph == null && navList == null) {
            headerString = generateHeaderString1(title);
        } else if (paragraph != null && navList == null) {
            headerString = generateHeaderString2(title, paragraph);
        }

        else{
            headerString=   generateHeaderString3(title, paragraph, navList);
        }

        return headerString;

    }


    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private String getParagraph() {
        return paragraph;
    }

    private void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    private Nav getNavList() {
        return navList;
    }

    private void setNavList(Nav navList) {
        this.navList = navList;
    }




}



