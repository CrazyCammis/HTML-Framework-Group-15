package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.MainSection.Footer;
import hiof.frameworks.group15.mainTags.MainTag;

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
        this.header = header;
        this.mainTag = mainTag;
        this.footer = footer;
    }

    public static Page generate(Header header, MainTag mainTag, Footer footer) {
        return new Page(header, mainTag, footer);
    }

    public static void generateFile(String fileName){
        String holder = pageString(header, mainTag, footer);
        generateFile(fileName,  holder, "html");
    }

    @Override
    public String toString() {
        return pageString(header, mainTag, footer);
    }

    private static String pageString(Header header, MainTag mainTag, Footer footer) {
        String holder;
        holder = htmlPart1 + header.toString() + "\n" + mainTag.toString() + "\n" + footer.toString() + htmlPart2;
        return holder;
    }


}
