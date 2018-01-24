package com.skhu.core.utils;

import com.skhu.core.model.Block;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ds on 2018-01-24.
 */

//테스트
    //객체의 속성값이 바뀌면 해쉬 코드도 변경된다.
    //하지만 그 변경 값이 미미해 해쉬코드로 다시 인코딩이나 해쉬를 해야 한다.
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException ,NoSuchAlgorithmException, GeneralSecurityException{
        /*Block block = new Block();
        System.out.println(block.hashCode());
        System.out.println(block);
        block.setValue(1);
        System.out.println(block.hashCode());
        System.out.println(block);
        block.setValue(2);
        System.out.println(block.hashCode());
        System.out.println(block);
        block.setVoteId(1);
        System.out.println(block.hashCode());
        System.out.println(block);
        block.setVoteId(2);
        System.out.println(block.hashCode());
        System.out.println(block);
        block.setMerkleHash(String.valueOf(block.hashCode()));
        System.out.println(block.hashCode());
        System.out.println(block);*/

        Block block1 = new Block();
        Block block2 = new Block();
        block1.setValue(1);
        block2.setValue(2);
        System.out.println(block1.hashCode());
        System.out.println(block2.hashCode());
        System.out.println(block1);
        System.out.println(block2);
        block1.setMerkleHash(String.valueOf(block1.hashCode()));
        block2.setMerkleHash(String.valueOf(block2.hashCode()));
        System.out.println(block1.hashCode());
        System.out.println(block2.hashCode());
        System.out.println(block1);
        System.out.println(block2);
        block1.setMerkleHash(String.valueOf(block1.hashCode()));
        block2.setPreBlockHash(String.valueOf(block1.getMerkleHash()));
        block2.setMerkleHash(String.valueOf(block2.hashCode()));
        System.out.println(block1.hashCode());
        System.out.println(block2.hashCode());
        System.out.println(block1);
        System.out.println(block2);
        System.out.println(SHA512Encrypt.encrypt(block1.getMerkleHash()));
        System.out.println(SHA512Encrypt.encrypt(block1.getMerkleHash()).length());
        AES256Util aes256Util = new AES256Util("asdasdasdasdasdasdasdasdasdasads");
        System.out.println(aes256Util.encrypt("123123"));
        System.out.println(aes256Util.decrypt(aes256Util.encrypt("123123")));
    }
}
