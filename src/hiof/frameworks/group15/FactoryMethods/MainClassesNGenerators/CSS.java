package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import hiof.frameworks.group15.FactoryMethods.SubObjects.CSSBracket;

public class CSS extends FileGenerator {
    private  static CSSBracket[] cssBracketList;

    public CSS(CSSBracket[] cssBracketList) {
        this.cssBracketList = cssBracketList;
    }

    public static  CSS generate(CSSBracket[] cssBracketList){
        return new CSS(cssBracketList);
    }

    public static void generateFile(String fileName){
        String holder = toStringv2();
        generateFile(fileName,  holder, "css");
    }

    private static String toStringv2() {
        StringBuilder holder = new StringBuilder();
        for (CSSBracket bracket : cssBracketList){
            holder.append("\n").append(bracket.toString());
        }
        return holder.toString();
    }

    @Override
    public  String toString() {
        StringBuilder holder = new StringBuilder();
        for (CSSBracket bracket : cssBracketList){
            holder.append("\n").append(bracket.toString());
        }
        return holder.toString();
    }
}