package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ShippingDao;
import com.example.demo.entity.Shipping;
import com.example.demo.exception.ShippingException;


@Transactional
@Service
public class ShipppingServiceImpl implements ShippingService {

	@Autowired
	ShippingDao shippingDao;

	

	@Override
	public List<Shipping> showallshipping() {
		return shippingDao.findAll();
	}

	 @Override
		public String updateShipping(Shipping shipping) {
			
				Optional<Shipping> findById = shippingDao.findById(shipping.getShippingId());
				
				if (findById.isPresent()) {
					shippingDao.save(shipping);
					return "Shipping updated";
				} else {
					throw new ShippingException("Shipping ID not Present!!!!!!!");
				}
			
			 
		}
	

}
