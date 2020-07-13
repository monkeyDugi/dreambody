package com.dreambody.model.foodInfo;

import com.dreambody.model.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.*;

import javax.persistence.*;

/**
 * @author : 이병덕
 * @description : 식사타입 테이블
 *                ex) 아침, 점심, 저녁, 간식
 * @date : 2020.06.21
 */

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class MealType extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;
}
