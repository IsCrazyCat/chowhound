package com.spring.mvc.util;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guojunguang
 * @date 2017/7/27
 * @decription excel表格操作工具类
 */
public class ExcelUtil {
    /**
     * 读取xls文件为字符串
     * @param file_url 读取文件路径
     * @return  返回List 每行数据为一个list
     */
    public static List<List<Object>> xlsToString(String file_url){
        String result = "";
        List<List<Object>> list =new ArrayList<List<Object>>();
        List<Object> rowlist;
        try {
            StringBuilder sb = new StringBuilder();
            File file = new File(file_url);
            FileInputStream fis = new FileInputStream(file);
            Workbook wb= Workbook.getWorkbook(fis);
            Sheet[] sheets = wb.getSheets();
            for (Sheet sheet:sheets) {
                // 获得行数
                int rows = sheet.getRows();
                // 获得列数
                int cols = sheet.getColumns();
                // 读取数据
                for (int row = 0; row < rows; row++)
                {
                    rowlist =new ArrayList<Object>();
                    for (int col = 0; col < cols; col++)
                    {
                        rowlist.add(sheet.getCell(col, row).getContents());
                    }
                    list.add(rowlist);
                }
            }
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
