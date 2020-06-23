package com.dreambody.controller.foodApi.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author : 이병덕
 * @decription : 식품안전나라 API 응답 Dto
 * @date : 2020.06.21
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class FoodInfoResponseDto {
//    private String foodNm;     // 음식명
//    private String foodCd;     // 음식코드
    private String NUTR_CONT1;      // 칼로리      NUTR_CONT1
//    private float carbohydrate; // 탄수화물    NUTR_CONT2
//    private float protein;      // 단백질      NUTR_CONT3
//    private String code;       // 응답코드
//    private String msg;        // 응답메세지

//    @JsonCreator
//    public FoodInfoResponseDto(@JsonProperty("NUTR_CONT3") float calorie) {
//        this.calorie = calorie;
//    }
}
