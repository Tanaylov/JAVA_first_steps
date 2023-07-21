public class App {
    public static void main(String[] args){
        String d = "Hello";
        d.charAt(0); // обращение к индексу строки
        int num = 456;
        System.out.println(34 / 5);
        short num1 = 4;
        float num_float = 1.555f;
        double num_double = 456.4568;
        boolean is_car = true;
        char ch = ' ';
        boolean flag = true ^ false ^ true; // оператор '^' принимает значение True только если все или только одно значения True
        var some = 78;
        System.out.println(d + ch + num + num1 + num_double 
        + ch + some + num_float + is_car+ ch + flag);
        System.out.println(getType(num));
        System.out.println(Integer.MAX_VALUE); // Integer - это "обертка" для типа данных int
        int num3 = 2_222; // '_' - можно отделят разряды для читаемости
        System.out.println(num3);
        int a = 123;
        a = --a - a--;
        System.out.println(a);
        int[] arr = new int[10]; //по умолчанию все элементы равны "0", для строк - "", для булевых - "Ложь"
        System.out.println(arr.length);
        int[] arr1 = {1, 2, 3, 5};
        System.out.println(arr1.length);
        System.out.println(arr[2]);
        System.out.println(arr1[1]);
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
