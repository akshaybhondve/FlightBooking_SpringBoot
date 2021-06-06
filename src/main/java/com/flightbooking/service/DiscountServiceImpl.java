package com.flightbooking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.dao.DiscountDao;
import com.flightbooking.model.Discount;

@Service
@Transactional
public class DiscountServiceImpl implements DiscountService{

	@Autowired
    private DiscountDao discountDao;  
      
    @Override  
    public Discount saveDiscount(Discount airline) {  
        return discountDao.save(airline);  
    }  
  
    @Override  
    public List<Discount> getDiscounts() {  
        return discountDao.findAll();  
    }  
}
