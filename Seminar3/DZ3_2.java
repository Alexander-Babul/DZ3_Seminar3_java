/*Задача 2. Уникальные числа
Напишите метод, который принимает целочисленный массив и возвращает
новый массив, содержащий только уникальные элементы из исходного
массива.
Пример:
[1, 2, 2, 3, 4, 4, 5]
Результат:
[1, 2, 3, 4, 5] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DZ3_2 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int i: a){
            linkedHashSet.add(i);
        }
        int[] b = new int[linkedHashSet.size()];
        int index = 0;
        for(Integer i: linkedHashSet){
            b[index++] = i;

        }
        System.out.println(Arrays.toString(b));
    }
}
