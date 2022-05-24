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
                "DarkCyan", "DarkGoldenrod", "DarkGray", "DarkGreen", "DarkGrey", "DarkKhaki", "DarkMagenta", "DarkOliveGreen", "DarkOrange", "DarkOrchid<A", "DarkRed", "DarkSalmon", "DarkSeaGreen",
                "DarkSlateBlue", "DarkSlateGray", "DarkSlateGrey", "DarkTurquoise", "DarkViolet", "DeepPink", "DeepSkyBlue", "DimGray", "DodgerBlue", "FireBrick", "FloralWhite", "ForestGreen", "Fuchsia",
                "Gainsboro", "GhostWhite", "Gold", "Goldenrod", "Gray", "Green", "GreenYellow", "Grey", "Honeydew", "HotPink", "IndianRed", "Indigo", "Ivory", "Khaki", "Lavender", "LavenderBlush", "LawnGreen",
                "LemonChiffon", "LightBlue", "LightCoral", "LightCyan", "LightGoldenrodYellow", "LightGray", "LightGreen", "LightGrey", "LightPink", "LightSalmon", "LightSeaGreen", "LightSkyBlue", "LightSlateGray",
                "LightSlateGrey", "LightSteelBlue", "LightYellow", "Lime", "LimeGreen", "Linen", "Magenta", "Maroon", "MediumAquamarine", "MediumBlue", "MediumOrchid", "MediumPurple", "MediumSeaGreen", "MediumSlateBlue",
                "MediumSpringGreen", "MediumTurquoise", "MediumVioletRed", "MidnightBlue", "MintCream", "MistyRose", "Moccasin", "NavajoWhite", "Navy", "OldLace", "Olive", "OliveDrab", "Orange", "OrangeRed", "Orchid",
                "PaleGoldenrod", "PaleGreen", "PaleTurquoise", "PaleVioletRed", "PapayaWhip", "PeachPuff", "Peru", "Pink", "Plum", "PowderBlue", "Purple", "Rebeccapurple", "Red", "RosyBrown", "RoyalBlue", "SaddleBrown",
                "Salmon", "SandyBrown", "SeaGreen", "Seashell", "Sienna", "Silver", "SkyBlue", "SlateBlue", "SlateGray", "SlateGrey", "Snow", "SpringGreen", "SteelBlue", "Tan", "Teal", "Thistle", "Tomato", "Turquoise",
                "Violet", "Wheat", "White", "WhiteSmoke", "Yellow", "YellowGreen"
        };
    }

    private    String  targetName, typeOfTarget, info;

    private CSSBracket(String targetName, String typeOfTarget) {
        this.targetName = targetName;
        this.typeOfTarget = typeOfTarget;
        this.info = info;
    }

    public  static CSSBracket generate(String cssTypeNTarget,  String typeOfTarget){
        return new CSSBracket(cssTypeNTarget,   typeOfTarget);
    }

    private  void setInfo(String newinfo) {
        this.info = newinfo;
    }

    @Override
    public  String toString() {
              return identify() + targetName + "{\n    " + this.info + "\n}";
    }

    public   void addFontSize(String measurementUnit, float size){
        String fontSize ="font-size: " + findSize(measurementUnit, size);
        setInfo(fontSize);
    }

    public   void setInline(){
        setInfo("display: inline-block;");
    }

    public    void   addTextColor(String color){
        if(validColor(color)){
            String setcolor = "color: " + color + ";\n";
            setInfo(setcolor);
        }
        else
            System.out.println("REEE");
            throw new ArithmeticException("Error, the color " + color + " is not a valid colorkeyword");
    }

    public    void addTextColor(int rgb1, int rgb2, int rgb3){
        String setcolor = "color: rgb(" +
                rgb1 + "," +
                rgb2 + "," +
                rgb3 + "," +
                ";\n";
        setInfo(setcolor);
    }

    public   void  toggleUnderline(){
        String toggleUL= "text-decoration: underline;";
        setInfo(toggleUL);
    }

    public  void addMargin(float spaceBtwn, String unitOfMes){
        String margin = findSize(unitOfMes, spaceBtwn);
        setInfo(margin);
    }

    //identifier if either class or id then sets in the correct sign for it
    private String identify(){
        String holder1  ="";
        if(this.typeOfTarget.equals("id") || typeOfTarget.equals("ID") || typeOfTarget.equals("Id")  || typeOfTarget.equals("iD")){
            holder1 = ".";
        }
        else if(typeOfTarget.equals("class") || typeOfTarget.equals("CLASS") || typeOfTarget.equals("Class")){
            holder1 = "#";
        }
        else if(typeOfTarget.equals("tag") || typeOfTarget.equals("TAG")  || typeOfTarget.equals("Tag")){
                        if(!isTag(targetName)) {
                throw new ArithmeticException("ERROR! " + targetName + " is not a semantic tag, class or ID  try again");
            }
        }
        else
            throw new ArithmeticException("ERROR! INVALID ARGUMENT GIVEN FOR " +typeOfTarget + " WRITE EITHER TAG, ID OR CLASS");
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

    private  String findSize(String type, float size){
        double actualSize = 0;

        if(type.equals("") || !type.equals("em") || !type.equals("px")) {
            type = "px";
        }

        if(size <= 0 && type.equals("px")){
            size = 16;
        }
        else if(size <= 0 && type.equals("em")){
            size = 1;
        }

        if(!type.equals("em")) {
            float textSize =size / 16;
            actualSize = Math.pow(textSize, 1);
        }

        return "" +actualSize + type;
    }

    private  boolean validColor(String color){
        for (String colors: listOverColorCodeWords) {
            if(colors.equals(color)){
                return true;
            }
        }
        return false;
    }



}
