package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenView;


/**
 * 新闻
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
public interface XinwenService extends IService<XinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenVO> selectListVO(Wrapper<XinwenEntity> wrapper);
   	
   	XinwenVO selectVO(@Param("ew") Wrapper<XinwenEntity> wrapper);
   	
   	List<XinwenView> selectListView(Wrapper<XinwenEntity> wrapper);
   	
   	XinwenView selectView(@Param("ew") Wrapper<XinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenEntity> wrapper);
   	
}

