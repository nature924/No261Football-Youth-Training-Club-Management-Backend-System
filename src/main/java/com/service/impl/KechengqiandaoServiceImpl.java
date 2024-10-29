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


import com.dao.KechengqiandaoDao;
import com.entity.KechengqiandaoEntity;
import com.service.KechengqiandaoService;
import com.entity.vo.KechengqiandaoVO;
import com.entity.view.KechengqiandaoView;

@Service("kechengqiandaoService")
public class KechengqiandaoServiceImpl extends ServiceImpl<KechengqiandaoDao, KechengqiandaoEntity> implements KechengqiandaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengqiandaoEntity> page = this.selectPage(
                new Query<KechengqiandaoEntity>(params).getPage(),
                new EntityWrapper<KechengqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengqiandaoEntity> wrapper) {
		  Page<KechengqiandaoView> page =new Query<KechengqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengqiandaoVO> selectListVO(Wrapper<KechengqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengqiandaoVO selectVO(Wrapper<KechengqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengqiandaoView> selectListView(Wrapper<KechengqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengqiandaoView selectView(Wrapper<KechengqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
