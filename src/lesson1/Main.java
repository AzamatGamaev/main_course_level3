package lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5};
        System.out.print("Массив array c элементами: ");
        soutArray(array);

        changeElements(array, 0, 4);
        System.out.print("Исвользовав метод changeValue с элементами 0 и 4, массив array принял следующий вид: ");
        soutArray(array);

        Integer[] array2 = {1, 2, 3, 4, 5};
        System.out.print("Имеется массив array2 типа " + array2.getClass().getSimpleName() + " и элементами: ");
        soutArray(array2);
        System.out.println("Используя метод arrayToArrList, array2 преобразован в "
                + arrayToArrList(array2).getClass().getSimpleName() + " c элементами: " + arrayToArrList(array2));

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        for (int i = 0; i < 100; i++) {
            orangeBox.put(new Orange());
            appleBox.put(new Apple());
            appleBox2.put(new Apple());
        }

        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(appleBox2));

        appleBox.transfer(appleBox2);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
    }


    private static <A> void soutArray(A[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1))
                System.out.println(array[i] + "]");
            else
                System.out.print(array[i] + ", ");
        }
    }

    public static <A> void changeElements(A[] array, int elementsOne, int elementsTwo) {
        try {
            A x = array[elementsOne];
            array[elementsOne] = array[elementsTwo];
            array[elementsTwo] = x;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Одного или обоих из указанных индексов нет в массиве.");
        }
    }

    // Реализация метода Collections.addAll
    public static <B> ArrayList<B> arrayToArrList(B[] array) {
        ArrayList<B> atlArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            atlArrayList.add(array[i]);
        }
        return atlArrayList;
    }
}

