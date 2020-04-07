package run.halo.app.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program halo
 * @description: DiaryTempWjf
 * @author: wangjianfeng
 * @create: 2020/04/07 07:49
 */
@Data
public class DiaryTempWjfDTO implements Serializable {

	private Integer id;
	private String targetWjfIds;
	private Byte enable;
	private Date updateTime;
	private Date createTime;
}
