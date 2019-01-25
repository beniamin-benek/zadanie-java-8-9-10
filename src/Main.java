import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //tablica trzech imion
        String[] names = {"Kamil","Stefan","Dawid"};

        String arrayString =  Arrays.toString(names);
        System.out.println(arrayString);

        //tablica 5 liczb całkowitych
        int[] numbers = {5,4,3,2,1};
        System.out.println("\nSuma: " + (numbers[0] + numbers[2] + numbers[4]) + "\n");

        //liczby z przedziału [0, 3] ze zmianą co 0.1
        int i = 0;
        while (i <= 30) {
            System.out.printf("%.1f, ", i * 0.1);
            i++;
        }

        System.out.println();

        int j = 0;
        do {
            System.out.printf("%.1f, ", j * 0.1);
            j++;
        } while (j <= 30);

    }

}