package com.jung;

import com.jung.student.FinReport;
import com.jung.student.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finace = new FinReport();
        List<Report> reportList = new ArrayList<>();
        reportList.add(finace);
        for (Report report : reportList) {
            report.load();
            report.print();
        }
    }
}
