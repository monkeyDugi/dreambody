package com.dreambody.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* description : H2 연동 테스트를 위한 엔티티
 * auth : 이병덕
 * createDate : 2020.06.15
 * */

@Getter
@NoArgsConstructor
@Entity
public class H2Connection extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Builder
    public H2Connection(String name) {
        this.name = name;
    }
}
