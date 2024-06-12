//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        int a = 674;

        while (a != 0) {
            int i = a % 10;
            a = a / 10;
            System.out.println(i);
        }

        //task 2
        int n = 134835784;
        int max = 0;
        int min = 9;

        while (n != 0) {
            int i = n % 10;
            n = n / 10;

            if (max < i) {
            max = i;}

            if (min > i) {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);

        //task 3
        int g = 134835784;

        while (g != 0) {
            int i = g % 10;
            g = g / 10;

            int temp = g;

            while (temp != 0) {
                int i2 = temp % 10;
                temp = temp / 10;

                if (i == i2) {
                    System.out.println(true);
                }
            }
        }

    }
}