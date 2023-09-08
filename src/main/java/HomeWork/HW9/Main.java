package HomeWork.HW9;

public class Main {
    public static void main(String[] args) {

        String replace = "***";

        String numbDoc = "5555-GkM-0659-abc-1a2b";
                //DocumentNumberGenerator.generatedDocementNumber();
        StringBuilder stringBuilder = new StringBuilder(numbDoc);
        StringBuffer stringBuffer = new StringBuffer(numbDoc);
        String st = "4194-GkM-0659-abc-3W8Q";

        // System.out.println(stringBuffer.delete(4,8).substring(0,9));

       // System.out.println(stringBuffer.replace(5,8,replace).replace(14,17,replace));
        System.out.println(stringBuffer);


       /* if(numbDoc.matches("(.*)abc(.*)")==true||numbDoc.matches("(.*)ABC(.*)")==true){
            System.out.println("numbDoc has abc ");
        }else {System.out.println("numbDoc hasn't abc ");}*/


        StringUtils.printFirstTwoBlocks(numbDoc);
        StringUtils.replaceThreeLetterBlocks(numbDoc);
        StringUtils.printLowerCaseLetters(numbDoc);
        StringUtils.printUpperCaseLetters(numbDoc);
        StringUtils.checkContainSubString(numbDoc);
        StringUtils.checkStartsWith555String(numbDoc);


        System.out.println(numbDoc.toUpperCase().matches("(.*)ABC(.*)"));
        System.out.println(numbDoc.contains("ABC"));
        System.out.println(numbDoc.startsWith("555"));
        System.out.println(numbDoc.endsWith("1a2b"));


    /*    System.out.println(stringBuffer.delete(0, 5)
                .delete(4, 9)
                .delete(8, 9)
                .replace(9, 10, "/")
                .toString().replace("-", "/").toLowerCase());*/


      /*  System.out.println(stringBuffer.delete(0, 5)
                .delete(4, 9)
                .delete(8, 9)
                .replace(9, 10, "/")
                .toString().replace("-", "/").toUpperCase());*/


    }
}
