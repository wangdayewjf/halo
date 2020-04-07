package run.halo.app.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @program halo
 * @description: target_wjf
 * @author: wangjianfeng
 * @create: 2020/04/06 22:18
 */


@Data
@Entity
@Table(name = "target_wjf")
@EqualsAndHashCode(callSuper = true)
public class TargetWjf extends BaseEntity{
	/**
	 * `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	 *   `parent_id` int(10) unsigned zerofill NOT NULL COMMENT '父id',
	 *   `target_level` tinyint(2) NOT NULL COMMENT '目标层级\n0，1，2，3',
	 *   `cost_time` int(11) NOT NULL DEFAULT '0' COMMENT '花费时间，小时',
	 *   `repeat_number` int(11) NOT NULL DEFAULT '0' COMMENT '需重复执行次数',
	 *   `score` int(10) unsigned zerofill NOT NULL COMMENT '分数',
	 *   `target_name` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '目标名字',
	 *   `target_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '目标状态',
	 *   `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
	 *   `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
	 *   PRIMARY KEY (`id`)
	 */

	@Id
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
