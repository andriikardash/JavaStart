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


    // #5 Видалити певне значення масиву

    static void removeElementFromArray (int num) {
        int [] elements = {2, 3, 5, 17, 4, 6, 7, 14, -2, 11};
        int [] newElements = null;
        String originalArray = "Original elements of array are: ";
        String newElementsOfArray = "New elements of array are: ";
        System.out.println(originalArray + Arrays.toString(elements));
        for (int i = 0; i < elements.length-1; i++) {
            if (elements[i] == num) {
                newElements = new int[elements.length-1];
                for (int j = 0; j < i; j++) {
                    newElements[j] = elements[j];
                }
                for (int k = i; k < elements.length-1; k++) {
                    newElements[k] = elements[k+1];
                }
                break;
            }
        }
        System.out.println(newElementsOfArray + Arrays.toString(newElements));
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

    // #7 Обчислити середнє значення елементів масиву, крім макс і мін елементів

    static void avgArrayExceptMinMax () {
        int [] elements = {1, 5, 3, 4};
        Arrays.sort(elements);
        int result = 0;
        double finalResult = 0.0;
        int count = 0;
        for (int i = 0; i < elements.length-1; i++) { //не знаю, як почати рахувати з першого елементу масива, а не нульового. i[1] не спрацювало))
                result += elements[i];
                count++;

        }
        System.out.println(result);
        System.out.println(count);
        finalResult= (double) result/count;
        System.out.println(finalResult);

    }

    // #8 Пошук спільних елементів масивів

    static void checkEqualElements () {
        int [] elements = {1, 9, 3, -2};
        int [] elements2 = {-2, 0, 6};
        int count = 0;
        for (int i: elements) {
            for (int j: elements2) {
                if (i == j) {
                    count++;
                }
                }
            }
        if (count > 0){
            System.out.println("There are extra numbers in arrays");
        } else {
            System.out.println("There are no extra numbers in arrays");
        }
    }

    // #9 Видалити повторювані елементи масиву ( не знаю, як зробити)

    /* static void removeDuplicatesFromArray () {
        int [] elements = {1, 3, 5, 3, 7, 7};
        int l = elements.length;
        int [] elements2 = new int[l];
        int j = 0;
        for (int i = 0; i < l-1; i++) {
            if (elements[i] != elements[i+1]) {
                elements2[j++] = elements[i];
            }
        }
        for (int i = 0; i < j; i++) {
            elements[i] = elements2[i];
        }
        System.out.println(Arrays.toString(elements2));
    } */


    // сортування бульбашкою

    static void sortBubble () {
        int [] elements = {8, 2, 5, 1, -4, -3, 5, 41, 3, 99, 12, 30};
        boolean isSorted = false;
        int k;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < elements.length-1; i++) {
                if(elements[i] > elements[i+1]) {
                        isSorted = false;
                        k = elements[i];
                        elements[i] = elements[i+1];
                        elements[i+1] = k;
                }
            }
        }
        System.out.println(Arrays.toString(elements));
    }

    public static void main(String[] args) {

        //returnNumber("12,2");
        //SumaChysel(4);
        //middleValue();
        //checkNumberInArray(5);
        //findMaxMin();
        //removeElementFromArray(4);
        //avgArrayExceptMinMax();
        //checkEqualElements();
        //removeDuplicatesFromArray();
        sortBubble();
    }
}
