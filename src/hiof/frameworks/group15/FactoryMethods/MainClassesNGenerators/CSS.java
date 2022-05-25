package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import hiof.frameworks.group15.BuilderPattern.CSSBracket;

import java.io.IOException;

public class CSS extends FileGenerator {
    private  static CSSBracket[] cssBracketsList;

    public CSS(CSSBracket[] cssBracketsList) {
        this.cssBracketsList = cssBracketsList;
    }

    public static  CSS generate(CSSBracket[] cssBracketsList){
        return new CSS(cssBracketsList);
    }

    public static void generateFile(String fileName) throws IOException {
        String holder = toStringv2();
        generateFile(fileName,  holder, "css");
    }

    private static String toStringv2() {
        StringBuilder holder = new StringBuilder();
        for (CSSBracket bracket : cssBracketsList){
            holder.append("\n").append(bracket.toString());
        }
        return holder.toString();
    }

    @Override
    public  String toString() {
        StringBuilder holder = new StringBuilder();
        for (CSSBracket bracket : cssBracketsList){
            holder.append("\n").append(bracket.toString());
        }
        return holder.toString();
    }
}