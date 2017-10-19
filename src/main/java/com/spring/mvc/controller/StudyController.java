package com.spring.mvc.controller;


/**
 * @author guojunguang
 * @date 2017/9/1
 * @decription
 */
public class StudyController {
    public static void main(String[] args){
        StringTest();
//        memoryTest();
//        codePoint();
    }
    public void streamTest(){

    }
    public static void codePoint(){
        String code = "Hello！你";
        int num = code.length();
        System.out.println(num);
        int cpnum = code.codePointCount(0,num);
        System.out.println(cpnum);
    }
    public static void memoryTest(){
        int i = 100;
        int i1 = 100;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i3 = 40;
        Integer i10 = 40;
        Integer i6 = new Integer(200);
        Integer i7 = new Integer(200);
        Integer i8 = 200;
        Integer i9 = 200;
        Double d1=1.0;
        Double d2=1.0;
        System.out.println(i==i1);//true
        System.out.println("i4==i3 = "+(i4==i3));//true
        System.out.println("i5==i3 = "+(i5==i3));//true
        System.out.println("i4==i5 = "+(i4==i5));//false
        System.out.println("i6==i7 = "+(i6==i7));//false
        System.out.println("i3==i10 = "+(i3==i10));//true
        System.out.println("i8==i9 = "+(i8==i9));//false
        System.out.println(d1==d2);
     }
     public static void StringTest(){
        StringBuilder sbr = new StringBuilder("This is ");
        StringBuffer sbf = new StringBuffer("This is ");
        sbr.append("stringbuilder");
        sbf.append("stringbuffer");
     }
}
