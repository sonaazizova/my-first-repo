package Practice;

import javax.management.openmbean.SimpleType;
import java.util.Scanner;

public class mesele1 {
    public static void main(String[] args) {

        System.out.println("Edidi daxil edin: ");
        int a;
        Scanner sc = new Scanner(System.in);

        a= sc.nextInt();

        if(a>0){
            System.out.println("Eded musbetdir");
        }
        else if(a<0){
            System.out.println("Eded menfidir");
        }
        else{
            System.out.println("0 neytral reqemdir");
        }



    }
}
