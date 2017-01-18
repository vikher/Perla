import java.util.Scanner;
public class Minmaxtresnum{
    
     public static void main(String []args){
     int array[] = new int[10];
     Scanner input = new Scanner(System.in);
     System.out.println("Ingresa los tres numeros.");
    for (int i = 0; i < array.length; i++) {
     int next = input.nextInt();
     if (next == 999) {
        break;
    }
    array[i] = next;
    }
    System.out.println("Estos son los tres numeros.");
    printArray(array);
    System.out.println("\n Este es el numero mayor.");
    System.out.println(getMaxValue(array));
    System.out.println("Este es el numero menor.");
    System.out.println(getMinValue(array));
}
public static int getMaxValue(int[] array) {
    int maxValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > maxValue) {
            maxValue = array[i];
        }
    }
    return maxValue;
}
public static int getMinValue(int[] array) {
    int minValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < minValue) {
            minValue = array[i];
        }
    }
    return minValue;
}
public static void printArray(int arr[]) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
