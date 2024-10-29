package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechenganpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechenganpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechenganpaiView;


/**
 * 课程安排
 *
 * @author 
 * @email 
 * @date 2021-04-14 06:54:13
 */
public interface KechenganpaiService extends IService<KechenganpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechenganpaiVO> selectListVO(Wrapper<KechenganpaiEntity> wrapper);
   	
   	KechenganpaiVO selectVO(@Param("ew") Wrapper<KechenganpaiEntity> wrapper);
   	
   	List<KechenganpaiView> selectListView(Wrapper<KechenganpaiEntity> wrapper);
   	
   	KechenganpaiView selectView(@Param("ew") Wrapper<KechenganpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechenganpaiEntity> wrapper);
   	
}

