import hiof.frameworks.group15.FactoryMethods.HeaderSection.Header;
import hiof.frameworks.group15.FactoryMethods.HeaderSection.Nav;
import hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators.CSS;
import hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators.Page;
import hiof.frameworks.group15.FactoryMethods.MainSection.Article;
import hiof.frameworks.group15.FactoryMethods.Footer.Footer;
import hiof.frameworks.group15.FactoryMethods.MainSection.Form;
import hiof.frameworks.group15.FactoryMethods.MainSection.Section;
import hiof.frameworks.group15.FactoryMethods.SubObjects.CSSBracket;
import hiof.frameworks.group15.FactoryMethods.SubObjects.FormOption;
import hiof.frameworks.group15.FactoryMethods.SubObjects.Paragraph;
import hiof.frameworks.group15.mainTags.MainTag;

import java.io.IOException;

public class Main {

    private  static String[] linksList = new String[]{"www.google.com","www.amazon.com", "www.pottermore.com"};
    private  static String[] linksNameList = new String[]{"google","amazon", "pottermore"};
    
    public static void main(String[] args) throws IOException {

        Paragraph genericParagraph = Paragraph.generate("Generic stuff letts go the mooon landing totlay wasnt faked",
        "genPara", "paragr");

        Nav navigation = Nav.generate(linksList, linksNameList, "mainNav",
                "navClass");
        Header header = Header.generate("HIOF HJEMMESIDE", navigation);




        FormOption formOption1 = FormOption.generate("formOp1", "set ur bd", "date",
                "password");

        FormOption formOption2 = FormOption.generate("formOp1", "set ur bd", "date",
                "password");

        FormOption[] optionList = new FormOption[]{formOption1,formOption2};
        Form form = Form.generate("Birthday questions", "bdayForm", optionList);

        Article article1 = Article.generate("Obi Wan takes the high ground!",
        "Obi wans wins a crucial battle that  can only be descriped as duel of a fates",
                "article1", "mainArticles", form);

        Article article2 = Article.generate("Anakin dies!",
                "killed by Obi wans  as obi wan wins a crucial battle that  can only be descriped as duel of a fates",
                "article2", "mainArticles");

        Article[] articles = new Article[]{article1, article2};
        Section section = Section.generate(articles, "mainSection", "sections");

        MainTag maintag = MainTag.generate(section);
        Footer footer = Footer.generate("anderscg@hiof.no", "My website");



        Page newPage = Page.generate(header, maintag, footer);


        System.out.println(newPage.toString());


        newPage.generateFile("tester");





        CSSBracket h4 = CSSBracket.generate("main", "tag");
        CSSBracket h2 = CSSBracket.generate("erw2", "class");
        CSSBracket h3 = CSSBracket.generate("erw5", "id");



        CSSBracket sectionBracket = CSSBracket.generate(section.getID(), "ID");
        sectionBracket.addMargin(2.3f, "em");

        h4.addFontSize("px", 23);
        h2.setInline();
        h3.setInline();


        CSSBracket[] list = new CSSBracket[]{h4, h2, h3};

        CSS holder = CSS.generate(list);
        //holder.generateFile("reee");




    }
}
