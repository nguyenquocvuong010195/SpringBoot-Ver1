package com.training.service;


import com.training.entity.ProductEntity;
import com.training.model.ResponseDataModel;

public interface IProductService {
	
	Iterable<ProductEntity> getAll();
	
//	ResponseDataModel delete(Long brandId);
}
