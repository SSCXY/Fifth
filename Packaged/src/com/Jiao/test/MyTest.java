package com.Jiao.test;

import com.Jiao.domain.LastInfo;
import com.Jiao.fileutils.FileUtils;
import com.Jiao.operate.OperateClass;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class MyTest {
    @Test
    public  void test1() {
        String FilePath = "src/yq_in.txt";
        List<LastInfo> lastInfo = FileUtils.getLastInfo(FilePath);
        OperateClass.noParameterOut(lastInfo);
    }
    @Test
    public  void test2() {
        Scanner input = new Scanner(System.in);
        String UserInput = input.nextLine();
        String AfterSplitStr[] = new String[2];
        AfterSplitStr = UserInput.split(" ");
        List<LastInfo> lastInfo = FileUtils.getLastInfo(UserInput);
        OperateClass.twoParameterOut(lastInfo, AfterSplitStr);
        input.close();
    }
    @Test
    public  void test3() {
        Scanner input = new Scanner(System.in);
        String UserInput = input.nextLine();//存放用户输入的字符串
        String AfterSplitStr[] = new String[3];
        AfterSplitStr = UserInput.split(" ");//分割用户输入的字符串
        List<LastInfo> lastInfo = FileUtils.getLastInfo(UserInput);
        OperateClass.threeParameterOut(lastInfo, AfterSplitStr);
    }
}

