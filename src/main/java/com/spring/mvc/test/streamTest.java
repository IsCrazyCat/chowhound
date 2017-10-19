package com.spring.mvc.test;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author guojunguang
 * @date 2017/9/19
 * @decription
 */
public class streamTest {
    public static void main(String[] args){
//        printWriteTest();
//        bufferedReaderTest();
        wirteDate();
    }
    public static void wirteDate(){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("F:/MyWorkSpeace/SpringMvc/src/main/java/com/spring/mvc/test/employee.txt");
            pw.println("name"+"|"+gc.get(Calendar.YEAR));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            pw.close();
        }
    }
    public static void printWriteTest(){
        PrintWriter pw = null;
        try{
            pw = new PrintWriter("F:/MyWorkSpeace/SpringMvc/src/main/java/com/spring/mvc/test/employee.txt");
//            pw = new PrintWriter(new FileWriter("employee.txt"));
            String name = "Hello PrintWriter!";
            double version = 1.0;
            pw.print(name);
            pw.print(' ');
            pw.println(version);
            System.out.println(System.getProperty("line.separator"));
            System.out.println("-----------end---------------");
        }catch (FileNotFoundException fe){
            fe.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }finally {
            pw.close();
        }
    }
    public static  void bufferedReaderTest(){
        BufferedReader br = null;
        try{
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("F:/MyWorkSpeace/SpringMvc/src/main/java/com/spring/mvc/test/employee.txt")));
            String line;
            line = br.readLine();
            while (null!=(line = br.readLine())){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
