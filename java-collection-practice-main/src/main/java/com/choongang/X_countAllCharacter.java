package com.choongang;

import java.util.HashMap;

public class X_countAllCharacter {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        // TODO:

        if (str.length() ==0 ){
            if (str.isEmpty() ){
                if (str.equals("") ){
            }
            return null;
        }
        // 반복문 2번 돌아서 구할 수 도 있다 but 효율이 너무 안 좋다
        //
        char[] arr= str.toCharArray();

        //1. 주어진 문자열 str 을 캐릭터 배열로 변경
        HashMap<Character , Integer> result = new HashMap<>();
        for (char c : arr){
            if (result.containsKey(c)){
                Integer currentValue = result.get(c);
                result.put(c, currentValue +1);
            }else {
                result.put(c,1); //초기값 세팅
            }
        }
        //2. 결과를 담을 map 선언 .
        // 3.캐릭터 배열을 순회
        // 3-1 각 배열의 요소인 char 가 키로 이미 존재하는 지 확인
        //2-1-1 존재하지 않는다면 해당 키에 값을 1로 넣어서 map에 추가 put
        //2-1-2 존재한다면 해당 키의 기존의 값 +1 인 값으로 덮어 씌우기 put
        //4. 순회가 끝나면 해당 map 반환
        return result;
        }
}
