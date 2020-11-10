package kr.co.gdu.cashapi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CashStatsMapper {
	public Map<String, Object> selectTotalOfMonthByYear(int year);
	public Map<String,Object> selectTotalOutAndinByYear(int year);
}
