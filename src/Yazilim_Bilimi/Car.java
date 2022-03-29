package Yazilim_Bilimi;

public class Car {
    private String color;
    private String model;
    private double engine;
    private int doors;

    public Car(String color, String model, double engine, int doors) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;

    }

    public void showInfos() {
        System.out.println("Mashinin rengi: " + this.color);
        System.out.println("Mashinin modeli: " + this.model);
        System.out.println("Mashinin muherrik hecmi: " + this.engine);
        System.out.println("Mashinin qapi sayi: " + this.doors);
    }
}


    /*public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }                                            //BU COMMENTƏ ALDIĞIM HİSSƏ "MAİN_CAR" CLASSINA AİDDİ. ÇÜNKİ,ORDA HƏLƏ
    public void setModel(String model) {         //CONSTRACOR YARATMAMIŞDIM.COSTRACTOR YARATDIQDAN SONRA BU HİSSƏYƏ EHTİYYAC YOXDUR..
        this.model = model;
    }
    public double getEngine() {
        return engine;
    }
    public void setEngine(double engine) {
        this.engine = engine;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Mashinin gapi sayi sadece 2 ve 4 ola biler..");

        }
    }*/


