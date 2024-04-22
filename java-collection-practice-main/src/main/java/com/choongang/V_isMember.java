package com.choongang;

import java.util.HashMap;

public class V_isMember {
    public boolean isMember(HashMap<String, String> member, String username, String password) {
        // TODO:
//키가 존재하는지
        //키가 맞고 벨류가 맞는지
        if (member.containsKey(username)){
            String value = member.get(username);
            if (value.equals(password) ){
               //문자열은 value ==password 로
                //주소값 비교지
                //주소값 비교했을 때 결과가 나오니 디버깅하기
                //힘들 수 있다.
                //무적권 equlas 쓰기
                return true;
            }
        }
        return false;

    }
}
