package run.halo.app.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import run.halo.app.model.DiaryTempWjfDTO;
import run.halo.app.model.dto.DayScoreWjfDTO;
import run.halo.app.model.dto.DiaryItemWjfDTO;
import run.halo.app.model.dto.TargetWjfDTO;
import run.halo.app.model.entity.DayScoreWjf;
import run.halo.app.model.entity.DiaryItemWjf;
import run.halo.app.model.entity.DiaryTempWjf;
import run.halo.app.model.entity.TargetWjf;
import run.halo.app.repository.DayScoreWjfRepository;
import run.halo.app.repository.DiaryItemWjfRepository;
import run.halo.app.repository.DiaryTempWjfRepository;
import run.halo.app.repository.TargetWjfRepository;
import run.halo.app.service.DayMonitorWjfService;

/**
 * @program halo
 * @description: DayMonitorWjfService
 * @author: wangjianfeng
 * @create: 2020/04/06 22:43
 */

@Slf4j
@Service
public class DayMonitorWjfServiceImpl implements DayMonitorWjfService {

	private final DayScoreWjfRepository dsRepository;
	private final DiaryItemWjfRepository diRepository;
	private final DiaryTempWjfRepository dtRepository;
	private final TargetWjfRepository tRepository;
	public DayMonitorWjfServiceImpl(DayScoreWjfRepository dsRepository,
									DiaryItemWjfRepository diRepository,
									DiaryTempWjfRepository dtRepository,
									TargetWjfRepository tRepository){

		this.dsRepository = dsRepository;
		this.diRepository = diRepository;
		this.dtRepository = dtRepository;
		this.tRepository = tRepository;

	}

	@Override
	public DayScoreWjf insertDayScore(DayScoreWjfDTO dto) {
		DayScoreWjf insert = new DayScoreWjf();
		BeanUtils.copyProperties(dto,insert);
		return dsRepository.save(insert);
	}

	@Override
	public DayScoreWjf updateDayScoreById(DayScoreWjfDTO dto) {
		return dsRepository.;
	}

	@Override
	public DiaryItemWjf insertDiaryItem(DiaryItemWjfDTO dto) {
		DiaryItemWjf insert = new DiaryItemWjf();
		BeanUtils.copyProperties(dto,insert);
		return diRepository.save(insert);
	}

	@Override
	public DiaryTempWjf insertDiaryTemp(DiaryTempWjfDTO dto) {
		DiaryTempWjf insert = new DiaryTempWjf();
		BeanUtils.copyProperties(dto,insert);
		return dtRepository.save(insert);
	}

	@Override
	public TargetWjf insertTarget(TargetWjfDTO dto) {
		TargetWjf insert = new TargetWjf();
		BeanUtils.copyProperties(dto,insert);
		return tRepository.save(insert);
	}
}
