package com.adactin.Runner;

import com.adactin.utils.BaseClass;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Reporting extends BaseClass {
    public static void jvmReport(String jsonfiles)

    {
        File file = new File("C:\\Users\\selva\\Cucumber\\src\\test\\resources\\JvmReport");
        Configuration configuration=new Configuration(file,"Suja Cucumber Project");
        configuration.addClassifications("Tester", "Suja");
        configuration.addClassifications("Browser",readProperties("Browser"));
        List<String> al=new ArrayList<>();
        al.add(jsonfiles);
        ReportBuilder builder=new ReportBuilder(al,configuration);
        builder.generateReports();

    }
}
