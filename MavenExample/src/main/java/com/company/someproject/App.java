package com.company.someproject;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Workbook wb = new HSSFWorkbook();
        try(OutputStream fileOut = new FileOutputStream("C:\\Users\\jonatasdourado\\Documents\\Sample.xls")){
        	wb.write(fileOut);
        	wb.close();
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
