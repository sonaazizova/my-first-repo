package Yazilim_Bilimi;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ATM_practice {
    public static int FindFaktorial(int value) {
        int faktorial = 1;
        for (int i = 1; i <= value; i++) {
            faktorial *= i;

        }
        return faktorial;

    }
}

