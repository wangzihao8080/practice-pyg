package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口（返回列表）
 * @author King
 *
 */
public interface BrandService {
	public List<TbBrand> findAll();
	
	/**
	 * 品牌分页
	 * @param pageNum  当前大小
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
}
