package hiof.frameworks.group15.BuilderPattern;
/**
 * CSS brackets, for targetd CSS layout
 * @author Anders Grindal 
 *
 */
public class CSSBracket {
    private final String targetName, typeOfTarget, info;
    private static final String[] simpleListOverTags;

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
    }

    /**
     * CSSbracket constructor, generates consttructor based on builder
     * @param builder
     */
    public CSSBracket(Builder builder) {
        this.targetName = builder.targetName;
        this.typeOfTarget = builder.typeOfTarget;
        this.info = builder.info;
    }


    /**
     * to string method 
     */
    @Override
    public String toString() {
        return identify() + targetName + "{\n    " + info + "\n}";
    }

    private String identify() {
        String holder1 = "";
        if (this.typeOfTarget.equalsIgnoreCase("id")) {
            holder1 = ".";
        } else if (typeOfTarget.equalsIgnoreCase("class")) {
            holder1 = "#";
        } else if (typeOfTarget.equalsIgnoreCase("tag")) {
            if (!isTag(targetName)) {
                throw new ArithmeticException("ERROR! " + targetName + " is not a semantic tag, class or ID  try again");
            }
        } else
            throw new ArithmeticException("ERROR! INVALID ARGUMENT GIVEN FOR " + typeOfTarget + " WRITE EITHER TAG, ID OR CLASS");
        return holder1;
    }

    private boolean isTag(String identify) {
        for (String tag : simpleListOverTags) {
            if (identify.equals(tag)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Internal builder class
     * @author Anders GRindal
     *
     */
    public static class Builder {
        private static final String[] listOverColorCodeWords, listOfBorderStyles;


        static {
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

        public Builder setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }

        public Builder setTypeOfTarget(String typeOfTarget) {
            this.typeOfTarget = typeOfTarget;
            return this;
        }

        private void setInfo(String newInfo) {
            this.info = info + newInfo + "\n    ";
        }

        public CSSBracket build() {
            return new CSSBracket(this);
        }

        private String targetName, typeOfTarget, info = "";

        public static Builder newInstance(String targetName, String typeOfTarget) {
            return new Builder(targetName, typeOfTarget);
        }

        private Builder(String targetName, String typeOfTarget) {
            this.targetName = targetName;
            this.typeOfTarget = typeOfTarget;
        }


        //-------------------------------------BACK GROUND STUFF-----------------------------------
        public Builder addBackgroundColor(String color) {
            if (isValidColor(color)) {
                String setcolor = "background-color: " + color + ";";
                setInfo(setcolor);
                return this;
            } else
                throw new ArithmeticException("Error, the color " + color + " is not a valid colorkeyword");
        }

        public Builder addBackgroundColor(int red, int green, int blue) {
            if (isValidRGB(red, green, blue)) {
                String setcolor = "background-color: rgb(" +
                        red + "," +
                        green + "," +
                        blue + "," +
                        ";";
                setInfo(setcolor);
                return this;
            } else
                throw new ArithmeticException("ERROR! RGB values can from 0 to 255 in addBackgroundColor");

        }

        public Builder setBackgroundImageLocal(String localPath) {
            setInfo("background-image: url(" + localPath + ");");
            return this;
        }

        public Builder setBackgroundImageFromWeb(String url) {
            setInfo("background-image: url(\"" + url + "\");");
            return this;
        }

///-------------------------------------------TEXT STUFF---------------------------------

        public Builder addFontSize(String unitOfMes, float size) {
            String fontSize = "font-size: " + size + unitOfMes + ";";
            setInfo(fontSize);
            return this;
        }

        public Builder addTextColor(String color) {
            if (isValidColor(color)) {
                String setcolor = "color: " + color + ";\n";
                setInfo(setcolor);
                return this;
            } else
                throw new ArithmeticException("Error, the color " + color + " is not a valid colorkeyword");
        }

        public Builder addTextColor(int red, int green, int blue) {
            if (isValidRGB(red, green, blue)) {
                String setcolor = "color: rgb(" +
                        red + "," +
                        green + "," +
                        blue + "," +
                        ";\n";
                setInfo(setcolor);
                return this;
            } else
                throw new ArithmeticException("ERROR! RGB values can from 0 to 255 in addTextColor");
        }


        public Builder toggleUnderline() {
            String toggleUL = "text-decoration: underline;";
            setInfo(toggleUL);
            return this;
        }


        //-------------------------------------------------OTHER STUFF

        public Builder setInline() {
            setInfo("display: inline-block;");
            return this;
        }

        public Builder fixPosition() {
            setInfo("position: fixed;");
            return this;
        }


        //--------------------------BOX PROPERTIES-------------------
        public Builder setBorderStyle(String style) {
            if (validBorderStyle(style)) {
                String holder = "border-style: " + style + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR! " + style + " IS NOT A VALID BORDER STYLE");
        }

        public Builder setBorderStyle(String topNBottom, String sides) {
            if (validBorderStyle(topNBottom) && validBorderStyle(sides)) {
                String holder = "border-style: " + topNBottom + sides + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
        }

        public Builder setBorderStyle(String top, String sides, String bottom) {
            if (validBorderStyle(top) && validBorderStyle(sides) && validBorderStyle(bottom)) {
                String holder = "border-style: " + top + sides + bottom + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
        }

        public Builder setBorderStyle(String top, String right, String left, String bottom) {
            if (validBorderStyle(top) && validBorderStyle(right) && validBorderStyle(left) && validBorderStyle(bottom)) {
                String holder = "border-style: " + top + right + bottom + left + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
        }

        public Builder addMargin(float spaceBtwn, String unitOfMes) {
            String margin = "margin: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }

        public Builder addMarginLeft(float spaceBtwn, String unitOfMes) {
            String margin = "margin-left: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }

        public Builder addMarginRight(float spaceBtwn, String unitOfMes) {
            String margin = "margin-right: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }

        public Builder addMarginTop(float spaceBtwn, String unitOfMes) {
            String margin = "margin-top: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }

        public Builder addMarginBottom(float spaceBtwn, String unitOfMes) {
            String margin = "margin-bottom: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }


        //---------------------------HELPER METHODS-------------


        private boolean isValidColor(String color) {
            for (String colors : listOverColorCodeWords) {
                if (colors.equalsIgnoreCase(color)) {
                    return true;
                }
            }
            return false;
        }


        private boolean isValidRGB(int a, int b, int c) {
            return a < 256 && b < 256 && c < 256;
        }

        private boolean validBorderStyle(String check) {
            for (String style : listOfBorderStyles) {
                if (style.equals(check)) {
                    return true;
                }
            }
            return false;
        }


    }
}
