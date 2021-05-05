package com.te.ecommerc.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.te.ecommerc.bean.ItemInfoBean;

import com.te.ecommerc.dao.ItemDAOImpl;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDAOImpl ItemDAO;

	public ItemInfoBean getitemData(int id) {
		
		return  ItemDAO.getitemData(id);
	}

	

	public boolean addItem(ItemInfoBean infoBean) {
		
		return ItemDAO.addItem(infoBean);
	}


	public boolean updateItem(ItemInfoBean infoBean) {
		
		return ItemDAO.updateItem(infoBean);
	}

	public boolean deleteItem(int id) {
		
		return ItemDAO.deleteItem(id);
	}

}
