package hiof.frameworks.group15;


import hiof.frameworks.group15.BuilderPattern.CSSBracket;
import hiof.frameworks.group15.FactoryMethods.Footer.Footer;
import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.HeaderSection.Nav;
import hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators.CSS;
import hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators.Page;
import hiof.frameworks.group15.FactoryMethods.MainSection.Article;
import hiof.frameworks.group15.FactoryMethods.MainSection.Form;
import hiof.frameworks.group15.FactoryMethods.MainSection.MainTag;
import hiof.frameworks.group15.FactoryMethods.MainSection.Section;
import hiof.frameworks.group15.FactoryMethods.SubObjects.FormOption;
import hiof.frameworks.group15.FactoryMethods.SubObjects.Image;
import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;

import java.io.IOException;
/**
 * Main Class
 * @author Anders Grindal
 *
 */
public class Main {

    private static String[] linksList = new String[]{"www.google.com", "www.amazon.com", "www.pottermore.com"};
    private static String[] linksTextList = new String[]{"google", "amazon", "pottermore"};
    /**
     * Main method
     * @param args Arguments
     * @throws java.io.IOException	Exception
     */
    public static void main(String[] args) throws IOException {


        Image image = Image.generate(
                "*Image url*", "picuter description",
                        "img1", "img");

        Paragraph genericParagraph =
                Paragraph.generate
                        ("This is an generic paragraph",
                                "genPar", "paragraphs");




        Nav nav = Nav.generate(linksList, linksTextList, "mainNav",
                "navClass");

        //-----------------HEADERS-----------------------
        Header header1 = Header.generate("This is title");
        Header header2 = Header.generate("This is title", genericParagraph);
        Header header3 = Header.generate("This is title", nav);
        Header header4 = Header.generate("This is title",  genericParagraph, nav);






        //-------------------------FORMS
        FormOption formOption1 = FormOption.generate("Birthday", "date",
                "q1", "FormOptionclass");
        FormOption formOption2 = FormOption.generate("mothers name", "text",
                "q2", "FormOptionclass");
        FormOption formOption3 = FormOption.generate("Phone number ", "number",
                "q3", "FormOptionclass");

        FormOption[] formOptionArray = new FormOption[]{formOption1, formOption2, formOption3};


        Form form = Form.generate("Form", "FormID", formOptionArray);


        //-----------------------------ARTICLE-----------------

        Article article1 = Article.generate("Article", "<p> stuff " + image.toString() + " </p>",
                "article1 ",  "articleclass");

        Article article2 = Article.generate("Article", genericParagraph,
                "article2",  "articleclass");

        Article article3 = Article.generate("Article", genericParagraph, form,
                "article3",  "articleclass");

        Article article4 = Article.generate("Article", "<p> stuff </p>", form,
                "article4",  "articleclass");


        Article[] articlesArray = new Article[] {article1, article2, article3, article4};

        //SECTION

        Section section1 = Section.generate( articlesArray, "section", "sectionClass");
        Section section2 = Section.generate( articlesArray, "section", "sectionClass");

        Section[] sectionsArray = new Section[]{section1, section2};

        String[] arrayString = new String[]{"<div> <p>manuall insertion </p> </div>",
                "<div> <p>lorem ipsum insertion </p> </div>" };



        MainTag mainTag1 = MainTag.generate("<div> <p>manuall insertion </p> </div>");
        MainTag mainTag2 = MainTag.generate(arrayString);
        MainTag mainTag3 = MainTag.generate(section1);
        MainTag mainTag4 = MainTag.generate(sectionsArray);


        Footer footer1 = Footer.generate("anderscg@hiof.no");
        Footer footer2 = Footer.generate("anderscg@hiof.no","<p>Hello</p>");
        Footer footer3 = Footer.generate("anderscg@hiof.no", genericParagraph);
        Footer footer4 = Footer.generate("anderscg@hiof.no", "<p>Hello</p>", "<p>Goodbye</p>");
        Footer footer5 = Footer.generate("anderscg@hiof.no", genericParagraph, genericParagraph);



        Page newPage = Page.generate(header1, mainTag2, footer1 );

        //newPage.generateHTMLFile("HTMLFile");

        CSSBracket articleClass = CSSBracket.Builder.newInstance(article1.getClassName(), "class")
                .addBackgroundColor("red")
                .addMargin(40f, "px")
                .setTextSize( "em", 25f)
                .addUnderline()
                .setBorderStyle("solid")
                .build();




        CSSBracket cssBracket1 = CSSBracket.Builder.newInstance(
                "CSSBracket1", "id")
                .addBackgroundColor("green")
                .setInline()
                .fixPosition()
                .build();


        CSSBracket cssBracket2 = CSSBracket.Builder.newInstance(
                "CSSBracket2", "id")
                .addUnderline()
                .setBorderStyle("solid")
                .build();

        CSSBracket cssBracket3 = CSSBracket.Builder.newInstance(
                "CSSBracket3", "id")
                .addMargin(40f, "em")
                .setTextSize("em", 12f)
                .build();

        CSSBracket[] exampleBrackets = new CSSBracket[]
                {cssBracket1, cssBracket2, cssBracket3};

        CSS cssExample = CSS.generate( exampleBrackets);
        //cssExample.generateCSSFile("cssExampleFile");


        Article exampleArticle = Article.generate("Article", "<p> stuff </p>", form,
                "article4",  "articleclass");



        //FileGenerator.generateFile("articleExample",
              // exampleArticle.toString(),"txt");




        Nav navExample = Nav.generate(linksList, linksTextList, "mainNav",
                "navClass");

        Header headerExample = Header.generate("This is title",  genericParagraph, navExample);







        FormOption formOptionExample1 = FormOption.generate("Birthday", "date",
                "q1", "FormOptionclass");
        FormOption formOptionExample2 = FormOption.generate("mothers name", "text",
                "q2", "FormOptionclass");


        FormOption[] formOptionExampleArray = new FormOption[]{formOptionExample1, formOptionExample2};

        Form formExample = Form.generate("Form", "FormID", formOptionExampleArray);


        Article articleExample1 = Article.generate("Article", genericParagraph, formExample,
                "article2",  "articleclass");


        Article[] articlesExampleArray = new Article[] {articleExample1};

        //SECTION

        Section sectionExample1 = Section.generate( articlesExampleArray,
                "section2", "sectionClass");

        Section sectionExample2 = Section.generate( articlesExampleArray,
                "section1", "sectionClass");

        Section[] sectionsExampleArray = new Section[]{sectionExample1, sectionExample2};
        MainTag mainTagExample = MainTag.generate(sectionsExampleArray);

System.out.println(mainTagExample);

        Footer footerExample = Footer.generate("anderscg@hiof.no",
                genericParagraph, genericParagraph);


        Page pageExample =Page.generate(headerExample, mainTagExample, footerExample);
        pageExample.generateHTMLFile("HTMLExample");
    }

}
