package com.choongang;

import java.util.HashMap;

public class R_addEvenValues {
    public int addEvenValues(HashMap<Character, Integer> hashMap) {
        // TODO:
        //순회하기 위해 set 으로 다시
        int result =0;
        //엔트리셋으로 돌면 바로 키 벨류 값
        //접근할 수있으니 그렇게 풀어도 된다
        //그렇게도 풀어보기 엔트리가 키랑벨류 묶은거

        for (Character key : hashMap.keySet()){
            Integer value = hashMap.get(key);
            if (value %2 == 0){
                result += value;
            }
        }
        return result;
    }
}
