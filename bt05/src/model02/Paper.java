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

    public class Paper extends ThuVien {

    private int taiBan;

    public Paper(int taiBan, String maTaiLieu, String tenTaiLieu, String nhaXuatBan) {
        super(maTaiLieu, tenTaiLieu, nhaXuatBan);
        this.taiBan = taiBan;
    }

    public int getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }

    @Override
    public String toString() {
        return "Paper: " + tenTaiLieu + " - Ma tai lieu: " + maTaiLieu + " - Nha xuat ban: " + nhaXuatBan + " - Tai ban: " + taiBan;
    }

}

