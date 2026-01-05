package com.hung.webbansach_backend.entity;

import lombok.Data;

import java.util.List;

@Data
public class SuDanhGia {

    private long maSuDanhGia;

    private float diemXepHang;

    private String nhanXet;

    private Sach sach;

    private List<NguoiDung> sachSachNguoiDung;

}
