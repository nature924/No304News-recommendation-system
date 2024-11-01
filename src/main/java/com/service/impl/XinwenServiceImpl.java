package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinwenDao;
import com.entity.XinwenEntity;
import com.service.XinwenService;
import com.entity.vo.XinwenVO;
import com.entity.view.XinwenView;

@Service("xinwenService")
public class XinwenServiceImpl extends ServiceImpl<XinwenDao, XinwenEntity> implements XinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenEntity> page = this.selectPage(
                new Query<XinwenEntity>(params).getPage(),
                new EntityWrapper<XinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenEntity> wrapper) {
		  Page<XinwenView> page =new Query<XinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenVO> selectListVO(Wrapper<XinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenVO selectVO(Wrapper<XinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenView> selectListView(Wrapper<XinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenView selectView(Wrapper<XinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
