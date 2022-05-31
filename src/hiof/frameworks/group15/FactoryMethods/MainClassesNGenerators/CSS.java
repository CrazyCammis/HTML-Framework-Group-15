package hiof.frameworks.group15.FactoryMethods.MainClassesNGenerators;

import hiof.frameworks.group15.BuilderPattern.CSSBracket;

import java.io.IOException;
/**
 * CSS class for CSS 
 * @author Anders Grindal
 *
 */
public class CSS extends FileGenerator {
    private  static CSSBracket[] cssBracketsList;

    private  CSS(CSSBracket[] cssBracketsList) {
        CSS.cssBracketsList = cssBracketsList;
    }

    /**
     * Generates CSS object with an array of CSSBracket objects
     * @param cssBracketsList List of CSSBrackets that are made and gathered into an array, used for toString method 
     * @return Generated CSS
     */
    public static  CSS generate(CSSBracket[] cssBracketsList){
        return new CSS(cssBracketsList);
    }

    /**
     * Genereates a CSS file 
     * @param fileName filename, adds .css to the end
     * @throws IOException If error occurs, it will thorw an excpetion
     */
    public static void generateCSSFile(String fileName) throws IOException {
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

    /**
     * To string method
     */
    @Override
    public  String toString() {
        StringBuilder holder = new StringBuilder();
        for (CSSBracket bracket : cssBracketsList){
            holder.append("\n").append(bracket.toString());
        }
        return holder.toString();
    }
}