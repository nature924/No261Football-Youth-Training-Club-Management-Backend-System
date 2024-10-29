package com.entity.view;

import com.entity.TongjizhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 统计中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 06:54:13
 */
@TableName("tongjizhongxin")
public class TongjizhongxinView  extends TongjizhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongjizhongxinView(){
	}
 
 	public TongjizhongxinView(TongjizhongxinEntity tongjizhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, tongjizhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
