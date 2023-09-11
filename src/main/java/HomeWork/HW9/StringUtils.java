package HomeWork.HW9;

public class StringUtils {
    private static String replace = "***";
    String str;
    private static StringBuffer stringBuffer;


    public static void printFirstTwoBlocks(String str) {
        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.delete(4, 8).substring(0, 9));

    }

    public static void replaceThreeLetterBlocks(String str) {
        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.replace(5, 8, replace)
                .replace(14, 17, replace)
                .replace(19, 20, "*")
                .replace(21, 22, "*"));
    }

    public static void printLowerCaseLetters(String str) {
        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.delete(0, 5)
                .delete(4, 9)
                .delete(8, 9)
                .replace(9, 10, "/")
                .toString().replace("-", "/").toLowerCase());
    }

    public static void printUpperCaseLetters(String str) {
        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.delete(0, 5)
                .delete(4, 9)
                .delete(8, 9)
                .replace(9, 10, "/")
                .toString().replace("-", "/").toUpperCase());

    }

    public static void checkContainSubString(String str) {
        if (str.toUpperCase().matches("(.*)ABC(.*)")) {
            System.out.println("numbDoc has abc ");
        } else {
            System.out.println("numbDoc hasn't abc ");
        }

       /* if(str.matches("(.*)abc(.*)")==true||str.matches("(.*)ABC(.*)")==true){
            System.out.println("numbDoc has abc ");
        }else {System.out.println("numbDoc hasn't abc ");}*/
    }

    public static void checkStartsWith555String(String str) {
        if (str.startsWith("555")) {
            System.out.println("The string starts with 555");
        } else {
            System.out.println("The string doesn't starts with 555");
        }
    }

    public static void checkEndWith1a2bString(String str) {
        if (str.endsWith("1a2b")) {
            System.out.println("The string ends with 1a2b");
        } else {
            System.out.println("The string doesn't ends with 1a2b");
        }
    }

    public static String findShortestWord(String text) {
        String[] words = text.split("\\s+");
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() <= shortestWord.length()) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }
}
