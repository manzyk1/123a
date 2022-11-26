public class Main {
    public static void main(String[] имя_массива_стринг) {
        int[] ИмяМассива = {2, 9, 9, 7};
        int[] ИмяМассива2 = {3, 1, 1, 8};

        допМетод(ИмяМассива2);
        System.out.println("dop provierka");


    }

    static void допМетод(int[] имя_массива_в_допМетод) {
        for (int i = 0; i < имя_массива_в_допМетод.length; i++) {
            System.out.println(имя_массива_в_допМетод[i]);

        }
    }
}