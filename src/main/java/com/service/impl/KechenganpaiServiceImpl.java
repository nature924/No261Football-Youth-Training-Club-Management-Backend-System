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


import com.dao.KechenganpaiDao;
import com.entity.KechenganpaiEntity;
import com.service.KechenganpaiService;
import com.entity.vo.KechenganpaiVO;
import com.entity.view.KechenganpaiView;

@Service("kechenganpaiService")
public class KechenganpaiServiceImpl extends ServiceImpl<KechenganpaiDao, KechenganpaiEntity> implements KechenganpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechenganpaiEntity> page = this.selectPage(
                new Query<KechenganpaiEntity>(params).getPage(),
                new EntityWrapper<KechenganpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechenganpaiEntity> wrapper) {
		  Page<KechenganpaiView> page =new Query<KechenganpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechenganpaiVO> selectListVO(Wrapper<KechenganpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechenganpaiVO selectVO(Wrapper<KechenganpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechenganpaiView> selectListView(Wrapper<KechenganpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechenganpaiView selectView(Wrapper<KechenganpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
