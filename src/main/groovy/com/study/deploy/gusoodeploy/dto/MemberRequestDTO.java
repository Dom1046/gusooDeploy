package com.study.deploy.gusoodeploy.dto;

import com.study.deploy.gusoodeploy.entity.Address;
import com.study.deploy.gusoodeploy.entity.Member;
import com.study.deploy.gusoodeploy.entity.Rank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberRequestDTO {
    private String name;
    private String password;
    private String email;
    @Builder.Default
    private Rank rank = Rank.DIAMOND;

    private String street;
    private String city;
    private String state;
    private String postalCode;

    public MemberRequestDTO(Member member) {
        this.name = member.getName();
        this.password = member.getPassword();
        this.email = member.getEmail();
        this.street = member.getAddress().getStreet();
        this.city = member.getAddress().getCity();
        this.postalCode = member.getAddress().getPostalCode();
    }

    public Member toEntity() {
        return Member.builder().
                name(name)
                .email(email)
                .password(password)
                .address(Address.builder()
                        .city(city)
                        .street(street)
                        .postalCode(postalCode).build())
                .DIAMOND(rank)
                .build();
    }
}

