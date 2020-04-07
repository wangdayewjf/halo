package run.halo.app.service;

import run.halo.app.model.DiaryTempWjfDTO;
import run.halo.app.model.dto.DayScoreWjfDTO;
import run.halo.app.model.dto.DiaryItemWjfDTO;
import run.halo.app.model.dto.TargetWjfDTO;
import run.halo.app.model.entity.DayScoreWjf;
import run.halo.app.model.entity.DiaryItemWjf;
import run.halo.app.model.entity.DiaryTempWjf;
import run.halo.app.model.entity.TargetWjf;

/**
 * @program halo
 * @description: 监控项目
 * @author: wangjianfeng
 * @create: 2020/04/06 22:34
 */
public interface DayMonitorWjfService {

	DayScoreWjf insertDayScore(DayScoreWjfDTO dto);

	DayScoreWjf updateDayScoreById(DayScoreWjfDTO dto);

	DiaryItemWjf insertDiaryItem(DiaryItemWjfDTO dto);

	DiaryTempWjf insertDiaryTemp(DiaryTempWjfDTO dto);

	TargetWjf insertTarget(TargetWjfDTO dto);
}
