package com.choongang;

import java.util.HashMap;

public class T_isContain {
    public boolean isContain(HashMap<String, Integer> hashMap, String key) {
        // TODO:
        //key 가 있는 지 확인할 수있는 게
        //containskey

        return hashMap.containsKey(key);

        //containskey 알고 있는 지 체크
        // 은근 쓰이니까 꼭 알고 있기

        //put 은 무조건 덮어쓰기 때문에
        // 내가 넣으려는 값이 있는 지 없는 지 확인하고서 넣고싶을 때
        //키가 존재하지 않을 때만 넣기 위해
        //이 메서드가 필요하다 있는데 다시 넣기 싫으니까
        //아니면 get 으로 null 인지 확인하고 넣기


    }
}
