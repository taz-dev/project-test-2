package com.third.shopping.model.entity;

import com.third.shopping.model.vo.InsertVO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("MemberEntity")
@Getter
@Setter
@ToString
@Builder
public class MemberEntity {

    private int mem_idx;
    private String id;
    private String pw;
    private String name;
    private String addr;
    private String tel;
    private String isAdmin;

    public InsertVO voChange() {

        InsertVO insertVO = new InsertVO();
        insertVO.setAddr(this.addr);
        insertVO.setId(this.id);
        insertVO.setMem_idx(this.mem_idx);
        insertVO.setName(this.name);
        insertVO.setPw(this.pw);
        insertVO.setTel(this.tel);
        return insertVO;

    }

}
