package com.hung.webbansach_backend.entity;

import lombok.Data;

import java.util.List;

@Data
public class Sach {

    private int maSach;

    private String tenSach;

    private String tacGia;

    private String mota;

    private String ISBN;

    private String moTa;

    private double giaNuemYet;

    private double giaBan;

    private int soLuong;

    private double trungBinhXepHang; //xếp hạng đánh giá sao cho sách

    private List<TheLoai> dachSachTheLoai;

    private List<HinhAnh> dachSachHinhAnh;

    List<SuDanhGia> danhSachSuDanhGia;

    List<ChiTietDonHang> danhSachChiTietDonHang;

    List<SachYeuThich> danhSachSachYeuThich;

}
