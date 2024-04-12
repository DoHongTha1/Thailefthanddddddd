package com.example.thailefthanddddddd;

public class NhanVien {
    private String manv;
    private String hoten;
    private int tuoi;
    private String sdt;
    private String mail;

    public NhanVien(String manv, String hoten, int tuoi, String sdt, String mail) {
        this.manv = manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.mail = mail;
    }
    public String getManv(){
        return this.manv;
    }
    public String getHoten() {
        return hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public String getMail() {
        return mail;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }


    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
