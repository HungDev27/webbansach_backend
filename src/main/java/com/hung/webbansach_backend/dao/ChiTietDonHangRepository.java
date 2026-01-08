package com.hung.webbansach_backend.dao;

import com.hung.webbansach_backend.entity.ChiTietDonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang,Long> {
}
