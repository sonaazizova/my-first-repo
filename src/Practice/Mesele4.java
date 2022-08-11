package Practice;

import java.util.Scanner;

public class Mesele4 {
    public static void main(String[] args) {

        int hefte;
        System.out.print("gunu daxil edin:");
        Scanner cixart = new Scanner(System.in);

        hefte = cixart.nextInt();

        switch (hefte){

            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("cershenbe axshami");
                break;
            case 3:
                System.out.println("Chershenbe");
                break;
            case 4:
                System.out.println("Cume axshami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Shenbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("heftende yalniz 7 gun var");
                break;
        }
    }
}
