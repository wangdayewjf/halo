package run.halo.app.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program halo
 * @description: DiaryItemWjf
 * @author: wangjianfeng
 * @create: 2020/04/07 07:48
 */
@Data
public class DiaryItemWjfDTO implements Serializable {

	private Integer id;
	private Integer diaryTempWjfId;
	private String dayScoreWjfIds;
	private String diaryTxt;
	private Byte isUpdate;
	private Date updateTime;
	private Date createTime;
}
