package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusspaixingbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusspaixingbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusspaixingbangView;


/**
 * 排行榜评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
public interface DiscusspaixingbangService extends IService<DiscusspaixingbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusspaixingbangVO> selectListVO(Wrapper<DiscusspaixingbangEntity> wrapper);
   	
   	DiscusspaixingbangVO selectVO(@Param("ew") Wrapper<DiscusspaixingbangEntity> wrapper);
   	
   	List<DiscusspaixingbangView> selectListView(Wrapper<DiscusspaixingbangEntity> wrapper);
   	
   	DiscusspaixingbangView selectView(@Param("ew") Wrapper<DiscusspaixingbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusspaixingbangEntity> wrapper);
   	
}

