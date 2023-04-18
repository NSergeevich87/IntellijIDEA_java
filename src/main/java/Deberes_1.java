public class Deberes_1 {


    public static void main(String[] args) {

/*
            Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
        Если длины массивов не равны, необходимо как-то оповестить пользователя.

            Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
        Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно:
        При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/
    double[] arr1 = {1,2,3,4,5,6,7,8,9};
    double[] arr2 = {9,8,7,6,5,4,3,2,1};

    double[] resultArray = InDosOutOneArray(arr1, arr2);
    PrintArray(resultArray);

    System.out.println();

    double[] resultArray2 = DivisionOfArrays(arr1, arr2);
    PrintArray(resultArray2);
    }

    public static double[] InDosOutOneArray(double[] arr1, double[] arr2) {

        double[] newArray = new double[arr1.length];

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы имеют разный размер!");
            //System.out.println("Длины массивов не равны!");
        }

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr1[i] - arr2[i];
        }

        return newArray;
    }

    public static void PrintArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static double[] DivisionOfArrays(double[] arr1, double[] arr2){
        double scale = Math.pow(10, 2);
        double[] array = new double[arr1.length];

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы имеют разный размер!");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil((arr1[i] / arr2[i])* scale) / scale;
                    ;
        }

        return array;
    }
}
