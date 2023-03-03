package com.solution.green.controller;

import com.solution.green.dto.MemDoDto;
import com.solution.green.dto.MemberDto;
import com.solution.green.dto.QuestDto;
import com.solution.green.service.MemDoService;
import com.solution.green.service.QuestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class QuestController {
    private final QuestService questService;
    private final MemDoService memDoService;

    // TODO - 겟리스트 (디폴트로 넘기기)
    // 디폴트 정렬 순서 ... -> 참여자 수(인기도) & 사용자 관심 순서
    
    @PostMapping("/add-to-my-quest/{memberId}/{questId}")
    public MemDoDto.My addToMyQuest(@PathVariable final Long memberId,
                                    @PathVariable final Long questId) {
        return memDoService.addToMyQuest(memberId, questId);
    }

    @PostMapping("/create-quest") // only for back-end
    public QuestDto.Detail createQuest(
            @Valid @RequestBody QuestDto.Request request) {
        return questService.createQuest(request);
    }
}
