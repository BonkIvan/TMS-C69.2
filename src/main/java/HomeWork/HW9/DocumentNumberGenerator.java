package HomeWork.HW9;

import java.util.Random;

public class DocumentNumberGenerator {
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int MAX_DIGIT = 10;
    private static final int NUM_PART_LENGTH = 4;
    private static final int LETTER_PART_LENGTH = 3;


    public static String generatedDocementNumber(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i<NUM_PART_LENGTH; i++){
            stringBuilder.append(random.nextInt(MAX_DIGIT));
        }
        stringBuilder.append("-");

        for(int i = 0; i<LETTER_PART_LENGTH; i++){
            stringBuilder.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }
        stringBuilder.append("-");
        for(int i = 0; i<NUM_PART_LENGTH; i++){
            stringBuilder.append(random.nextInt(MAX_DIGIT));
        }
        stringBuilder.append("-");

        for(int i = 0; i<LETTER_PART_LENGTH; i++){
            stringBuilder.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }
        stringBuilder.append("-");

        for(int i = 0; i<NUM_PART_LENGTH; i++){
            if(i%2==0){
            stringBuilder.append(random.nextInt(MAX_DIGIT));
            }else {
            stringBuilder.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
            }
        }


        return stringBuilder.toString();
    }



}
