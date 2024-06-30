/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model02;

/**
 *
 * @author luanq
 */
public class ThuVien {

    protected String maTaiLieu, tenTaiLieu, nhaXuatBan;

    public ThuVien(String maTaiLieu, String tenTaiLieu, String nhaXuatBan) {
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return "ThuVien{" + "maTaiLieu=" + maTaiLieu + ", tenTaiLieu=" + tenTaiLieu + ", nhaXuatBan=" + nhaXuatBan + '}';
    }

}

