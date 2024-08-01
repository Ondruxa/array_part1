import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("task1");
        int[] arrayInt = new int[3];    //по УСЛОВИЮ задачи создал массив с помощью ключевого слова new
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        double[] arrayDouble = {1.57, 7.654, 9.986}; // по УСЛОВИЮ задачи создал массив без ключевого слова new
        float[] arrayFloat = {2.7f, 4.647f, 45, 0, 68.1f}; //произвольный массив

        //task2
        System.out.println("task2");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println(Arrays.toString(arrayFloat));

        System.out.println("task3");
        for (int elementArrayInt = arrayInt.length - 1; elementArrayInt >= 0; elementArrayInt--) {
            if (elementArrayInt == 0) {
                System.out.println(arrayInt[elementArrayInt]);
                break;
            }
            System.out.print(arrayInt[elementArrayInt] + " ");
        }

        for (int elementArrayDouble = arrayDouble.length - 1; elementArrayDouble >= 0; elementArrayDouble--) {
            if (elementArrayDouble == 0) {
                System.out.println(arrayDouble[elementArrayDouble]);
                break;
            }
            System.out.print(arrayDouble[elementArrayDouble] + " ");

        }
        for (int elementArrayFloat = arrayFloat.length - 1; elementArrayFloat >= 0; elementArrayFloat--) {
            if (elementArrayFloat == 0) {
                System.out.println(arrayFloat[elementArrayFloat]);
                break;
            }
            System.out.print(arrayFloat[elementArrayFloat] + " ");
        }

        System.out.println("task4");
        for (int elementArrayInt = 0; elementArrayInt < arrayInt.length; elementArrayInt++) {
            if (arrayInt[elementArrayInt] % 2 != 0) {
                arrayInt[elementArrayInt] = arrayInt[elementArrayInt] + 1;
            }
            if (elementArrayInt == arrayInt.length - 1) {
                System.out.println(arrayInt[elementArrayInt]);
                break;
            }
            System.out.print(arrayInt[elementArrayInt] + " ");
        }
    }
}