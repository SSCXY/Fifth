package com.Jiao.domain;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString@Getter@Setter
public class LastInfo {
    private String province;
    private Integer province_num;
    private String area;
    private Integer area_num;

    public LastInfo(String province, Integer province_num, String area, Integer area_num) {
        this.province = province;
        this.province_num = province_num;
        this.area = area;
        this.area_num = area_num;
    }
}


