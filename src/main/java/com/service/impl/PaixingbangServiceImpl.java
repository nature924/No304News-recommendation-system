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


import com.dao.PaixingbangDao;
import com.entity.PaixingbangEntity;
import com.service.PaixingbangService;
import com.entity.vo.PaixingbangVO;
import com.entity.view.PaixingbangView;

@Service("paixingbangService")
public class PaixingbangServiceImpl extends ServiceImpl<PaixingbangDao, PaixingbangEntity> implements PaixingbangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaixingbangEntity> page = this.selectPage(
                new Query<PaixingbangEntity>(params).getPage(),
                new EntityWrapper<PaixingbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaixingbangEntity> wrapper) {
		  Page<PaixingbangView> page =new Query<PaixingbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaixingbangVO> selectListVO(Wrapper<PaixingbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaixingbangVO selectVO(Wrapper<PaixingbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaixingbangView> selectListView(Wrapper<PaixingbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaixingbangView selectView(Wrapper<PaixingbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
