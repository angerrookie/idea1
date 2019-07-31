package com.muyu.demo3;

import com.muyu.demo2.Computer;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.context.ApplicationContext;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Test
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Test {

  public static void main(String[] args){

      test5();

  }
    public static void test5(){
        System.out.println("请输入一个数字：");
        long star = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        long end = System.currentTimeMillis();
        System.out.println("..."+(end-star));
    }
  public static void test4(){
      System.out.println("请输入一个数字：");
      long star = System.currentTimeMillis();
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      StringBuffer stringBuffer = new StringBuffer();
      for (int i=s.length()-1;i>=0;i--){
          stringBuffer.append(s.charAt(i));
      }
      long end = System.currentTimeMillis();
      System.out.println(Integer.parseInt(stringBuffer.toString())+"..."+(end-star));
  }
  public static void  test2(){
    boolean flag = false;
    do {
        System.out.println("请输入学生成绩：");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if (grade>=0&&grade<=100){
            if (grade>=90){
                System.out.println("成绩优秀！");
            }else if (grade>=80&&grade<90){
                System.out.println("成绩良好！");
            }else if (grade>=70&&grade<80){
                System.out.println("成绩中等！");
            }else if (grade>=60&&grade<70){
                System.out.println("成绩及格！");
            }else{
                System.out.println("成绩不及格！");
            }
            flag = false;
        }else{
            System.out.println("成绩异常，请重新输入！");
            flag = true;
        }
    }while (flag);
  }
  public static void test3(int grade){
      if (grade<0||grade>100){
          System.out.println("成绩异常");
          System.exit(1);
      }
      switch (grade/10){
          case 10:
          case 9:
              System.out.println("成绩优秀！");
              break;
          case 8:
              System.out.println("成绩优秀！");
              break;
          case 7:
              System.out.println("成绩中等！");
              break;
          case 6:
              System.out.println("成绩及格！");
              break;
          default:
              System.out.println("成绩不及格！");
              break;
      }
  }
  public static void  test1(){

      boolean flag=true;
      while (flag){
          System.out.println("请输入0~99999之间任意数");
          Scanner scanner = new Scanner(System.in);
          String input = scanner.nextLine();
          System.out.println(input.length());
          if(Integer.parseInt(input)==-1){
              flag=false;
          }
      }
  }

}
