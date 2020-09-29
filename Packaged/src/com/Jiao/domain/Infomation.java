package com.Jiao.domain;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
public class Infomation {
    private String province;
    private String area;
    private String num;

    public Infomation(String province, String area, String num) {
        this.province = province;
        this.area = area;
        this.num = num;
    }

}
