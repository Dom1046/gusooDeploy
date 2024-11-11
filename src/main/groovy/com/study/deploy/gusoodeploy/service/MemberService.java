package com.study.deploy.gusoodeploy.service;

import com.study.deploy.gusoodeploy.dto.MemberRequestDTO;
import com.study.deploy.gusoodeploy.dto.MemberResponseDTO;
import com.study.deploy.gusoodeploy.entity.Member;
import com.study.deploy.gusoodeploy.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberResponseDTO register(MemberRequestDTO memberRequestDTO) {
        Member save = memberRepository.save(memberRequestDTO.toEntity());
        return new MemberResponseDTO(save);
    }

    public MemberResponseDTO read(Long memberId) {
        try{
            return new MemberResponseDTO(memberRepository.findById(memberId).get());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
