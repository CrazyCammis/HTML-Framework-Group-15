package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class CSSBracket {
    private static  final String[] simpleListOverTags;
    private static final String[] listOverColorCodeWords;

    static {
        simpleListOverTags = new String[]{
                "abbr", "address", "area", "article", "aside", "audio", "b", "base", "basefont", "bdi", "bdo", "blockquote", "body", "br",
                "button", "canvas", "caption", "cite", "code", "col", "colgroup", "data", "datalist", "dd", "del", "details", "dfn", "dialog", "dir",
                "div", "dl", "dt", "em", "embed", "fieldset", "figcaption", "figure", "font", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "head",
                "header", "hr", "html", "i", "iframe", "input", "ins", "kbd", "label", "legend", "li", "link", "main", "map", "mark", "meta", "meter", "nav",
                "img", "input", "ins", "kbd", "label", "legend", "li", "link", "noscript", "object", "ol", "optgroup", "option", "output", "p", "param", "picture",
                "pre", "progress", "q", "rp", "rt", "ruby", "s", "samp", "script", "section", "select", "small", "source", "span", "strong", "style", "sub", "summary",
                "sup", "svg", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "time", "title", "tr", "track", "u", "ul", "var", "video", "wbr"
        };



        listOverColorCodeWords = new String[]{
                "AliceBlue", "AntiqueWhite", "Aqua", "Aquamarine", "Azure", "Beige", "Bisque", "Black", "BlanchedAlmond", "Blue", "BlueViolet",
                "Brown", "BurlyWood", "CadetBlue", "Chartreuse", "Chocolate", "Coral", "CornflowerBlue", "Cornsilk", "Crimson", "Cyan", "DarkBlue",
                "DarkCyan", "DarkGoldenrod", "DarkGray", "DarkGreen", "DarkGrey", "DarkKhaki", "DarkMagenta", "DarkOliveGree", "DarkOrange", "DarkOrchid<A", "DarkRed", "DarkSalmon", "DarkSeaGree",
                "DarkSlateBlue", "DarkSlateGray", "DarkSlateGrey", "DarkTurquoise", "DarkViolet", "DeepPink", "DeepSkyBlue", "DimGray", "DodgerBlue", "FireBrick", "FloralWhite", "ForestGree", "Fuchsia",
                "Gainsboro", "GhostWhite", "Gold", "Goldenrod", "Gray", "Green", "GreenYellow", "Grey", "Honeydew", "HotPink", "IndianRed", "Indigo", "Ivory", "Khaki", "Lavender", "LavenderBlush", "LawnGreen",
                "LemonChiffon", "LightBlue", "LightCoral", "LightCyan", "LightGoldenrodYellow", "LightGray", "LightGreen", "LightGrey", "LightPink", "LightSalmon", "LightSeaGreen", "LightSkyBlue", "LightSlateGray",
                "LightSlateGrey", "LightSteelBlue", "LightYellow", "Lime", "LimeGreen", "Linen", "Magenta", "Maroon", "MediumAquamarine", "MediumBlue", "MediumOrchid", "MediumPurple", "MediumSeaGreen", "MediumSlateBlue",
                "MediumSpringGreen", "MediumTurquoise", "MediumVioletRed", "MidnightBlue", "MintCream", "MistyRose", "Moccasin", "NavajoWhite", "Navy", "OldLace", "Olive", "OliveDrab", "Orange", "OrangeRed", "Orchid",
                "PaleGoldenrod", "PaleGreen", "PaleTurquoise", "PaleVioletRed", "PapayaWhip", "PeachPuff", "Peru", "Pink", "Plum", "PowderBlue", "Purple", "Rebeccapurple", "Red", "RosyBrown", "RoyalBlue", "SaddleBrown",
                "Salmon", "SandyBrown", "SeaGreen", "Seashell", "Sienna", "Silver", "SkyBlue", "SlateBlue", "SlateGray", "SlateGrey", "Snow", "SpringGreen", "SteelBlue", "Tan", "Teal", "Thistle", "Tomato", "Turquoise",
                "Violet", "Wheat", "White", "WhiteSmoke", "Yellow", "YellowGreen"
        };
    }


    private static   String info, cssTypeNTarget;

    public CSSBracket(String cssTypeNTarget) {
        this.cssTypeNTarget = cssTypeNTarget;
    }

    private static void setInfo(String newinfo) {
        info = newinfo;
    }

    @Override
    public  String toString() {
        String holder = this.cssTypeNTarget+ "{\n    " + this.info + "\n}";
        return holder;
    }

    public static  void addFontSize(String messurmentUnit, float size){
        String fontSize ="font-size: " + findSize(messurmentUnit, size);
        setInfo(fontSize);
    }



    public static   void   addTextColor(String color){
        if(validColor(color)){
            String setcolor = "color: " + color + ";\n";
            setInfo(setcolor);
        }
        else
            System.out.println("Errror, the color " + color + " is not a valid colorkeyword");
    }

    public static   void addTextColor(int rgb1, int rgb2, int rgb3){
        String setcolor = "color: rgb(" +
                rgb1 + "," +
                rgb2 + "," +
                rgb3 + "," +
                ";\n";
        setInfo(setcolor);
    }


    public static  void  toggleUnderline(){
        String toggeUL= "text-decoration: underline;";
        setInfo(toggeUL);
    }


    public static void addMargin(float spaceBtwn, String unitOfMes){
        String margin = findSize(unitOfMes, spaceBtwn);
        setInfo(margin);
    }





    //identifier if either class or id then sets in the correct sign for it
    public String cssBracket(String identifierType, String target, String info){
        String holder1  ="";

        if(identifierType.equals("id")){
            holder1 = "." + identifierType + "{ \n";
        }
        else if(identifierType.equals("class")){
            holder1 = "#" + identifierType + "{ \n";
        }

        else if(identifierType.equals("tag") &&!isTag(target)){
            System.out.println("ERROR! " + identifierType + " is not a semantic tag, try again");
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


    private static String findSize(String type, float size){
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




    private static boolean validColor(String color){
        for (String colors: listOverColorCodeWords) {
            if(colors.equals(color)){
                return true;
            }
        }
        return false;
    }

}
