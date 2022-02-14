package hiof.frameworks.group15;

public class CSSGenerator {





    //identifier is either class or id
    public String cssBracket(String identifier,String info){
        String holder1  ="";

        if(identifier == "id"){
            holder1 = "." + identifier + "{ \n";
        }
        else if(identifier == "class"){
            holder1 = "#" + identifier + "{ \n";
        }



        holder1  = holder1.concat(info + " \n }");

        return  holder1;
    }


    //Meant to be used multiple times to generate one string with the entierty of the info
    public String groupInfo(String info1, String info2){
        String holder2 = info1 + "\n" +info2;

        return  holder2;
    }

    public String setTextSize(String type, float size){
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

        String cssString =   "font-size: " + actualSize + type+ ";";
        return  cssString;
    }



    public  String setTextColor(String color){
        String setcolor = "color: " + color + ";";

        //TODO CHECK IF VALID
        return  setcolor;
    }

    public  String setTextColor(int rgb1, int rgb2, int rgb3){
        String setcolor = "color: rgb(" +
                rgb1 + "," +
                rgb2 + "," +
                rgb3 + "," +
                ";";
        return  setcolor;
    }


    public String toggleUnderline(){
        String toggeld = "text-decoration: underline;";
        return toggeld;
    }



}