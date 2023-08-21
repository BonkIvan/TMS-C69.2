package HomeWork.HW5.ATM;

public class ATM {
    int[] numberOfBills = {0, 0, 0};
    int[] billValues = {20, 50, 100};


    public ATM() {
        numberOfBills = new int[]{50, 20, 10};
    }

    /**
     * Добавление денег в банкомат
     */
    public void addMoney(int twenties, int fifties, int hundreds) {
        numberOfBills[0] = numberOfBills[0] + twenties;
        numberOfBills[1] = numberOfBills[1] + fifties;
        numberOfBills[2] = numberOfBills[2] + hundreds;
    }

    /**
     * метод считает сумму денег и записывает ее в переменную
     */
    int getTotalMoney() {
        int getSum = 0;
        for (int i = 0; i < numberOfBills.length; i++) {
            getSum = getSum + numberOfBills[i] * billValues[i];
        }
        return getSum;
    }


    /**
     * метод выводит информацию о сумме денег в банкомате
     */
    public void showTotalMoney() {
        int totalManey = 0;
        for (int i = 0; i < numberOfBills.length; i++) {
            totalManey = totalManey + numberOfBills[i] * billValues[i];
        }
        System.out.println(totalManey);
    }

    public void checkAvailability(int sum) {
        if (sum > 0) {
            if (sum <= getTotalMoney()) {
                if (sum >= 20 && sum != 30) {
                    if (sum % 10 == 0) {
                        if (sum % 100 == 10 || sum % 100 == 30 || sum % 100 == 80) {
                            /** выдача 2 двадцаток*/
                            sum = sum - billValues[0] * 2;
                            numberOfBills[0] = numberOfBills[0] - 2;

                            /** выдал сотни*/
                            int hundredsTaken = Math.min(sum / billValues[2], numberOfBills[2]);
                            sum = sum - hundredsTaken * billValues[2];
                            numberOfBills[2] = numberOfBills[2] - hundredsTaken;

                            /** Выдал пятьдесятки*/
                            int fiftiesTaken = Math.min(sum / billValues[1], numberOfBills[1]);
                            sum = sum - fiftiesTaken * billValues[1];
                            numberOfBills[1] = numberOfBills[1] - fiftiesTaken;

                            /** Выдал двадцатки*/
                            int twentiesTaken = Math.min(sum / billValues[0], numberOfBills[0]);
                            sum = sum - twentiesTaken * billValues[0];
                            numberOfBills[0] = numberOfBills[0] - twentiesTaken;

                            if (sum == 0) {
                                System.out.println("по пути if. Сняты купюры: " + hundredsTaken + "x100, " +
                                        fiftiesTaken + "x50, " + twentiesTaken + "x20");
                            }


                        } else {
                            /** выдал сотни*/
                            int hundredsTaken = Math.min(sum / billValues[2], numberOfBills[2]);
                            sum = sum - hundredsTaken * billValues[2];
                            numberOfBills[2] = numberOfBills[2] - hundredsTaken;

                            /** Выдал пятьдесятки*/
                            int fiftiesTaken = Math.min(sum / billValues[1], numberOfBills[1]);
                            sum = sum - fiftiesTaken * billValues[1];
                            numberOfBills[1] = numberOfBills[1] - fiftiesTaken;

                            /** Выдал двадцатки*/
                            int twentiesTaken = Math.min(sum / billValues[0], numberOfBills[0]);
                            sum = sum - twentiesTaken * billValues[0];
                            numberOfBills[0] = numberOfBills[0] - twentiesTaken;

                            if (sum == 0) {
                                System.out.println("по пути else. Сняты купюры: " + hundredsTaken + "x100, " +
                                        fiftiesTaken + "x50, " + twentiesTaken + "x20");
                            }
                        }

                        System.out.println("Проверка на нужные купюры");
                    } else {
                        System.out.println("данная сума не может быть выдана из-за отсутвия купюр нужного наминала");
                    }
                } else {
                    System.out.println("Сумма не подходит");
                }

                System.out.println("сравнение сумм");

            } else {
                System.out.println("Недостаточно денег для выдачи данной суммы");
            }
            System.out.println("проверка на отрицательное значение");
        } else {
            System.out.println("Сумма не может быть отрицательной!");
        }
    }

    public boolean hasPositiveValue(int sum) {
        if (sum < 0) {
            System.out.println("Сумма не может быть отрицательной!");
            return false;
        }
        return true;
    }

    public boolean canWithdrawAmount(int sum) {
        if (sum > getTotalMoney()) {
            System.out.println("В банкомате недостаточно средст!");
            return false;
        }
        return true;
    }

    public boolean isMultipleOf(int sum){
        if (sum % 100 == 10 || sum % 100 == 30 || sum % 100 == 80) {
            return false;
        } return true;

    }
    public boolean hasRequiredBills(int sum) {
        if(isMultipleOf(sum)==false){
            numberOfBills[0] = numberOfBills[0]-2;
            sum = sum -40;
        }
        int hundredsNeeded = sum / 100;
        int fiftiesNeeded = sum  / 50;
        int twentiesNeeded = sum / 20;
        if (numberOfBills[0] < twentiesNeeded || numberOfBills[1] < fiftiesNeeded || numberOfBills[2] < hundredsNeeded) {
            System.out.println("Банкомат не может выдать указанную сумму.");
            return false;
        }
        return true;

    }



    public void withdrawMoney(int sum){
        if(hasPositiveValue(sum) == true && canWithdrawAmount(sum)==true&& hasRequiredBills(sum)==true) {
            int hundredsTaken = Math.min(sum / billValues[2], numberOfBills[2]);
            sum = sum - hundredsTaken * billValues[2];
            numberOfBills[2] = numberOfBills[2] - hundredsTaken;

            /** Выдал пятьдесятки*/
            int fiftiesTaken = Math.min(sum / billValues[1], numberOfBills[1]);
            sum = sum - fiftiesTaken * billValues[1];
            numberOfBills[1] = numberOfBills[1] - fiftiesTaken;

            /** Выдал двадцатки*/
            int twentiesTaken = Math.min(sum / billValues[0], numberOfBills[0]);
            sum = sum - twentiesTaken * billValues[0];
            numberOfBills[0] = numberOfBills[0] - twentiesTaken;

            if (sum == 0) {
                System.out.println("по пути 1. Сняты купюры: " + hundredsTaken + "x100, " +
                        fiftiesTaken + "x50, " + twentiesTaken + "x20");
            }
        }
        else {
                int hundredsTaken = Math.min(sum / billValues[2], numberOfBills[2]);
                sum = sum - hundredsTaken * billValues[2];
                numberOfBills[2] = numberOfBills[2] - hundredsTaken;

                /** Выдал пятьдесятки*/
                int fiftiesTaken = Math.min(sum / billValues[1], numberOfBills[1]);
                sum = sum - fiftiesTaken * billValues[1];
                numberOfBills[1] = numberOfBills[1] - fiftiesTaken;

                /** Выдал двадцатки*/
                int twentiesTaken = Math.min(sum / billValues[0], numberOfBills[0]);
                sum = sum - twentiesTaken * billValues[0];
                numberOfBills[0] = numberOfBills[0] - twentiesTaken;

                if (sum == 0) {
                    System.out.println("по пути 2. Сняты купюры: " + hundredsTaken + "x100, " +
                            fiftiesTaken + "x50, " + twentiesTaken + "x20");
                }

            }
        }




    public void showNumberOfBills() {
        for (int i = 0; i < numberOfBills.length; i++) {
            System.out.print(numberOfBills[i] + "  ");

        }
        System.out.println(" ");
    }

}
