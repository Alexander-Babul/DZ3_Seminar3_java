/*Задача 3. Длина слов
Реализуйте метод, который принимает на вход массив строк и возвращает
новый массив, содержащий только строки, длина которых больше 3 символов.
Пример:
["cat", "elephant", "dog", "giraffe"]
Результат:
["elephant", "giraffe"] */
import java.util.ArrayList;
import java.util.Arrays;

public class DZ3_3 {

    public static void main(String[] args) {
        String[] a = new String[]{"cat", "elephant", "dog", "giraffe"};
        ArrayList<String> result = new ArrayList<>();
        for(String i: a){
            if(i.length() > 3){
                result.add(i);
            }
        }
        String[] b = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            b[i] = result.get(i);
        }
        System.out.println(Arrays.toString(b));
    }
}