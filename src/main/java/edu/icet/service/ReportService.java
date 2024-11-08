package edu.icet.service;

import edu.icet.dto.Report;

import java.util.List;

public interface ReportService {
    void addReport(Report report);

    List<Report> getAllreport();
}
