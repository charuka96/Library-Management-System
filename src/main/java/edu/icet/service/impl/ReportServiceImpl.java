package edu.icet.service.impl;

import edu.icet.Entity.ReportEntity;
import edu.icet.dto.Report;
import edu.icet.repository.ReportRepository;
import edu.icet.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {
    final ReportRepository reportRepository;
    final ModelMapper mapper;

    @Override
    public void addReport(Report report) {
       reportRepository.save(mapper.map(report,ReportEntity.class));
    }

    @Override
    public List<Report> getAllreport() {
        List<Report>reportList = new ArrayList<>();
        reportRepository.findAll().forEach(reports->reportList.add(mapper.map(reports,Report.class)));
        return reportList;
    }

}
