package com.study.deploy.gusoodeploy.dto;

import com.study.deploy.gusoodeploy.entity.Member;
import com.study.deploy.gusoodeploy.entity.Rank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberResponseDTO {
    private Long member_id;
    private String name;
    private String password;
    private String email;
    private Rank rank;

    private String street;
    private String city;
    private String state;
    private String postalCode;

    public MemberResponseDTO(Member member) {
        this.member_id = member.getMemberId();
        this.name = member.getName();
        this.password = member.getPassword();
        this.email = member.getEmail();
        this.street = member.getAddress().getStreet();
        this.city = member.getAddress().getCity();
        this.postalCode = member.getAddress().getPostalCode();
    }
}
