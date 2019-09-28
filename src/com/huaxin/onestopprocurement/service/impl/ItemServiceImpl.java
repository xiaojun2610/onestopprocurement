package com.huaxin.onestopprocurement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.huaxin.onestopprocurement.mapper.ItemCustomMapper;
import com.huaxin.onestopprocurement.mapper.ItemclassesMapper;
import com.huaxin.onestopprocurement.po.Item;
import com.huaxin.onestopprocurement.po.ItemCustom;
import com.huaxin.onestopprocurement.po.ItemQueryVo;
import com.huaxin.onestopprocurement.po.Itemclasses;
import com.huaxin.onestopprocurement.service.ItemService;

public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemCustomMapper itemCustomMapper;
	
	@Autowired
	private ItemclassesMapper itemclassesMapper;
	  
	@Override
	public boolean addItem(Item item) throws Exception {
		boolean flag = false;
		
		int f = itemCustomMapper.insertSelective(item);
		if(f>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean IsItemNameExist(String itemName) throws Exception {
	   boolean  flag = false;
		String[] itemNames=itemCustomMapper.queryAllItemnames().toArray(new String[]{});
		for(int i=0;i<itemNames.length;i++){
			if(itemNames[i].equals(itemName)){
				System.out.println("商品同名");
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public List<ItemCustom> queryAllItems(ItemQueryVo itemQueryVo) throws Exception {
		List<ItemCustom> itemlist=  itemCustomMapper.selectItemsByCritera( itemQueryVo);
	   for(ItemCustom  itemCustom:itemlist){
		   itemCustom.setClassName(itemCustom.getItemClass());
	   }
		return itemlist;
	}

	@Override
	public List<Itemclasses> queryItemclasses() throws Exception {
		List<Itemclasses> itemclasses = itemclassesMapper.selectAllItemclasses();
		return itemclasses;
	}

	@Override
	public boolean deleteItem(int id) throws Exception {
		boolean flag = false;
		 int f = itemCustomMapper.deleteByPrimaryKey(id);
		 if(f>0){
			 flag = true;
		 }
		return flag;
	}

	@Override
	public ItemCustom queryItemById(int id) throws Exception {
		ItemCustom itemCustom  = itemCustomMapper.selectByPrimaryKey(id);
		return itemCustom;
	}
	
	@Override
	public boolean updateItem(ItemCustom itemCustom) throws Exception {
		boolean flag = false;
		int f = itemCustomMapper.updateByPrimaryKeySelective(itemCustom);
		if(f>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public List<ItemCustom> queryItemsByCriteria(ItemQueryVo itemQueryVo) throws Exception {
		List<ItemCustom> itemlist =  itemCustomMapper.selectItemsByCritera(itemQueryVo);
		for(ItemCustom  itemCustom:itemlist){
			   itemCustom.setClassName(itemCustom.getItemClass());
		  }
	    return itemlist;
	}
	
	public int queryItemCount(ItemQueryVo itemQueryVo) throws Exception{
		int itemcount = itemCustomMapper.queryItemCount(itemQueryVo);
		return itemcount;
	}

}
