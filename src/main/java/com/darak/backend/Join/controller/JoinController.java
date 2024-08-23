package com.darak.backend.Join.controller;


import com.darak.backend.Join.dto.JoinRequestDto;
import com.darak.backend.Join.dto.JoinResponseDto;
import com.darak.backend.Join.dto.JoinUpdateResponse;
import com.darak.backend.Join.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/join")
public class JoinController {

    private final JoinService joinService;

    @PatchMapping("/buy")
    public ResponseEntity<JoinUpdateResponse> plusJoinPerson(@RequestBody JoinRequestDto joinRequestDto) throws Exception {
        joinService.join_people_update(joinRequestDto);
        return ResponseEntity.ok(new JoinUpdateResponse("성공적으로 참여하였습니다!"));
    }

    @GetMapping("/call/info")
    public ResponseEntity<JoinResponseDto> joinSelect(@RequestBody JoinRequestDto joinRequestDto) throws Exception {
        JoinResponseDto joinResponseDto = joinService.Join_select(joinRequestDto);
        return ResponseEntity.ok(joinResponseDto);
    }


}
