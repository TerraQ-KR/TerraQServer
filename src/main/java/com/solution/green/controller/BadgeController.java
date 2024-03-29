package com.solution.green.controller;

import com.solution.green.dto.MemGetDto;
import com.solution.green.service.MemGetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class BadgeController {
    private final MemGetService memGetService;

    @GetMapping("/getMyBadge/{memberId}")
    public List<MemGetDto.List> getMyBadge(@PathVariable final Long memberId) {
        return memGetService.getMyBadge(memberId);
    }

    @PostMapping("/createMainBadge")
    public void createMainBadge(@Valid @RequestBody Long memberGetId) {
        memGetService.createMainBadge(memberGetId);
    }

    @PatchMapping("/updateMainBadge/{memberId}")
    public void updateMainBadge(@PathVariable final Long memberId,
                                @Valid @RequestBody Long memberGetId) {
        memGetService.updateMainBadge(memberId, memberGetId);
    }
}
