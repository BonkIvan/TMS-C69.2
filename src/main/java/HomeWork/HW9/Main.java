package HomeWork.HW9;

public class Main {
    public static void main(String[] args) {

        String replace = null;
        String txt = "Многие классы, например классы из Java Collections Framework, зависят от реализации метода equals(), поэтому не стоит им пренебрегать, т.к. нарушение контракта этого метода может привести к нерациональной работе приложения и в таком случае найти причину будет достаточно трудно.";
        String numbDoc = "5555-GkM-0659-abc-1a2b";
        String numbDoc2 = DocumentNumberGenerator.generatedDocementNumber();
        StringBuilder stringBuilder = new StringBuilder(numbDoc);
        StringBuffer stringBuffer = new StringBuffer(numbDoc);
        String st = "4194-GkM-0659-abc-3W8Q";

        System.out.println(stringBuffer);





        StringUtils.printFirstTwoBlocks(numbDoc);
        StringUtils.replaceThreeLetterBlocks(numbDoc);
        StringUtils.printLowerCaseLetters(numbDoc);
        StringUtils.printUpperCaseLetters(numbDoc);
        StringUtils.checkStartsWith555String(numbDoc);
        StringUtils.checkEndWith1a2bString(numbDoc);

        try {
            StringUtils.checkContainSubString(replace);
        } catch (StringException e) {
            System.err.println("document number " +e.getSubString() + " "+ e.getMessage());
        }


        System.out.println("\n \t -------------------------\n");
        System.out.println(numbDoc2);

        StringUtils.printFirstTwoBlocks(numbDoc2);
        StringUtils.replaceThreeLetterBlocks(numbDoc2);
        StringUtils.printLowerCaseLetters(numbDoc2);
        StringUtils.printUpperCaseLetters(numbDoc2);
      //  StringUtils.checkContainSubString(replace);
        StringUtils.checkStartsWith555String(numbDoc2);
        StringUtils.checkEndWith1a2bString(numbDoc2);

        numbDoc.split("//s+");
        String [] words = txt.split("//s+");
        String shortestWord = words[0];

       System.out.println(StringUtils.findShortestWord(txt));

       StringUtils.findShortestWord(txt);

    }
}
