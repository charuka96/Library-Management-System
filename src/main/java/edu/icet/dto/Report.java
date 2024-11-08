package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Report {
    private Integer reportId;
    private Integer barrowId;
    private Date    reportDate;

}
