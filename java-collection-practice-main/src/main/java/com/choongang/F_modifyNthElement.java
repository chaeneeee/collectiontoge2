package com.choongang;

import java.util.ArrayList;

public class F_modifyNthElement {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        // TODO:
        //입력받은 위치에 있는 index 를 받은 String 으로 바꾸기
        //수정할 때
        //set 을 통해 수정
        //셋은 인덱스와 엘리먼트 받는다
        //엘리먼트는
        arrayList.set(index,str);
//        set 은  oldValue 예전 값을 return 한다.
        return arrayList;
        //메서드나 코드 안에 ctrl 로 들어가서 보는 거 추천

    }
}
