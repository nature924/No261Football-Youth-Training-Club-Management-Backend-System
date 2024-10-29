package com.entity.vo;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 06:54:13
 */
public class KechengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程名
	 */
	
	private String kechengming;
				
	
	/**
	 * 设置：课程名
	 */
	 
	public void setKechengming(String kechengming) {
		this.kechengming = kechengming;
	}
	
	/**
	 * 获取：课程名
	 */
	public String getKechengming() {
		return kechengming;
	}
			
}
