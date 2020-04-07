package run.halo.app.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @program halo
 * @description: diary_item_wjf
 * @author: wangjianfeng
 * @create: 2020/04/06 22:25
 */

@Data
@Entity
@Table(name = "diary_item_wjf")
@EqualsAndHashCode(callSuper = true)
public class DiaryItemWjf extends BaseEntity{
	/**
	 * CREATE TABLE `diary_item_wjf` (
	 *   `id` int(11) NOT NULL COMMENT '主键',
	 *   `diary_temp_wjf_id` int(11) NOT NULL COMMENT '模板id',
	 *   `day_score_wjf_ids` varchar(0) COLLATE utf8_bin NOT NULL COMMENT '模板id',
	 *   `diary_txt` varchar(255) COLLATE utf8_bin DEFAULT '' COMMENT '每日日记',
	 *   `is_update` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否手动更新',
	 *   `update_time` datetime NOT NULL COMMENT '更新时间',
	 *   `create_time` datetime NOT NULL COMMENT '新增时间',
	 *   PRIMARY KEY (`id`)
	 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
	 */

	@Id
	private Integer id;
	private Integer diaryTempWjfId;
	private String dayScoreWjfIds;
	private String diaryTxt;
	private Byte isUpdate;
	private Date updateTime;
	private Date createTime;
}
