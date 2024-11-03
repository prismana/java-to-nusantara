package com.pbo.gui.data;

import java.util.HashMap;
import java.util.Map;

public class Price {

    // buat map untuk menampung harga masing-masing item
    public Map<String, Integer> maskapaiMapContent() {
        Map<String, Integer> MaskapaiMap = new HashMap<>();

        MaskapaiMap.put("Garuda Indonesia", 200000);
        MaskapaiMap.put("Lion Air", 175000);
        MaskapaiMap.put("Air Asia", 150000);
        MaskapaiMap.put("Citilink", 125000);

        return MaskapaiMap;
    }

    public Map<String, Integer> tujuanMapContent() {
        Map<String, Integer> tujuanMap = new HashMap<>();

        tujuanMap.put("Kalimantan", 2650000);
        tujuanMap.put("Sumatra", 2750000);
        tujuanMap.put("Maluku", 3750000);
        tujuanMap.put("Sulawesi", 3550000);
        tujuanMap.put("Bali", 755000);
        tujuanMap.put("Papua", 4550000);

        return tujuanMap;
    }

    public Map<String, Integer> KeberangkatanMapContent() {
        Map<String, Integer> keberangkatanMap = new HashMap<>();

        keberangkatanMap.put("Adi-Sumarmo", 100000);
        keberangkatanMap.put("Soekarno-Hatta", 250000);
        keberangkatanMap.put("Juanda", 150000);

        return keberangkatanMap;
    }

    public Map<String, Integer> KelasMapContent() {
        Map<String, Integer> kelasMap = new HashMap<>();

        kelasMap.put("Ekonomi", 100000);
        kelasMap.put("Ekonomi Premium", 250000);
        kelasMap.put("Bisnis", 750000);
        kelasMap.put("First", 1150000);

        return kelasMap;
    }
}