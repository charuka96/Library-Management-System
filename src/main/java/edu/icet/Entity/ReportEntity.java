package edu.icet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "report")
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reportId;
    private Integer barrowId;
    private Date    reportDate;
}
