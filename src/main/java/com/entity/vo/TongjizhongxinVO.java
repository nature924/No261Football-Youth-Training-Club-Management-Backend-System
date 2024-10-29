package com.entity.vo;

import com.entity.TongjizhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 统计中心
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 06:54:13
 */
public class TongjizhongxinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 统计数量
	 */
	
	private Integer tongjishuliang;
				
	
	/**
	 * 设置：统计数量
	 */
	 
	public void setTongjishuliang(Integer tongjishuliang) {
		this.tongjishuliang = tongjishuliang;
	}
	
	/**
	 * 获取：统计数量
	 */
	public Integer getTongjishuliang() {
		return tongjishuliang;
	}
			
}
