package com.darak.backend.Join.controller;


import com.darak.backend.Join.dto.JoinRequestDto;
import com.darak.backend.Join.dto.JoinResponseDto;
import com.darak.backend.Join.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/join")
public class JoinController {

    private final JoinService joinService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PatchMapping("/buy")
    public ResponseEntity<JoinResponseDto> plusJoinPerson(@RequestBody JoinRequestDto joinRequestDto) throws Exception {
        joinService.join_people_update(joinRequestDto);
        JoinResponseDto joinResponseDto = joinService.Join_select(joinRequestDto);
        return ResponseEntity.ok(joinResponseDto);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/call/info")
    public ResponseEntity<JoinResponseDto> joinSelect(@RequestBody JoinRequestDto joinRequestDto) throws Exception {
        JoinResponseDto joinResponseDto = joinService.Join_select(joinRequestDto);
        return ResponseEntity.ok(joinResponseDto);
    }


}
