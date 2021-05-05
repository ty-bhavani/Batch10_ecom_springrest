package com.te.ecommerc.bean;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

    @Entity
	@Table(name = "admin-info")
    @XmlRootElement(name = "item-info")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonRootName("item_info")
	public class ItemInfoBean  implements Serializable{

		@Id
		@Column(name = "id")
		private Integer id;
		
		@Column
		private String name;
		

		@Column
		private String quantity;
		
		private double price;
		
		@JsonProperty("admin_info")
		@XmlElement(name = "admin-info")
		private ItemInfoBean admin;
		
		
		private List<ItemInfoBean> admininfo;


		public ItemInfoBean getAdmin() {
			return admin;
		}

		public void setAdmin(ItemInfoBean admin) {
			this.admin = admin;
		}

		public List<ItemInfoBean> getAdmininfo() {
			return admininfo;
		}

		public void setAdmininfo(List<ItemInfoBean> admininfo) {
			this.admininfo = admininfo;
		}

		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getId() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setId(Integer id) {
			this.id = id;
		}

}




