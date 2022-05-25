package homework3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {

        workone();
        worktwo();
        workthree();
        workfour();
        System.out.println("Печать заданного массива: " + Arrays.toString(workfive(9, 1)));
        System.out.println();
        worksix();
        System.out.println("Значения левой и правой части массива равны. - it's a " + workseven(new int[]{1, 4, 10, 6, 4, 5}));
        System.out.println();
        workeight(new int[] {1,2,3,5,4,4,3}, -4);
    }

    public static void workone() {
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1};
        System.out.println("Массив до изменений: " + Arrays.toString(arr));

        for (int i = 0; i < (arr.length); i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.println("Массив после замены 0 на 1, 1 на 0: " + Arrays.toString(arr));
        System.out.println();
    }

    public static void worktwo() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Массив из 100 значений: " + Arrays.toString(arr));
        System.out.println();
    }

    public static void workthree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив до изменений: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }

        }
        System.out.println("Массив после умножения на 2 чисел меньше 6: " + Arrays.toString(arr));
        System.out.println();
    }

    public static void workfour() {
        int arr[][] = new int[9][9];
        int a = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if (i == j) {
                    arr[i][j] = 1;
                }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)

                arr[i][a] = 1;
            a--;
        }
        System.out.println("Печать диагоналей из единиц:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] workfive(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void worksix() {
        Random random = new Random();
        int[] arr = new int[20];
        int max = 0;
        int min = 100;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Максимально значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println();
    }

    public static boolean workseven(int[] arr) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            right += arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            left+= arr[i];
            right -= arr[i];
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    public static void workeight (int[] arr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = arr[arr.length - 1];
                for (int j = 0; j < arr.length; j++) {
                    if (j != arr.length-1) {
                        arr[arr.length-1-j] = arr[arr.length-2-j];
                    } else {
                        arr[0] = a;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        else if (n < 0){
            for (int i = 0; i < n * (-1); i++) {
                int a = arr[0];
                for (int j = 0; j < arr.length; j++) {
                    if (j != arr.length-1) {
                        arr[j] = arr[j+1];
                    } else {
                        arr[arr.length-1] = a;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        } else return;

    }
}


