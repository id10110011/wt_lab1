package by.bsuir;

import java.util.ArrayList;
import java.util.List;

public class Solutions {
    public double task1(long x, long y) {
        double firstExpr = 1 + Math.sin(x + y) * Math.sin(x + y);
        double secondExpr = 2 + Math.abs(x - (2 * x / (1 + x * x * y * y)));
        return ((firstExpr / secondExpr) + x);
    }

    public boolean task2(long x, long y) {
        boolean isFirstSection = ((x >= -4) && (x <= 4) && (y <= 5) && (y >= 0));
        boolean isSecondSection = ((x >= -6) && (x <= 6) && (y <= 0) && (y >= -3));
        return isFirstSection || isSecondSection;
    }

    public double[][] task3(int a, int b, double h) {
        int amount = (int) (((b - a) / h) + 1);
        double[][] table = new double[amount][2];
        double arg = a;

        for (int i = 0; i < amount; i++) {
            table[i][0] = arg;
            table[i][1] = Math.tan(arg);
            arg += h;
        }
        return table;
    }

    public List<Integer> task4(int[] arr) {
        List<Integer> primeNums = new ArrayList<>();

        for (int num : arr) {
            if (isPrimeNumber(num)) {
                primeNums.add(num);
            }
        }

        return primeNums;
    }

    private boolean isPrimeNumber(int num) {
        int temp;
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public int task5(int[] arr) {
        int result = 0;
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                result++;
            } else {
                index = i;
            }
        }
        return result;
    }

    public int[][] task6(int[] arr) {
        int size = arr.length;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = arr[(i + j) % size];
            }
        }
        return matrix;
    }

    public int[] task7(int[] arr) {
        int index = 0;
        while (index < arr.length - 1) {
            if (arr[index] <= arr[index + 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
                index = index != 0 ? index - 1 : 0;
            }
        }

        return arr;
    }

    public int[] task8(int[] firstArr, int[] secondArr) {
        int[] result = new int[secondArr.length];
        int indexSecondArr = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] > secondArr[indexSecondArr]) {
                result[indexSecondArr] = i + indexSecondArr;
                indexSecondArr++;
                i--;
            }
        }
        for (int i = indexSecondArr; i < result.length; i++) {
            result[i] = firstArr.length + indexSecondArr;
            indexSecondArr++;
        }
        return result;
    }


}
