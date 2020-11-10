package kr.co.gdu.cashapi.restcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.gdu.cashapi.service.CashStatsService;

@RestController
public class CashStatsRestController {
	@Autowired CashStatsService cashStatsService;
	//년도별 월 지출
	@GetMapping("/totalOfMonthByYear/{year}")
	public Map<String,Object> totalOfMonthByYear(@PathVariable(name="year")int year){
		System.out.println("/totalOfMonthByYear 호출성공");
		return cashStatsService.getTotalOfMonthByYear(year);
	}
	//년도별 수입/지출
	@GetMapping("/totalOutAndInByYear/{year}")
	public Map<String,Object> totalOutAndInByYear(@PathVariable(name="year")int year){
		return cashStatsService.getTotaloutAndinByYear(year);
	}
}
