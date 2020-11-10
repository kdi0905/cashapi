package kr.co.gdu.cashapi.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.gdu.cashapi.mapper.CashStatsMapper;

@Service
@Transactional
public class CashStatsService {
	@Autowired CashStatsMapper cashStatsMapper;
	public Map<String, Object> getTotalOfMonthByYear(int year){
		return cashStatsMapper.selectTotalOfMonthByYear(year);
	}
	
	public Map<String,Object> getTotaloutAndinByYear(int year){
		return cashStatsMapper.selectTotalOutAndinByYear(year);
	}
}
