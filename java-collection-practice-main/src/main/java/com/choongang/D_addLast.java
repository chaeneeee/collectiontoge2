package com.choongang;

import java.util.ArrayList;

public class D_addLast {
    public ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        // TODO:
        //받는 게 2개
        //입력받은거 마지막 추가
        //매개변수 설정
        //원하는 위치에 값 추가
        //추가한 리스트 반환 가능한지
        arrayList.add(str);
        //boolean 타입이라 지금 true 로 바뀜
        //반환하지 않으면 값 true 바꾸고 버리는 것
        return arrayList;

        //참고
//        return arrayList.add(str);
        //이게 안 되는 이유 arraylist 는 class 구상체
        //add는 메서드
        // 메서드가 실행되면 메서드의 반환타입으로 바뀜
        //리스트의 요소 추가
        //메서드의 반환도
        // 두 가지를 같이하고 있는 것
        //근데 반환인 return 도 하고 있다.
        //.add 는 boolean 타입이다
        //그래서 return 을 통해 한번에 추가 및 반환 하고 싶지만
        //반환타입 은 꼭 알아야한다
        //. 으로 들어오는 건 메서드아니면 변수 or 간혹 inner class


                //index 요소 받을수도
        //추가 요소만을 받을 수도  index 요소 넣지않으면
        //arr 추가는 항상 마지막에 추가된다
    }
}
