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
public class Book extends ThuVien {

    private int soTrang;

    public Book(int soTrang, String maTaiLieu, String tenTaiLieu, String nhaXuatBan) {
        super(maTaiLieu, tenTaiLieu, nhaXuatBan);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Book: " + tenTaiLieu + " - Ma tai lieu: " + maTaiLieu + " - Nha xuat ban: " + nhaXuatBan + " - So trang: " + soTrang;
    }
}
