/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model01;

/**
 *
 * @author luanq
 */
public class HocSinh extends DoiTuong {

    private String lop, ban;

    public HocSinh(String lop, String ban, String maDoiTuong, String tenDoiTuong, String namSinh, boolean gioiTinh) {
        super(maDoiTuong, tenDoiTuong, namSinh, gioiTinh);
        this.lop = lop;
        this.ban = ban;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "Hoc sinh: " + tenDoiTuong + " - Ma hoc sinh: " + maDoiTuong + " - Gioi tinh: " + printGioiTinh() + " - Nam sinh: " + namSinh + " - Lop: " + lop + " - Ban: " + ban;
    }

}