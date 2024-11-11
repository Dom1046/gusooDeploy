package com.study.deploy.gusoodeploy.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Address {
    private String street;
    private String city;
    private String postalCode;
}
