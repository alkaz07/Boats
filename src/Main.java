import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String fname = "input.txt";
        int n;
        int d;
        int[] massiv;
        //открыть файл, прочитать оттуда n, d
        Scanner scanner = new Scanner(new File(fname));
        n = scanner.nextInt();
        d = scanner.nextInt();
        massiv = new int[n];
        //прочитать из файла
        //n чисел и записать их в массив massiv
        //scanner.nextLine();
        //String str = scanner.nextLine();
        //scanner = new Scanner(str);
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
        }

        //вычислить количество лодок
        int counter = 0, n_heavy, n_light;
        Arrays.sort(massiv);

        for (n_heavy = n-1, n_light=0 ;n_heavy > n_light; counter++,  n_heavy--){
        //while (n_heavy > n_light) {
            if (massiv[n_heavy] + massiv[n_light] <= d) {
                n_light++;
            }
            //counter++;
            //n_heavy--;
        }
        if (n_heavy == n_light)
            counter++;


        /*
        n_heavy=n-1;
        n_light=0;
        counter=0;

        for (int j = 0; j < n; j++) {
            while (massiv[n_heavy] + massiv[n_light] <= d) {
                n_heavy--;
                n_light++;
                counter++;
            }
            //if (massiv[n_heavy] + massiv[n_light] > d) {
                System.out.println(counter);
            //}
            n_heavy--;
            counter++;
            if(n_heavy < n_light)
                break;
        }*/

            //вывести это количество в файл "output.txt"
        //System.out.println(counter);
        String fOutName = "output.txt";
        FileWriter fw = new FileWriter(new File(fOutName));
        fw.write(Integer.toString(counter));
        fw.close();
    }
}
