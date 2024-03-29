package com.solution.green.dto;

import com.solution.green.entity.MemberDo;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class MemDoDto {
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ListView {
        @NotNull
        private Long memDoId;
        @NotNull
        private QuestDto.ListView questDto;
        private Date startDate;
        private Date dueDate;
        @Nullable
        private Date endDate;
        private Date leftTime; // 프론트에서 직접 계산
        private Boolean stance;
        private Double achieveRate; // 보류

        public static ListView fromEntity(MemberDo memberDo) {
            return ListView.builder()
                    .memDoId(memberDo.getId())
                    .questDto(QuestDto.ListView.fromEntity(memberDo.getQuest()))
                    .startDate(memberDo.getStartDate())
                    .dueDate(memberDo.getDueDate())
                    .endDate(memberDo.getEndDate())
                    .stance(memberDo.getStance())
                    .build();
        }
    }
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class DetailView {
        // - 디테일 정보
        //    - 퀘스트 상세설명 attirbute 추가할 것 - DB
        @NotNull
        private Long memDoId;
        @NotNull
        private QuestDto.DetailView questDto;
        private Date startDate;
        private Date dueDate;
        @Nullable
        private Date endDate;
        private Date leftTime; // 프론트에서 직접 계산
        private Boolean stance;
        private Double achieveRate; // 보류
        @Nullable
        @Setter
        private List<CertificateDto.DetailView> certificateImages;

        public static DetailView fromEntity(MemberDo memberDo) {
            return DetailView.builder()
                    .memDoId(memberDo.getId())
                    .questDto(QuestDto.DetailView.fromEntity(memberDo.getQuest()))
                    .startDate(memberDo.getStartDate())
                    .dueDate(memberDo.getDueDate())
                    .endDate(memberDo.getEndDate())
                    .stance(memberDo.getStance())
                    .build();
        }
    }
}
