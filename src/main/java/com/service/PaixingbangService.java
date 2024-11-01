package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaixingbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaixingbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaixingbangView;


/**
 * 排行榜
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:56:20
 */
public interface PaixingbangService extends IService<PaixingbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaixingbangVO> selectListVO(Wrapper<PaixingbangEntity> wrapper);
   	
   	PaixingbangVO selectVO(@Param("ew") Wrapper<PaixingbangEntity> wrapper);
   	
   	List<PaixingbangView> selectListView(Wrapper<PaixingbangEntity> wrapper);
   	
   	PaixingbangView selectView(@Param("ew") Wrapper<PaixingbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaixingbangEntity> wrapper);
   	
}

