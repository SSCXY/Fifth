package com.Jiao.operate;

import com.Jiao.domain.LastInfo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class OperateClass {
    public static void noParameterOut(List<LastInfo> lastInfoList){
        for(int i = 0; i < lastInfoList.size(); i++){
            System.out.println(lastInfoList.get(i).toString());
        }
        try {
            FileWriter filewriter = new FileWriter("src/yq_out.txt" );
            for(int i = 0; i < lastInfoList.size(); i++){

                    if(lastInfoList.get(i).getArea_num().equals("0") )continue;
                    else if(i == 0)
                        filewriter.write(lastInfoList.get(i).getProvince()  +"\r\n"
                                + lastInfoList.get(i).getArea() + "\t" + lastInfoList.get(i).getArea_num() + "\r\n");
                    else if(lastInfoList.get(i).getProvince().equals( lastInfoList.get(i - 1).getProvince())){
                        filewriter.write(lastInfoList.get(i).getArea() + "\t"
                                + lastInfoList.get(i).getArea_num() + "\r\n");
                    }else {
                        filewriter.write("\r\n" + lastInfoList.get(i).getProvince()+ "\t"  + "\r\n"
                                + lastInfoList.get(i).getArea() + "\t" + lastInfoList.get(i).getArea_num() + "\r\n");
                    }
                }
            filewriter.flush();
            filewriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void twoParameterOut(List<LastInfo> lastInfoList, String AfterSplitStr[]){
        Comparator<LastInfo> byPronum = Comparator.comparing(LastInfo::getProvince_num).reversed();
        Comparator<LastInfo> byProname = Comparator.comparing(LastInfo::getProvince);
        Comparator<LastInfo> byAreanum = Comparator.comparing(LastInfo::getArea_num).reversed();
        Comparator<LastInfo> byAreaname = Comparator.comparing(LastInfo::getArea);
        lastInfoList.sort(byPronum.thenComparing(byProname.thenComparing(byAreanum.thenComparing(byAreaname))));

        try {
            FileWriter  filewriter = new FileWriter("src/"+ AfterSplitStr[1]);
            for(int i = 0; i < lastInfoList.size(); i++){
                    if(i == 0)
                        filewriter.write(lastInfoList.get(0).getProvince() + "\t" + lastInfoList.get(0).getProvince_num()+ "个城市"+ "\r\n"
                                + lastInfoList.get(0).getArea() + "\t" + lastInfoList.get(0).getArea_num() + "\r\n");
                    else if(lastInfoList.get(i).getProvince().equals( lastInfoList.get(i - 1).getProvince())){
                        filewriter.write(lastInfoList.get(i).getArea() + "\t"
                                + lastInfoList.get(i).getArea_num() + "\r\n");
                    }else {
                        filewriter.write( "\r\n" + lastInfoList.get(i).getProvince() + "\t" + lastInfoList.get(i).getProvince_num() + "个城市" +"\r\n"
                                + lastInfoList.get(i).getArea() + "\t" + lastInfoList.get(i).getArea_num() + "\r\n");
                    }

            }
            filewriter.flush();
            filewriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void threeParameterOut(List<LastInfo> lastInfoList, String AfterSplitStr[]) {
        Comparator<LastInfo> byPronum = Comparator.comparing(LastInfo::getProvince_num).reversed();
        Comparator<LastInfo> byProname = Comparator.comparing(LastInfo::getProvince);
        Comparator<LastInfo> byAreanum = Comparator.comparing(LastInfo::getArea_num).reversed();
        Comparator<LastInfo> byAreaname = Comparator.comparing(LastInfo::getArea);
        lastInfoList.sort(byPronum.thenComparing(byProname.thenComparing(byAreanum.thenComparing(byAreaname))));

        for(int i = 0; i < lastInfoList.size(); i++){
            System.out.println(lastInfoList.get(i).toString());
        }
        try {
            FileWriter filewriter = new FileWriter("src/" + AfterSplitStr[1]);
            for(int i = 0; i < lastInfoList.size(); i++){

                    if((! lastInfoList.get(i).getProvince().equals(AfterSplitStr[2])))continue;
                    else if(i == 0)
                        filewriter.write(lastInfoList.get(i).getProvince() + lastInfoList.get(i).getProvince_num() +"个城市" +"\r\n"
                                + lastInfoList.get(i).getArea() + "\t" + lastInfoList.get(i).getArea_num() + "\r\n");
                    else if(lastInfoList.get(i).getProvince().equals( lastInfoList.get(i - 1).getProvince())){
                        filewriter.write(lastInfoList.get(i).getArea() + "\t"
                                + lastInfoList.get(i).getArea_num() + "\r\n");
                    }else {
                        filewriter.write(lastInfoList.get(i).getProvince()+ "\t" + lastInfoList.get(i).getProvince_num() +"个城市" + "\r\n"
                                + lastInfoList.get(i).getArea() + "\t" + lastInfoList.get(i).getArea_num() + "\r\n");
                    }

            }
            filewriter.flush();
            filewriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

