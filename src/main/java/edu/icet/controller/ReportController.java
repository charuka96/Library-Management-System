package edu.icet.controller;

import edu.icet.dto.Report;
import edu.icet.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportController {

final ReportService reportService;
@PostMapping("/add-report")
    public void addreport(@RequestBody Report report) {
    reportService.addReport(report);
}
    @GetMapping("/getAll-report")
    public List<Report> getallReport(){
       return reportService.getAllreport();

    }
}