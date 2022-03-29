package OCA8;

public class Lesson9 {
    public static void main(String[] args) {

        String a = "Hello";

        int i = 0;

        while (a.length() > i){

            System.out.println(a.charAt(i++));
        }
    }
}
class For{
    public static void main(String[] args) {

        String a = "Hello";

        for(int i=0; i<0 ;i++){
            System.out.println("Hello");
        }
    }
}

class good{
    public static void main(String[] args) {
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println(x);

    }
}
