package com.study.deploy.gusoodeploy.repository;

import com.study.deploy.gusoodeploy.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
