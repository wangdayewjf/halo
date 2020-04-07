package run.halo.app.controller.monitor;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import run.halo.app.model.dto.DayScoreWjfDTO;
import run.halo.app.model.dto.DiaryItemWjfDTO;
import run.halo.app.model.entity.DayScoreWjf;
import run.halo.app.service.DayMonitorWjfService;

/**
 * @program halo
 * @description: monitor的controller
 * @author: wangjianfeng
 * @create: 2020/04/06 22:53
 */

@Slf4j
@RestController
@RequestMapping("/monitor")
public class MonitorController {
	private final DayMonitorWjfService dmWjfService;

	public MonitorController(DayMonitorWjfService dmWjfService){
		this.dmWjfService = dmWjfService;
	}
//	@GetMapping("counts")
//	@ApiOperation("Gets count info")
//	public StatisticDTO getCount() {
//		return adminService.getCount();
//	}

	@PostMapping("/insertDayScore")
	@ApiOperation("insertDayScore")
	public DayScoreWjf insertDayScore(@RequestBody DayScoreWjfDTO dto){
	  return dmWjfService.insertDayScore(dto);
	};



	@PostMapping("/insertDiaryItem")
	@ApiOperation("insertDiaryItem")
	Integer insertDiaryItem(DiaryItemWjfDTO dto){

	}

	Integer insertDiaryTemp();

	Integer insertTarget();
}
