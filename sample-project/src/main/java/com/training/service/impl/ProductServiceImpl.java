package com.training.service.impl;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.common.util.FileHelper;
import com.training.dao.IBrandDao;
import com.training.dao.IProductDao;
import com.training.entity.BrandEntity;
import com.training.entity.ProductEntity;
import com.training.model.ResponseDataModel;
import com.training.service.IProductService;

@Service
@Transactional
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	IProductDao productDao;
	
	@Override
	public List<ProductEntity> getAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

//	@Override
//	public ResponseDataModel delete(Long brandId) {
//		ProductEntity productEntity = productDao.findByProductId(brandId);
//		if (productEntity != null) {
//			productDao.deleteById(brandId);
//			productDao.flush();
//
//			try {
//				// Remove logo of brand from store folder
//				FileHelper.deleteFile;
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return null;
	}


