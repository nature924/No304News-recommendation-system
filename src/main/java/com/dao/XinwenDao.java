package com.dao;

import com.entity.XinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenVO;
import com.entity.view.XinwenView;


/**
 * 新闻
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
public interface XinwenDao extends BaseMapper<XinwenEntity> {
	
	List<XinwenVO> selectListVO(@Param("ew") Wrapper<XinwenEntity> wrapper);
	
	XinwenVO selectVO(@Param("ew") Wrapper<XinwenEntity> wrapper);
	
	List<XinwenView> selectListView(@Param("ew") Wrapper<XinwenEntity> wrapper);

	List<XinwenView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenEntity> wrapper);
	
	XinwenView selectView(@Param("ew") Wrapper<XinwenEntity> wrapper);
	
}
