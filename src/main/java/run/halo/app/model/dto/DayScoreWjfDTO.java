package run.halo.app.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program halo
 * @description: DayScoreWjf的DTO
 * @author: wangjianfeng
 * @create: 2020/04/06 22:40
 */
@Data
public class DayScoreWjfDTO implements Serializable {
	private Integer id;

	private Integer targetWjfId;

	private Integer targetWjfIdC;

	private Float score;

	private String mark;

	private Date updateTime;

	private Date createTime;
}
