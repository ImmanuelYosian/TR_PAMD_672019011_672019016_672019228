package com.example.tr_672019011_672019016_672019228;

public class DataPesan {
    private String nama_alat;
    private String waktu;

    public DataPesan(String nama_alat, String waktu) {
        this.nama_alat = nama_alat;
        this.waktu = waktu;
    }

    public String getNama_alat() {
        return nama_alat;
    }

    public void setNama_alat(String nama_alat) {
        this.nama_alat = nama_alat;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
