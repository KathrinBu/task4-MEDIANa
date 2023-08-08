import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name="massiv.txt";
        try {
            Scanner scanner=new Scanner(new File(name));
            ArrayList<String> arrayList=new ArrayList<>();
            String[] massive;
            while (scanner.hasNextLine()){
                arrayList.add(scanner.nextLine());
            } massive=arrayList.get(1).split(" ");

            double[] nMassive=new double[massive.length];
            for (int i = 0; i < nMassive.length; i++) {
                nMassive[i]=Double.valueOf(massive[i]);
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
