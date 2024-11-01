package com.entity.view;

import com.entity.XinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
@TableName("xinwen")
public class XinwenView  extends XinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwenView(){
	}
 
 	public XinwenView(XinwenEntity xinwenEntity){
 	try {
			BeanUtils.copyProperties(this, xinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
