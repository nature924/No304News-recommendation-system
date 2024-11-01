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


import com.dao.DiscussxinwenDao;
import com.entity.DiscussxinwenEntity;
import com.service.DiscussxinwenService;
import com.entity.vo.DiscussxinwenVO;
import com.entity.view.DiscussxinwenView;

@Service("discussxinwenService")
public class DiscussxinwenServiceImpl extends ServiceImpl<DiscussxinwenDao, DiscussxinwenEntity> implements DiscussxinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinwenEntity> page = this.selectPage(
                new Query<DiscussxinwenEntity>(params).getPage(),
                new EntityWrapper<DiscussxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinwenEntity> wrapper) {
		  Page<DiscussxinwenView> page =new Query<DiscussxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinwenVO> selectListVO(Wrapper<DiscussxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinwenVO selectVO(Wrapper<DiscussxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinwenView> selectListView(Wrapper<DiscussxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinwenView selectView(Wrapper<DiscussxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
