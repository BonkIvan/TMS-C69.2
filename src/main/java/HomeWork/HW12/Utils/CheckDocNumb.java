package HomeWork.HW12.Utils;

public class CheckDocNumb {
    String startString1 = "docnum";
    String startString2 = "contract";
    String valid = "valid";
    String invalid = "invalid beginning of the number";
    String invalidLength = "invalid length";


    public void validationNumbDocCheck(String[] arrString) {
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].length() == 15) {
                if (arrString[i].startsWith(startString1) || arrString[i].startsWith(startString2)) {
                    System.out.println(arrString[i].toString() + " валидный");
                } else {
                    System.out.println(arrString[i].toString() + " не валидный");
                }
            } else {
                System.out.println(arrString[i].toString() + " не валидный");
            }
        }

    }

    public String[][] arrayToValidationsDocNumbArray(String[] arrString) {
        String[][] validationsDocNumbArray = new String[arrString.length][2];
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].length() == 15) {
                if (arrString[i].startsWith(startString1) || arrString[i].startsWith(startString2)) {
                    validationsDocNumbArray[i][0] = arrString[i];
                    validationsDocNumbArray[i][1] = valid;
                } else {
                    validationsDocNumbArray[i][0] = arrString[i];
                    validationsDocNumbArray[i][1] = invalid;
                }
            } else {
                validationsDocNumbArray[i][0] = arrString[i];
                validationsDocNumbArray[i][1] = invalidLength;
            }
        }
        return validationsDocNumbArray;
    }

}
