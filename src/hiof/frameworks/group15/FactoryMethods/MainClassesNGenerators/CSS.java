package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import hiof.frameworks.group15.FactoryMethods.SubObjects.CSSBracket;

public class CSS extends FileGenerator {

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


    //MAKE THIS A ADD STUFF
    private  static CSSBracket[] cssBracketList;


    public CSS(CSSBracket[] cssBracketList) {
        this.cssBracketList = cssBracketList;
    }

    public static  CSS generate(CSSBracket[] cssBracketList){
        CSS holder = new CSS(cssBracketList);
        return holder;
    }


    @Override
    public String toString() {
        String holder = "";
        for (CSSBracket bracket : cssBracketList){
            holder += "\n" + bracket.toString();
        }
        return holder;
    }
}