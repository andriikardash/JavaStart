import java.util.Arrays;

public class Main {

    // #1 Перетворити рядок на число
    static void returnNumber (String str) {
        if (str.matches("[0-9.]+")){
            Double str1 = new Double(str);
            System.out.println(str1);
        } else
            System.out.println("Enter value that can be converted into double");
    }

    // #2 Сума кожного числа від 1 до num
    static int SumaChysel (int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        System.out.println(result);
        return result;
    }

    // #3 Обчислити середнє значення елементів масиву
    static void middleValue () {
        int [] elements = {1, 2, 3, 4};
        int result = 0;
        double finalResult = 0.0;
        int count = 0;
        for (int i: elements) {
            result += i;
            count++;
        }
        finalResult= (double) result/count;
        System.out.println(finalResult);
    }

    // #4 Перевірити, чи масив містить певне значення
    static void checkNumberInArray (int num) {
        int [] elements = {1, 2, 5, 4, 5};
        int k = 0;
        for (int i: elements) {
            if (num == i) {
                k++;
            }
        }
            if (k > 0) {
                System.out.println(num + " has been found in array " + k + " times");
            } else
                System.out.println(num +" does not found in array");

    }

    // №6 Знайти макс і мін значення масиву

    static void findMaxMin () {
        int [] elements = {2,-2,6,4,0};
        int min = elements[0];
        int max = elements[0];
        for (int i: elements) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Min value of array is " + min);
        System.out.println("Max value of array is " + max);
    }

    public static void main(String[] args) {

        //returnNumber("12,2");
        //SumaChysel(4);
        //middleValue();
        //checkNumberInArray(5);
        //findMaxMin();
    }
}
