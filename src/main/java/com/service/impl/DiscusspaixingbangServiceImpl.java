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


import com.dao.DiscusspaixingbangDao;
import com.entity.DiscusspaixingbangEntity;
import com.service.DiscusspaixingbangService;
import com.entity.vo.DiscusspaixingbangVO;
import com.entity.view.DiscusspaixingbangView;

@Service("discusspaixingbangService")
public class DiscusspaixingbangServiceImpl extends ServiceImpl<DiscusspaixingbangDao, DiscusspaixingbangEntity> implements DiscusspaixingbangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusspaixingbangEntity> page = this.selectPage(
                new Query<DiscusspaixingbangEntity>(params).getPage(),
                new EntityWrapper<DiscusspaixingbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusspaixingbangEntity> wrapper) {
		  Page<DiscusspaixingbangView> page =new Query<DiscusspaixingbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusspaixingbangVO> selectListVO(Wrapper<DiscusspaixingbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusspaixingbangVO selectVO(Wrapper<DiscusspaixingbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusspaixingbangView> selectListView(Wrapper<DiscusspaixingbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusspaixingbangView selectView(Wrapper<DiscusspaixingbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
