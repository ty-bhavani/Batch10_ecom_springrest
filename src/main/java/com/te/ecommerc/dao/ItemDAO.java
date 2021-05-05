package com.te.ecommerc.dao;

import java.util.List;

import com.te.ecommerc.bean.ItemInfoBean;

public interface ItemDAO {

	
	public ItemInfoBean getitemData(int id);

	public boolean addItem(ItemInfoBean infoBean);

	public boolean updateItem(ItemInfoBean infoBean);

	public boolean deleteItem(int id);
	
}


