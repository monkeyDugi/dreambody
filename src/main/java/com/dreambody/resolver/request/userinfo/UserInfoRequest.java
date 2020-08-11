package com.dreambody.resolver.request.userinfo;

import com.dreambody.dbenum.EGender;
import com.dreambody.model.userInit.Activity;
import com.dreambody.model.userInit.Goal;
import com.dreambody.model.userInit.UserInfo;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

/**
 *   @author 홍윤표
 *   @description UserInfo 저장을 위한 request 클래스 생성.
 *   @date 2020.06.23 01:11:08
 */

@Slf4j
@NoArgsConstructor @AllArgsConstructor
@Builder @Getter @Setter @ToString
public class UserInfoRequest {
    private Integer currentWeight;

    private Integer goalWeight;

    private Integer height;

    private String dateOfBirth;

    private EGender genderType;

    private Long goal;

    private Long activity;

    public UserInfo toEntity() {
        UserInfo userInfo = UserInfo.builder()
                .currentWeight(currentWeight)
                .dateOfBirth(dateOfBirth)
                .goalWeight(goalWeight)
                .height(height)
                .genderType(genderType)
                .goal(Goal.builder().id(goal).build())
                .activity(Activity.builder().id(activity).build())
                .build();

        log.info("UserInfoRequest genderType : " + genderType);
        userInfo.setRegistrationDate(LocalDate.now());
        userInfo.calculationDailyIntakeCalorie();

        return userInfo;
    }

    // setter는 지양하면 좋겠어요
    // 이유 : set이라는 메서드명을 보고 어떤 일을 하는지 알기가 쉽지 않기 때문
    // 예) 주문취소라는 기능이 있다면 setOrder() 보단, cancleOrder() 같은 네이밍으로 바꾸는게 좋아 보여요
    // 변수별로 하나 씩 != Null 보단, 한줄로 끝낼 수 있는 방법이 있을 거 같은데, 이 부분은 생각해 보면 있지 않을까 생각해용 ㅋ.ㅋ
    public UserInfo toEntity(UserInfo userInfo) {
        if (currentWeight != null) {
            userInfo.setCurrentWeight(currentWeight);
        }

        if (goalWeight != null) {
            userInfo.setGoalWeight(goalWeight);
        }

        if (height != null) {
            userInfo.setHeight(height);
        }

        if (dateOfBirth != null) {
            userInfo.setDateOfBirth(dateOfBirth);
        }

        if (genderType != null) {
            userInfo.setGenderType(EGender.MALE);
        }

        if (goal != null) {
            userInfo.setGoal(Goal.builder().id(goal).build());
        }

        if (activity != null) {
            userInfo.setActivity(Activity.builder().id(activity).build());
        }

        userInfo.setRegistrationDate(LocalDate.now());
        userInfo.calculationDailyIntakeCalorie();

        return userInfo;
    }

}
