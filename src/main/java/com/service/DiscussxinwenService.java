package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinwenView;


/**
 * 新闻评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
public interface DiscussxinwenService extends IService<DiscussxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinwenVO> selectListVO(Wrapper<DiscussxinwenEntity> wrapper);
   	
   	DiscussxinwenVO selectVO(@Param("ew") Wrapper<DiscussxinwenEntity> wrapper);
   	
   	List<DiscussxinwenView> selectListView(Wrapper<DiscussxinwenEntity> wrapper);
   	
   	DiscussxinwenView selectView(@Param("ew") Wrapper<DiscussxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinwenEntity> wrapper);
   	
}

