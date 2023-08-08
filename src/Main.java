import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File file=new File("massiv.txt");
            Scanner scanner=new Scanner(file);
            int n=scanner.nextInt();
            double[] nMassive=new double[n];
            for (int i = 0; i < nMassive.length; i++) {
                nMassive[i]=scanner.nextDouble();
            }
            Arrays.sort(nMassive);
            System.out.println(Arrays.toString(nMassive));

            if ((nMassive.length%2)==0) {
               System.out.println(((nMassive[nMassive.length/2]+nMassive[nMassive.length/2-1])/2));
           }else {
                System.out.println(nMassive[nMassive.length/2]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("error :(");
        }
    }
}
