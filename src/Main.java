import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String fname = "input.txt";
        int n;
        int d;
        int[] massiv;
        //������� ����, ��������� ������ n, d
        Scanner scanner = new Scanner(new File(fname));
        n = scanner.nextInt();
        d = scanner.nextInt();
        massiv = new int[n];
        //��������� �� �����
        //n ����� � �������� �� � ������ massiv
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
        }

        //��������� ���������� �����
        int counter = 0;
        Arrays.sort(massiv);
        int n_heavy = n - 1;
        int n_light = 0;
        while (n_heavy > n_light) {
            if (massiv[n_heavy] + massiv[n_light] <= d) {
                n_light++;
            }
            counter++;
            n_heavy--;
        }
        if (n_heavy == n_light)
            counter++;
            //������� ��� ���������� � ���� "output.txt"
            System.out.println(counter);
    }
}
