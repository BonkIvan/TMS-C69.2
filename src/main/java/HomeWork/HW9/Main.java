package HomeWork.HW9;

public class Main {
    public static void main(String[] args) {

        String replace = "***";

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
        StringUtils.checkContainSubString(numbDoc);
        StringUtils.checkStartsWith555String(numbDoc);
        StringUtils.checkEndWith1a2bString(numbDoc);

        System.out.println("\n \t -------------------------\n");
        System.out.println(numbDoc2);

        StringUtils.printFirstTwoBlocks(numbDoc2);
        StringUtils.replaceThreeLetterBlocks(numbDoc2);
        StringUtils.printLowerCaseLetters(numbDoc2);
        StringUtils.printUpperCaseLetters(numbDoc2);
        StringUtils.checkContainSubString(numbDoc2);
        StringUtils.checkStartsWith555String(numbDoc2);
        StringUtils.checkEndWith1a2bString(numbDoc2);





    }
}
