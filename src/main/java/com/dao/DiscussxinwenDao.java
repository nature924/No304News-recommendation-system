package com.dao;

import com.entity.DiscussxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinwenVO;
import com.entity.view.DiscussxinwenView;


/**
 * 新闻评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
public interface DiscussxinwenDao extends BaseMapper<DiscussxinwenEntity> {
	
	List<DiscussxinwenVO> selectListVO(@Param("ew") Wrapper<DiscussxinwenEntity> wrapper);
	
	DiscussxinwenVO selectVO(@Param("ew") Wrapper<DiscussxinwenEntity> wrapper);
	
	List<DiscussxinwenView> selectListView(@Param("ew") Wrapper<DiscussxinwenEntity> wrapper);

	List<DiscussxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinwenEntity> wrapper);
	
	DiscussxinwenView selectView(@Param("ew") Wrapper<DiscussxinwenEntity> wrapper);
	
}
