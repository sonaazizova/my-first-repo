package Yazilim_Bilimi;

public class Ders24 {
    public static void main(String[] args) {

        int [][] arr = {{1,2,3,} , {4,5,6}};

        int [][] arr2 = new int[2][3];
        arr2 [0][0] = 10;
        arr2 [0][1] = 20;
        arr2 [0][2] = 30;
        arr2 [1][0] = 40;
        arr2 [1][1] = 50;
        arr2 [1][2] = 60;

        for(int i = 0; i<2;i++){
            for(int j = 0; j<3; j++){
                System.out.println("Element: " + arr2[i][j]);
            }
        }
    }
}
