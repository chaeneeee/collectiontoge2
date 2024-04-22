package com.choongang;

import java.util.HashMap;

public class M_getValue {
    public Integer getValue(HashMap<String, Integer> hashMap, String key) {
        // TODO:

        //HASHmap
        //앞에는 key 뒤는 vlaue
        //엔트리
        //key 는 겹칠 수 없음 vlaue 값 겹칠 수 있음
        //나중에 예외로 값 없을 경우도 만들어보기

        //hashMap get 은 값 가져오는 것 key 값 가져오는 것
        Integer result = hashMap.get(key);
        return result;
    }
}
