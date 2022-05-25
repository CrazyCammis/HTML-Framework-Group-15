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
     * CSSbracket constructor, generates constructor based on builder
     * @param builder Requires a builder then copies the info from in into a new object
     */
    public  CSSBracket(Builder builder) {
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

        /**
         * Setter for the CSS target for this bracket
         * @param targetName target for this CSS brackets
         * @return returns the updated builder
         */
        public Builder setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }

       
        /**
         *  Setter for the CSS type of target for this bracket
         * @param targetName  type of target for this CSS brackets,  class, id or tag
         * @return  returns the updated builder
         */
        public Builder setTypeOfTarget(String typeOfTarget) {
            this.typeOfTarget = typeOfTarget;
            return this;
        }

        private void setInfo(String newInfo) {
            this.info = info + newInfo + "\n    ";
        }

        /**
         * Builds the builder then converts it into a CSSbracket object
         * @return returns the new CSS bracket that was generated for us
         */
        public CSSBracket build() {
            return new CSSBracket(this);
        }

        private String targetName, typeOfTarget, info = "";

        /**
         * Creates a new instance of the builder, requires the name of what the target is going to be 
         * and if its class id or a tag 
         * @param targetName What the target for the CSS bracket is
         * @param typeOfTarget What kind of target it is, class, id or tag
         * @return returns the updated builder
         */
        public static Builder newInstance(String targetName, String typeOfTarget) {
            return new Builder(targetName, typeOfTarget);
        }

        private Builder(String targetName, String typeOfTarget) {
            this.targetName = targetName;
            this.typeOfTarget = typeOfTarget;
        }


        //-------------------------------------BACK GROUND STUFF-----------------------------------
        /**
         * Creates and adds a background colour to the target of this CSS bracket 
         * @param color Colour keyword
         * @return returns the updated builder
         */
        public Builder addBackgroundColor(String color) {
            if (isValidColor(color)) {
                String setcolor = "background-color: " + color + ";";
                setInfo(setcolor);
                return this;
            } else
                throw new ArithmeticException("Error, the color " + color + " is not a valid colorkeyword");
        }

        /**
         * Set background colour based on RGB values of this CSS bracket
         * @param red how much red is added
         * @param green how much green is added
         * @param blue how much blue is added
         * @return returns the updated builder
         */
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

        
        /**
         * Set a background image from a file on the computer on the target CSS bracket
         * @param localPath the path
         * @return returns the updated builder
         */
        public Builder setBackgroundImageLocal(String localPath) {
            setInfo("background-image: url(" + localPath + ");");
            return this;
        }

        /**
         * Set a background image from the the web  on the target for this CSS bracket
         * @param url the image link
         * @return returns the updated builder 
         */
        public Builder setBackgroundImageFromWeb(String url) {
            setInfo("background-image: url(\"" + url + "\");");
            return this;
        }

///-------------------------------------------TEXT STUFF---------------------------------

        /**
         * Sets the text size of target of this CSS bracket
         * @param unitOfMes what unit of meassurement we use
         * @param size returns the updated builder
         * @return returns the updated builder
         */
        public Builder setTextSize(String unitOfMes, float size) {
            String fontSize = "font-size: " + size + unitOfMes + ";";
            setInfo(fontSize);
            return this; 
        }

        /**
         * Sets a text colour based on a colour keyword on the target of this CSS bracket
         * @param color Color key word
         * @return returns the updated builders
         */
        public Builder addTextColor(String color) {
            if (isValidColor(color)) {
                String setcolor = "color: " + color + ";\n";
                setInfo(setcolor);
                return this;
            } else
                throw new ArithmeticException("Error, the color " + color + " is not a valid colorkeyword");
        }

        /**
         * Set an RGB based text colour on the target of this CSS bracket
         * @param red how much red is to bed added
         * @param green how much g is to be added
         * @param blue how much blue is to be added
         * @return returns the updated builder
         */
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


        /**
         * adds underline to the text on the target of this CSS bracket
         * @return returns the updated builder
         */
        public Builder addUnderline() {
            String toggleUL = "text-decoration: underline;";
            setInfo(toggleUL);
            return this;
        }


        //-------------------------------------------------OTHER STUFF
        /**
         * Used for when list are the target for this CSS bracket, this sets them into a in line list instead of down list.
         * @return returns the updated builder
         */
        public Builder setInline() {
            setInfo("display: inline-block;");
            return this;
        }

        /**
         * Fixes the target position on the  screen
         * @return returns the updated builder
         */ 
        public Builder fixPosition() {
            setInfo("position: fixed;");
            return this;
        }


        //--------------------------BOX PROPERTIES-------------------
        /**
         * Sets border style for the entire box for the target of this CSS bracket
         * Returns error if invalid style is given
         * @param style border Style
         * @return returns the updated builder
         */
        public Builder setBorderStyle(String style) {
            if (validBorderStyle(style)) {
                String holder = "border-style: " + style + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR! " + style + " IS NOT A VALID BORDER STYLE");
        }

        /**
         *  Sets border style for the top and bottom with the same style, and for the sides for the target of this CSS bracket
         * Returns error if invalid style is given
         * @param topNBottom Style for top border
         * @param sides Styles for the left and right  border
         * @return returns the updated builder
         */
        public Builder setBorderStyle(String topNBottom, String sides) {
            if (validBorderStyle(topNBottom) && validBorderStyle(sides)) {
                String holder = "border-style: " + topNBottom + sides + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
        }

        /**
         *  Sets border style for the top and bottom, and for the sides for the target of this CSS bracket
         * Returns error if invalid style is given
         * @param top Style for Top border
         * @param sides Style for left and right border
         * @param bottom Style for bottom border
         * @return returns the updated builder
         */
        public Builder setBorderStyle(String top, String sides, String bottom) {
            if (validBorderStyle(top) && validBorderStyle(sides) && validBorderStyle(bottom)) {
                String holder = "border-style: " + top + sides + bottom + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
        }

        /**
         *  Sets border style for the top and bottom, and for left and right side for the target of this CSS bracket
         * Returns error if invalid style is given
         * @param top Style for top border
         * @param right Style for right border
         * @param left Style for left border
         * @param bottom Style for bottom border
         * @return returns the updated builder
         */
        public Builder setBorderStyle(String top, String right, String left, String bottom) {
            if (validBorderStyle(top) && validBorderStyle(right) && validBorderStyle(left) && validBorderStyle(bottom)) {
                String holder = "border-style: " + top + right + bottom + left + ";";
                setInfo(holder);
                return this;
            } else throw new ArithmeticException("ERROR!  INVALID BORDER STYLE GIVEN");
        }

        /**
        * Adds a margin with same distance around  the target of this CSS bracket
        * @param spaceBtwn How big the margin is going to be
        * @param unitOfMes unit of measurement between
        * @return returns the updated builder
        */
        public Builder addMargin(float spaceBtwn, String unitOfMes) {
            String margin = "margin: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }
        
        
        /**
         * Adds a margin to the  left of  the target of this CSS bracket
         * @param spaceBtwn How big the margin is going to be
         * @param unitOfMes unit of measurement between
         * @return returns the updated builder
         */
        public Builder addMarginLeft(float spaceBtwn, String unitOfMes) {
            String margin = "margin-left: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }
        
        /**
         * Adds a margin to the  right of  the target of this CSS bracket
         * @param spaceBtwn How big the margin is going to be
         * @param unitOfMes unit of measurement between
         * @return returns the updated builder
         */
        public Builder addMarginRight(float spaceBtwn, String unitOfMes) {
            String margin = "margin-right: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }

        /**
         * Adds a margin to the  top of  the target of this CSS bracket
         * @param spaceBtwn How big the margin is going to be
         * @param unitOfMes unit of measurement between
         * @return returns the updated builder
         */
        public Builder addMarginTop(float spaceBtwn, String unitOfMes) {
            String margin = "margin-top: " + spaceBtwn + unitOfMes + ";";
            setInfo(margin);
            return this;
        }

        /**
         * Adds a margin to the  bottom  of  the target of this CSS bracket
         * @param spaceBtwn How big the margin is going to be
         * @param unitOfMes unit of measurement between
         * @return returns the updated builder
         */
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
