package hiof.frameworks.group15;

import java.io.IOException;

public class CSSGenerator  extends  Parent{

    private static  final String[] simpleListOverTags = new String[]{"abbr", "address", "area", "article", "aside", "audio", "b", "base", "basefont", "bdi", "bdo", "blockquote", "body", "br",
            "button", "canvas", "caption", "cite", "code", "col", "colgroup", "data", "datalist", "dd", "del", "details", "dfn", "dialog", "dir",
            "div", "dl", "dt", "em", "embed", "fieldset", "figcaption", "figure", "font", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "head",
            "header", "hr", "html", "i", "iframe", "input", "ins", "kbd", "label", "legend", "li", "link", "main", "map", "mark", "meta", "meter", "nav",
            "img", "input", "ins", "kbd", "label", "legend", "li", "link", "noscript", "object", "ol", "optgroup", "option", "output", "p", "param", "picture",
            "pre", "progress", "q", "rp", "rt", "ruby", "s", "samp", "script", "section", "select", "small", "source", "span", "strong", "style", "sub", "summary",
            "sup", "svg", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "time", "title", "tr", "track", "u", "ul", "var", "video", "wbr"};




    private void generateCSSFile(String fileName, String info) throws IOException {
        generateFile(fileName, info, "CSS");
    }



    //identifier is either class or id
    public String cssBracket(String identifier,String info){
        String holder1  ="";

        if(identifier.equals("id")){
            holder1 = "." + identifier + "{ \n";
        }
        else if(identifier.equals("class")){
            holder1 = "#" + identifier + "{ \n";
        }

        else if(identifier.equals("tag") &&!isTag(identifier)){
            System.out.println("ERROR! " + identifier + " is not a semantic tag");
        }

        holder1  = holder1.concat(info + " \n }");

        return  holder1;
    }


    private boolean isTag(String identify){
        for (String tag: simpleListOverTags ) {
            if(identify.equals(tag)){
                return true;
            }
        }
        return  false;
    }

    //Meant to be used multiple times to generate one string with the entierty of the info
    public String groupInfo(String info1, String info2){
        String holder2 = info1  +info2;

        return  holder2;
    }




    public String findSize(String type, float size){
        double actualSize = 0;

        if(type == "" || type != "em"|| type != "px") {
            type = "px";
        }

        if(size <= 0 && type == "px"){
            size = 16;
        }
        else if(size <= 0 && type == "em"){
            size = 1;
        }

        if(type != "em") {
            float textSize =size / 16;
             actualSize = Math.pow(textSize, 1);
        }

        String sizeMesurment =   "" +actualSize + type;
        return  sizeMesurment;
    }


    private String setFontSize(String messurmentUnit, float size){
        String fontSize ="font-size: " + findSize(messurmentUnit, size);
        return
    }



    public  String setTextColor(String color){
        String setcolor = "color: " + color + ";\n";

        //TODO CHECK IF VALID
        return  setcolor;
    }

    public  String setTextColor(int rgb1, int rgb2, int rgb3){
        String setcolor = "color: rgb(" +
                rgb1 + "," +
                rgb2 + "," +
                rgb3 + "," +
                ";\n";
        return  setcolor;
    }


    public String toggleUnderline(){
        String toggeld = "text-decoration: underline;";
        return toggeld;
    }

    public String inLineList(){

    }

    private String addMargin(float spaceBtwn, String unitOfMes){
      String margin = findSize(unitOfMes, spaceBtwn);
        return  "margin: "+ margin;
    }


}