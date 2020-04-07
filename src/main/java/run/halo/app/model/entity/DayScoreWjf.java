package run.halo.app.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @program halo
 * @description: day_score_wjf 的实体
 * @author: wangjianfeng
 * @create: 2020/04/06 22:11
 */

@Data
@Entity
@Table(name = "day_score_wjf")
@EqualsAndHashCode(callSuper = true)
public class DayScoreWjf  extends BaseEntity {

	/**
	 * CREATE TABLE `day_score_wjf` (
	 *   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	 *   `target_wjf_id` int(11) NOT NULL DEFAULT '0' COMMENT '主tagetid',
	 *   `target_wjf_id_c` int(11) NOT NULL DEFAULT '0' COMMENT '子tag的id',
	 *   `score` float unsigned zerofill NOT NULL COMMENT '子score得分',
	 *   `mark` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '备注',
	 *   `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
	 *   `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
	 *   PRIMARY KEY (`id`)
	 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "target_wjf_id")
	private Integer targetWjfId;
	@Column(name = "target_wjf_id_c")
	private Integer targetWjfIdC;
	@Column(name = "score")
	private Float score;
	@Column(name = "mark")
	private String mark;
	@Column(name = "update_time")
	private Date updateTime;
	@Column(name = "create_time")
	private Date createTime;

}

