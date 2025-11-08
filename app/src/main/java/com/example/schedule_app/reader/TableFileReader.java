package com.example.schedule_app.reader;

import com.example.schedule_app.schedule_elements.Discipline;
import com.example.schedule_app.schedule_elements.InitStudents;
import com.example.schedule_app.schedule_elements.Lector;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class TableFileReader {
    public ArrayList<Lector> lectors;
    Map<InitStudents, ArrayList<Discipline>> students;

    public void readTableFile (String fileName) throws IOException {
        HSSFWorkbook exelTable = new HSSFWorkbook(new FileInputStream(fileName));

        HSSFSheet mainSheet = exelTable.getSheet("Лист 1");


    }
}
