package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Shipping;

public interface ShippingDao extends JpaRepository<Shipping, Integer> {

}
