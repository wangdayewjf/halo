package run.halo.app.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @program halo
 * @description: diary_temp_wjf
 * @author: wangjianfeng
 * @create: 2020/04/06 22:28
 */

@Data
@Entity
@Table(name = "diary_temp_wjf")
@EqualsAndHashCode(callSuper = true)
public class DiaryTempWjf extends BaseEntity{
	/**
	 * CREATE TABLE `diary_temp_wjf` (
	 *   `id` int(11) NOT NULL COMMENT '主键',
	 *   `target_wjf_ids` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '目标值的id串',
	 *   `enable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否生效',
	 *   `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	 *   `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
	 *   PRIMARY KEY (`id`)
	 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
	 */

	@Id
	private Integer id;
	private String targetWjfIds;
	private Byte enable;
	private Date updateTime;
	private Date createTime;
}
