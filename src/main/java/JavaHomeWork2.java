//        1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//        2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//        3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//        4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//        5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//        6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//        7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder

import static java.lang.Long.reverse;

public class JavaHomeWork2 {
    public static String reverseRecurs(String str)
    {
        if (str == null || str.equals("")){
            return str;
        }
        return reverseRecurs(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

//        1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String w = "жара, июль!!";
        StringBuilder e = new StringBuilder("Тополины пух, жара, июль!!");
        System.out.println(w.toString().equals(e.toString()));

//        2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//
        e = e.reverse();
        System.out.println(e);
        System.out.println(w.toString().equals(e.toString()));

//        3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        System.out.println(reverseRecurs(w));

        
//        4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append
        int a = 3;
        int b = 56;

        StringBuilder sum = new StringBuilder();
        sum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        System.out.println(sum);

        StringBuilder dif = new StringBuilder();
        dif
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
         System.out.println(dif);

         StringBuilder mult = new StringBuilder();
        mult
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(mult);

        StringBuilder div = new StringBuilder();
        div
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(div);

//        5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        sum.insert(8, "равно");
        sum.deleteCharAt(7);
        System.out.println(sum);

        dif.insert(8, "равно");
        dif.deleteCharAt(7);
        System.out.println(dif);

        mult.insert(8, "равно");
        mult.deleteCharAt(7);
        System.out.println(mult);

        div.insert(8, "равно");
        div.deleteCharAt(7);
        System.out.println(div);

//        6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(sum.replace(7, 8, "равно"));
        System.out.println(dif.replace(7, 8, "равно"));
        System.out.println(mult.replace(7, 8, "равно"));
        System.out.println(div.replace(7, 8, "равно"));

//        7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder
        StringBuilder one = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            one.append("R");
        }
        long start1 = System.currentTimeMillis();
        for (int c = 0; c < 10000; c++) {
            one.insert(c, "0");
            one.deleteCharAt(c+1);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(one);
        System.out.println("StringBuilder time: " + (end1 - start1));

        StringBuilder two = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            two.append("R");
        }
        long start2 = System.currentTimeMillis();
        for (int c = 0; c < 10000; c++) {
            two.replace(c, c+1, "1");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(two);
        System.out.println("StringBuilder time: " + (end2 - start2));

        System.out.println("Difference: " + ((end1 - start1) - (end2 - start2)));

         }
    }


