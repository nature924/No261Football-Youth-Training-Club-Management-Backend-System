package com.entity.model;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 06:54:13
 */
public class KechengxinxiModel  implements Serializable {
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
