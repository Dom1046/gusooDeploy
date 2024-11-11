package com.study.deploy.gusoodeploy.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    private String name;
    private String password;

    private String email;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Rank DIAMOND;
}
