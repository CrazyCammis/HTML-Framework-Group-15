package hiof.frameworks.group15.FactoryMethods.Footer;

import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;

/**
 * Footer Class for the HTML Footer tag
 * @author Anders Grindal
 *
 */

public class Footer {

    private String email, paragraphString1, paragraphString2;
    private Paragraph paragraph1, paragraph2;

    private Footer(String email) {
        this.email = email;
    }

  
    private Footer(String email, String paragraphString1) {
        this.email = email;
        this.paragraphString1 = paragraphString1;
    }

    
    private Footer(String email, String paragraphString1, String paragraphString2) {
        this.email = email;
        this.paragraphString1 = paragraphString1;
        this.paragraphString2 = paragraphString2;
    }


    private Footer(String email, Paragraph paragraph1) {
        this.email = email;
        this.paragraph1 = paragraph1;
    }


    private Footer(String email, Paragraph paragraph1, Paragraph paragraph2) {
        this.email = email;
        this.paragraph1 = paragraph1;
        this.paragraph2 = paragraph2;
    }

    /**
     * Constructor for footer with just email info
     * @param email email
     * @return Generated Footer Object with email
     */
    public static Footer generate(String email) {
        return new Footer(email);
    } 
    
    /**
     * Constructor for footer with  email info and one paragraph in string
     * @param email email
     * @param paragraphString1 Paragraph
     * @return Generated Footer Object with email and one paragraph
     */
    public static Footer generate(String email, String paragraphString1) {
        return new Footer(email, paragraphString1);
    }
    
    /**
     * Constructor for footer with  email info, and  two  different paragraphs strings
     * @param email email
     * @param paragraphString1 First paragraph
     * @param paragraphString2 Second paragraph
     * @return Generated Footer Object with email and two paragraphs
     */
    public static Footer generate(String email, String paragraphString1, String paragraphString2) {
        return new Footer(email, paragraphString1, paragraphString2);
    }

    /**
     * Constructor for footer with  email info and one paragraph
     * @param email Email
     * @param paragraph1 Paragraph
     * @return Generated Footer Object with email and one paragraph
     */
    public static Footer generate(String email, Paragraph paragraph1 ) {
        return new Footer(email, paragraph1);
    }

    /**
     *  Constructor for footer with  email info, and  two  different paragraphs
     * @param email Email
     * @param paragraph1 First Paragraph
     * @param paragraph2 Second Paragraph
     * @return Generated Footer Object with email and two paragraphs
     */
    public static Footer generate(String email, Paragraph paragraph1, Paragraph paragraph2) {
        return new Footer(email, paragraph1, paragraph2);
    }



    private String generateFooterString1() {
        return "   <footer> \n" +
                "       <p> <a href = \"mailto:" + email + "\"> "
                + email + "</a></p>" + "\n  " +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n   </footer>";
    }


    private String generateFooterString2() {
        return "   <footer> \n" +
                "        <a href = \"" + email + "\"> " + email + "</a>\n" +
                "       <p>" + paragraphString1 + "</p>" +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n " +
                "  </footer>";
    }

    private String generateFooterString3() {
        return "   <footer> \n <p>" + paragraphString1 +
                "</p>\n        <a href = \"" + email + "\"> " + email + "</a>\n" +
                "       <p>" + paragraphString2 + "</p>\n" +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n   </footer>";
    }

    private String generateFooterString4() {
        return "   <footer> \n" +
                "        <a href = \"" + email + "\"> " + email + "</a>\n" +
                "       <p>" + paragraph1.toString() + "</p>" +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n " +
                "  </footer>";
    }

    private String generateFooterString5() {
        return "   <footer> \n <p>" + paragraph1.toString() +
                "</p>\n        <a href = \"" + email + "\"> " + email + "</a>\n" +
                "       <p>" + paragraph2.toString() + "</p>\n" +
                "       <p>Created at " + java.time.LocalDate.now() + "</p> \n   </footer>";
    }

    /**
     * To string method, detects automatically how many arguments the footer has 
     * and returns a string accordingly 
     */
    @Override
    public String toString() {
        if (this.paragraphString1 == null && paragraphString2 == null) {
            return generateFooterString1();
        } else if (paragraphString1 != null && paragraphString2 == null) {
            return  generateFooterString2();
        }  else if (paragraphString1 != null && paragraphString2 != null)
            return  generateFooterString3();
        else if (paragraph1 != null && paragraph2 == null){
            return   generateFooterString4();
        }
        else
           return  generateFooterString5();
    }
}
