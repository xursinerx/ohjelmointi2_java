import java.util.Scanner;

public class Average {

    static double average(double[] arr) {

        double avrg = 0;

        for (int i = 0; i < arr.length; i++) {
            avrg = (avrg + arr[i]);
        }
        avrg = avrg / arr.length;

        return avrg;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        double[] arr = new double[4];
        double avrg = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number > ");
            arr[i] = myObj.nextDouble();

        }

        avrg = average(arr);

        System.out.println(avrg);

        myObj.close();
    }
}
