import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = false;
        while (x == false) {
            System.out.println();
            System.out.println("SelectionSort");
            System.out.println("Wybierz opcję");
            System.out.println("1.Losowanie");
            System.out.println("2.Własne dane");
            System.out.println("0. Wyjście");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Wpisz długość tablicy: ");
                    int arraySize = scanner.nextInt();
                    double[] arr = new double[arraySize];
                    int max = 70;
                    int min = 30;
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = Math.random() * (max - min) + min;
                        
                    }
                    Sort(arr);
                    break;
                case "2":
                    System.out.println("Wpisz dlugosc tablicy: ");
                    arraySize = scanner.nextInt();
                    arr = new double[arraySize];
                    for(int i = 0; i < arr.length;i++){
                        System.out.println("Wpisz dane do tablicy: ");
                        arr[i] = scanner.nextInt();
                    }
                    Sort(arr);
                    break;
                case "0":
                    x = true;
                    break;
            }

        }
    }
        public static double[] Sort ( double arr[]){
            int arrSize = arr.length;
            for (int i = 0; i < arrSize - 1; i++) {
                int min1 = i;
                for (int j = i + 1; j < arrSize; j++) {
                    if (arr[j] < arr[min1]) {
                        min1 = j;
                    }
                }
                double x = arr[min1];
                arr[min1] = arr[i];
                arr[i] = x;

            }
            for (int i = 0; i < arr.length; i++) {
                if (i % 10 == 0) System.out.println();
                System.out.print(Math.round(arr[i] * 100.0) / 100.0 + " ");

            }
            return arr;
        }
    }
