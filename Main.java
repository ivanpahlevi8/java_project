package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import com.company.Performer;
import com.coba.Gender;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        Scanner input = new Scanner(System.in);
        Gender my_gender = null;
        Performer my_performer = new Performer("Ivan", "Indirsyah", 20, 1.75F, my_gender );
        my_performer.set_acting_school("SMAN");
        System.out.printf("Hasil : %s \n", my_performer.get_acting_school());
        System.out.printf("Sisa : %d \n", my_performer.get_time_to_live());
        System.out.printf("Tinggi Badan : %f \n", my_performer.getHeight());
        List<String> data = new ArrayList<>();

    }
}
