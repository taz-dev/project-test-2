package com.third.shopping.controller;

import com.third.shopping.dao.MemberDAO;
import com.third.shopping.model.vo.InsertVO;
import com.third.shopping.model.vo.LoginVO;
import com.third.shopping.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberDAO memberDao;

    @GetMapping("/member/registerMember")
    public int registerMember(InsertVO vo){
        return memberService.postRegister(vo);
    }

    @PatchMapping("/member/updateMember")
    public int updateMember(@RequestBody InsertVO vo){
        return memberService.updateMember(vo);
    }

    @DeleteMapping("/member/delete")
    public int deleteMember(int idx){
        return memberService.memberDelete(idx);
    }

    @GetMapping("/member/test")
    public List<InsertVO> list(){
        return memberDao.testList();
    }

}
