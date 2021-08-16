package com.dicoding.javafundamental.basic; // kode package

import com.dicoding.javafundamental.basic.musik.Gitar;
import com.dicoding.javafundamental.basic.kendaraan.*;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

// penggunaan wildcard kurang disarankan untuk package yang memiliki member yang
// banyal

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gitar.bunyi();
        Kereta.jumlahBan();
        Mobil.jumlahBan();
        Motor.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tommorow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tommorow);

    }
}
