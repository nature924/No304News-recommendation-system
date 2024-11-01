package com.dao;

import com.entity.PaixingbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaixingbangVO;
import com.entity.view.PaixingbangView;


/**
 * 排行榜
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
public interface PaixingbangDao extends BaseMapper<PaixingbangEntity> {
	
	List<PaixingbangVO> selectListVO(@Param("ew") Wrapper<PaixingbangEntity> wrapper);
	
	PaixingbangVO selectVO(@Param("ew") Wrapper<PaixingbangEntity> wrapper);
	
	List<PaixingbangView> selectListView(@Param("ew") Wrapper<PaixingbangEntity> wrapper);

	List<PaixingbangView> selectListView(Pagination page,@Param("ew") Wrapper<PaixingbangEntity> wrapper);
	
	PaixingbangView selectView(@Param("ew") Wrapper<PaixingbangEntity> wrapper);
	
}
