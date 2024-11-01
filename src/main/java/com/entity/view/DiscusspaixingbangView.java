package com.entity.view;

import com.entity.DiscusspaixingbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 排行榜评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
@TableName("discusspaixingbang")
public class DiscusspaixingbangView  extends DiscusspaixingbangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusspaixingbangView(){
	}
 
 	public DiscusspaixingbangView(DiscusspaixingbangEntity discusspaixingbangEntity){
 	try {
			BeanUtils.copyProperties(this, discusspaixingbangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
