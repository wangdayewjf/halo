package run.halo.app.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program halo
 * @description: TargetWjf
 * @author: wangjianfeng
 * @create: 2020/04/07 07:53
 */
@Data
public class TargetWjfDTO implements Serializable {

	private Integer id;
	private Integer parentId;
	private Byte targetLevel;
	private Integer costTime;
	private Integer repeatNumber;
	private Float score;
	private String targetName;
	private Byte targetStatus;
	private Date updateTime;
	private Date createTime;
}
