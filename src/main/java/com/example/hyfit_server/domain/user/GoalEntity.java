package com.example.hyfit_server.domain.user;

import com.example.hyfit_server.domain.BaseTimeEntity;
import com.example.hyfit_server.dto.Goal.GoalDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.*;

@Table(name = "goal")
@Getter
@NoArgsConstructor
@Entity
public class GoalEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long goalId;

    @Column(nullable = true)
    private String email;

    @Column(nullable = true)
    private String place;

    // mountain or building
    @Column(nullable = true)
    private String type;

    @Column(nullable = true)
    private int goalStatus;

    @Column(nullable = true)
    private String rate;

    private String description;

    @Builder
    public GoalEntity(long goalId, String email, String place, String type, int goalStatus, String rate, String description){
        this.goalId = goalId;
        this.email = email;
        this.place = place;
        this.type = type;
        this.goalStatus = goalStatus;
        this.rate = rate;
        this.description = description;
    }
    /* Entity -> DTO */

    public GoalDto toDto(){
        return  GoalDto.builder().
                goalId(goalId)
                .email(email)
                .place(place)
                .type(type)
                .goalStatus(goalStatus)
                .description(description)
                .rate(rate)
                .createdAt(getCreatedAt())
                .build();
    }

    // modify
    public GoalEntity modify(String rate,int status){
        return GoalEntity.builder()
                .goalId(goalId)
                .email(email)
                .place(place)
                .type(type)
                .goalStatus(status)
                .description(description)
                .rate(rate)
                .build();
    }

}
