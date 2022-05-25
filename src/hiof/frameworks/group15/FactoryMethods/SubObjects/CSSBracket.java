package hiof.frameworks.group15.FactoryMethods.SubObjects;

public class CSSBracket {
    private static final String[] simpleListOverTags, listOverColorCodeWords, listOfBorderStyles;


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
                "MediumSpringGreen", "MediumTurquoise", "MediumVioletRed", "MidnightBlue", "MintCream", "MistyRose", "Moccasin", "NavajoWhite", "Navy", "NavyBlue", "OldLace", "Olive", "OliveDrab", "Orange", "OrangeRed", "Orchid",
                "PaleGoldenrod", "PaleGreen", "PaleTurquoise", "PaleVioletRed", "PapayaWhip", "PeachPuff", "Peru", "Pink", "Plum", "PowderBlue", "Purple", "Rebeccapurple", "Red", "RosyBrown", "RoyalBlue", "SaddleBrown",
                "Salmon", "SandyBrown", "SeaGreen", "Seashell", "Sienna", "Silver", "SkyBlue", "SlateBlue", "SlateGray", "SlateGrey", "Snow", "SpringGreen", "SteelBlue", "Tan", "Teal", "Thistle", "Tomato", "Turquoise",
                "Violet", "Wheat", "White", "WhiteSmoke", "Yellow", "YellowGreen"
        };
        listOfBorderStyles = new String[]{
                "none", "hidden", "dotted", "dashed", "solid",
                "double", "groove", "ridge", "inset", "outset", "initial", "inherit"
        };
    }

    private String targetName, typeOfTarget, info;

    private CSSBracket(String targetName, String typeOfTarget) {
        this.targetName = targetName;
        this.typeOfTarget = typeOfTarget;
        this.info = info;
    }

    public static CSSBracket generate(String cssTypeNTarget, String typeOfTarget) {
        return new CSSBracket(cssTypeNTarget, typeOfTarget);
    }

    private void setInfo(String newinfo) {
        this.info = newinfo;
    }

    @Override
    public String toString() {
        return identify() + targetName + "{\n    " + this.info + "\n}";
    }


    //-------------------------------------BACK GROUND STUFF-----------------------------------
    public void addBackgroundColor(String color) {
        if (isValidColor(color)) {
            String setcolor = "background-color: " + color + ";\n";
            setInfo(setcolor);
        } else
            throw new ArithmeticException("Error, the color " + color + " is not a valid colorkeyword");
    }

    public void addBackgroundColor(int red, int green, int blue) {
        if (isValidRGB(red, green, blue)) {
            String setcolor = "background-color: rgb(" +
                    red + "," +
                    green + "," +
                    blue + "," +
                    ";\n";
            setInfo(setcolor);
        } else
            throw new ArithmeticException("ERROR! RGB values can from 0 to 255 in addBackgroundColor");

    }

    public void setBackgroundImage(String url) {
        setInfo("background-image: url(" + url + ");";
    }

///-------------------------------------------TEXT STUFF---------------------------------

    public void addFontSize(String measurementUnit, float size) {
        String fontSize = "font-size: " + findSize(measurementUnit, size);
        setInfo(fontSize);
    }

    public void addTextColor(String color) {
        if (isValidColor(color)) {
            String setcolor = "color: " + color + ";\n";
            setInfo(setcolor);
        } else
            throw new ArithmeticException("Error, the color " + color + " is not a valid colorkeyword");
    }

    public void addTextColor(int red, int green, int blue) {
        if (isValidRGB(red, green, blue)) {
            String setcolor = "color: rgb(" +
                    red + "," +
                    green + "," +
                    blue + "," +
                    ";\n";
            setInfo(setcolor);
        } else
            throw new ArithmeticException("ERROR! RGB values can from 0 to 255 in addTextColor");
    }


    public void toggleUnderline() {
        String toggleUL = "text-decoration: underline;";
        setInfo(toggleUL);
    }


    //-------------------------------------------------OTHER STUFF

    public void setInline() {
        setInfo("display: inline-block;");
    }

    public void addMargin(float spaceBtwn, String unitOfMes) {
        String margin = findSize(unitOfMes, spaceBtwn);
        setInfo(margin);
    }


    //--------------------------BOX PROPERTIES-------------------
    public void setBorderStyle(String style) {
        if(validBorderStyle(style)) {
            String holder = "border-style: " + style + ";";
            setInfo(holder);
        }
        else   throw new ArithmeticException("ERROR! " + style + " IS NOT A VALID BORDER STYLE");;
    }

    public void setBorderStyle(String topNBottom, String sides) {
        if(validBorderStyle(topNBottom)&& validBorderStyle(sides)) {
            String holder = "border-style: " + topNBottom + sides + ";";
            setInfo(holder);
        }
        else   throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
    }

    public void setBorderStyle(String top, String sides, String bottom) {
        if(validBorderStyle(top)&& validBorderStyle(sides) && validBorderStyle(bottom)) {
            String holder = "border-style: " + top + sides + bottom + ";";
            setInfo(holder);
        }
        else   throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
    }

    public void setBorderStyle(String top, String right, String left, String bottom) {
        if(validBorderStyle(top)&& validBorderStyle(right ) && validBorderStyle(left) && validBorderStyle(bottom)) {
            String holder = "border-style: " + top + right + bottom + left + ";";
            setInfo(holder);
        }
        else  throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
    }
    //---------------------------HELPER METHODS-------------


    private boolean isValidColor(String color) {
        for (String colors : listOverColorCodeWords) {
            if (colors.toLowerCase().equals(color.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private boolean isTag(String identify) {
        for (String tag : simpleListOverTags) {
            if (identify.equals(tag)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidRGB(int a, int b, int c) {
        return a < 256 && b < 256 && c < 256;
    }


    private String identify() {
        String holder1 = "";
        if (this.typeOfTarget.toLowerCase().equals("id")) {
            holder1 = ".";
        } else if (typeOfTarget.toLowerCase().equals("class")) {
            holder1 = "#";
        } else if (typeOfTarget.toLowerCase().equals("tag")) {
            if (!isTag(targetName)) {
                throw new ArithmeticException("ERROR! " + targetName + " is not a semantic tag, class or ID  try again");
            }
        } else
            throw new ArithmeticException("ERROR! INVALID ARGUMENT GIVEN FOR " + typeOfTarget + " WRITE EITHER TAG, ID OR CLASS");
        return holder1;
    }

    private String findSize(String type, float size) {
        double actualSize = 0;

        if (type.equals("") || !type.equals("em") || !type.equals("px")) {
            type = "px";
        }

        if (size <= 0 && type.equals("px")) {
            size = 16;
        } else if (size <= 0 && type.equals("em")) {
            size = 1;
        }

        if (!type.equals("em")) {
            float textSize = size / 16;
            actualSize = Math.pow(textSize, 1);
        }
        return "" + actualSize + type;

    }

    private boolean validBorderStyle(String check){
        for (String style: listOfBorderStyles  ) {
            if(style.equals(check)){return  true}
        }
        return false;
    }


}
