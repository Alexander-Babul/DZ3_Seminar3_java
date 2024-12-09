// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.
// Пример:
// [-1, 2, -3, 4, -5, 6]
// Результат:
// [2, 4, 6]

import java.util.ArrayList;
import java.util.Arrays;

public class DZ3_1 {

    public static void main(String[] args) {
        int[] a = new int[]{-1, 2, -3, 4, -5, 6};
        ArrayList<Integer> result = new ArrayList<>();
        for(int i: a){
            if(i>=0){
                result.add(i);
            }
        }
        int[] b = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            b[i] = result.get(i);
        }
        System.out.println(Arrays.toString(b));
    }
}
