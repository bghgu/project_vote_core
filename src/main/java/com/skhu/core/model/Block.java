package com.skhu.core.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by ds on 2018-01-24.
 */

@Data
public class Block {
    //이전블록 해쉬값
    private String preBlockHash;
    //현재 블록 해쉬값
    private String merkleHash;
    //투표 시간
    private Date voteTime;
    //현재 블록 고유 인덱스값
    private int blockId;
    //투표 값
    private int value;
    //투표 종류
    private int voteId;
}
