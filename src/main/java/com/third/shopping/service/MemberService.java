package com.third.shopping.service;

import com.third.shopping.dao.LoginDAO;
import com.third.shopping.dao.MemberDAO;
import com.third.shopping.model.entity.MemberEntity;
import com.third.shopping.model.vo.InsertVO;
import com.third.shopping.model.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberDAO memberDAO;

    public int postRegister(InsertVO vo) {
        return memberDAO.register(vo);
    }

    public int updateMember(InsertVO vo) {

        MemberEntity memberEntity = memberDAO.selectMember(vo.getMem_idx());
        memberDAO.memberDelete(vo.getMem_idx());
        memberEntity.setAddr(vo.getAddr());
        memberEntity.setId(vo.getId());
        memberEntity.setName(vo.getName());
        memberEntity.setPw(vo.getPw());
        memberEntity.setTel(vo.getTel());
        return memberDAO.updateMember(memberEntity);
    }

    public int memberDelete(int idx) {
        return memberDAO.memberDelete(idx);
    }

}
