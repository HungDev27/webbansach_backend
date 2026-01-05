package com.hung.webbansach_backend.entity;

import lombok.Data;

@Data
public class ChiTietDonHang {

    private long maChiTietDonHang;

    private int soLuong;

    private double giaBan;

    private Sach sach;

    private DonHang donHang;
}
