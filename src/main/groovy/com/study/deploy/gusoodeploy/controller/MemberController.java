package com.study.deploy.gusoodeploy.controller;

import com.study.deploy.gusoodeploy.dto.MemberRequestDTO;
import com.study.deploy.gusoodeploy.dto.MemberResponseDTO;
import com.study.deploy.gusoodeploy.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/member/post")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<MemberResponseDTO> register(@RequestBody MemberRequestDTO memberRequestDTO) {
        return ResponseEntity.ok(memberService.register(memberRequestDTO));
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<MemberResponseDTO> read(@PathVariable("memberId") Long memberId){
        return ResponseEntity.ok(memberService.read(memberId));
    }
}
