public class Main {

    //Завдання №2. Вивести на екран кожне сьоме число в діапазоні до заданої межі включно
    static int returnEvery7Number(int i) {
    int res1 = 0;
        while (res1 <= i) {
            res1 += 7;
            if (res1 <= i) {
                System.out.println(res1);
            }
        }
return 0;// тут не знаю, що повернути, тому зробив так
    }


    // Завдання №3. Вивесни на екран послідовність чисел: 1 2 4 8 16 32 64 128 256 512
    static void returnNumbers() {
        int res2 = 1;
        for (int i = 1;i < 10;i++) {
            System.out.println(res2);
            res2 *= 2;
        }
    }

    //Завдання №5.
    static double deposit(double amount, int months) {
        double depositValue = 0;
        double endDepositValue = 0;
        double depositPercentage = 0.07;
        for (int i = 0; i <= months; i++) {
            depositValue = (amount * months) * depositPercentage;
        }
        endDepositValue = depositValue + amount;
        System.out.println("Кінцева сума вкладу через " + months + " місяці = " + endDepositValue);
        return endDepositValue;
    }

    //Завдання №6
    static double depositWhile(double amount, int months) {
        double depositValue = 0;
        double endDepositValue = 0;
        double depositPercentage = 0.07;
        int i = 0;
        while (i <= months) {
            depositValue = (amount * months) * depositPercentage;
            i++;
        }
        endDepositValue = depositValue + amount;
        System.out.println("Кінцева сума вкладу через " + months + " місяці = " + endDepositValue);
        return endDepositValue;
    }


    //Завдання #7
    static int daysOfWeek(int day) {
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Enter value from 1 to 7");
        }
        return day;
    }

    //Завдання №8
    static int daysOfWeekSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter value from 1 to 7");
        }
        return day;
    }

    //Завдання №9.
    static int factorial(int f) {
        int resFactorial = 1;
        if (f > 0) {
            for (int i = 1; i <= f; i++) {
                resFactorial = resFactorial * i;
            }
        } else {
            resFactorial = 1;
        }
        System.out.println(resFactorial);
        return f;
    }

    public static void main(String[] args) {

        // Завдання №1. Вивести на екран табличку множення на 4;
        for(int i = 1; i <= 9;i++) {
            int res = 4 * i;
            System.out.println(res);
        }

        //System.out.println(returnEvery7Number(40));// Завдання №2

        //returnNumbers();//Завдання №3

        //deposit (5000.50, 2);// Завдання №5

        //depositWhile(10000, 2);// Завдання №6

        //daysOfWeek(9);//Завдання №7

        //daysOfWeekSwitch(5);//Завдання №8

        //factorial(5);//Завдання №9

    }
}
