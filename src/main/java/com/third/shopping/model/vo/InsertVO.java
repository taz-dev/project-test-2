package com.third.shopping.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("InsertVO")
@Getter
@Setter
@ToString
public class InsertVO {

    private int mem_idx;
    private String id;
    private String pw;
    private String name;
    private String addr;
    private String tel;

}
