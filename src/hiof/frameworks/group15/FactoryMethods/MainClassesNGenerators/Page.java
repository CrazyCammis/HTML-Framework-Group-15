package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import hiof.frameworks.group15.FactoryMethods.Footer.Footer;
import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.MainSection.MainTag;
/**
 * For a new HTML page
 * @author ander
 *
 */
public class Page extends FileGenerator {
    private static final String htmlPart1;
    private static final String htmlPart2;
    private static Header header;
    private static MainTag mainTag;
    private  static Footer footer;

    static {
        htmlPart1 = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
                </head>
                <body>

                """;

        htmlPart2 =
                """
                        </body>
                        </html>
                        """;
    }

    private Page(Header header, MainTag mainTag, Footer footer) {
        Page.header = header;
        Page.mainTag = mainTag;
        Page.footer = footer;
    }

    /**
     * Generates a new Page requires Header, MainTag and footer to qualify for a new page
     * @param header Header
     * @param mainTag MainTag
     * @param footer Footer
     * @return Generated Page
     */
    public static Page generate(Header header, MainTag mainTag, Footer footer) {
        return new Page(header, mainTag, footer);
    }

  
    /**
     * Generates a new HTML file/page with the info we have given
     * @param fileName the file name
     */
    public static void generateHTMLFile(String fileName) {
        String holder = pageString();
        generateFile(fileName,  holder, "html");
    }

    /**
     * To string method
     */
    @Override
    public String toString() {
        return pageString();
    }

    private static String pageString() {
        String holder = htmlPart1 + header.toString() + "\n" + mainTag.toString() + "\n" + footer.toString() + htmlPart2;
        return holder;
    }


}
