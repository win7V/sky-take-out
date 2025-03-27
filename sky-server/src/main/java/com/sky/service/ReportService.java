package com.sky.service;

import com.sky.vo.TurnoverReportVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


public interface ReportService {

    /**
     * 统计指定时间区间内的营业额
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}
