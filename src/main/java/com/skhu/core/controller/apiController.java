package com.skhu.core.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ds on 2018-01-24.
 */

/**
 * 투표 컨트롤러
 * 유권자가 투표한 투표 종류 id, 투표한 후보자를 보내줘야 한다.
 * 만약 단일 후보일 경우 투표 종류 id, 찬성, 반대, 기권(1,2,0) 값을 보내줘야 한다.
 * 보통 유권자는 3개의 투표를 진행하기 때문에(총학, 학부, 전공) 리스트로 보내준다?
 * */

@RestController
public class apiController {

    @PostMapping("")
    public JSONObject test() {
        return new JSONObject();
    }
}
