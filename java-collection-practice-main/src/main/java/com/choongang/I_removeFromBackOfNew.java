package com.choongang;

import java.util.ArrayList;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        // TODO:

        //마지막요소를 지우고
        //1. 반복문 arrList.size() -1 번 만큼 돌면서 반복문
        // 새로운 List에 값을 저장하고 반환

        ArrayList<Integer> newArrayList = new ArrayList<>();
//        for (Integer integer : arrayList){
//            //foreach 문은 index 는 못하는데
//            //지금은 인덱스가  필요하므로 쓰지 않는다.

        //-1 해야하는 이ㄴ유는 끝까지 도는 것이 아니라
        //마지막은 안돌고 마지막을 제외해야하니까
        for (int i=0; i< arrayList.size()-1; i++){
            Integer currentEl = arrayList.get(i);
            newArrayList.add(currentEl);
        }


        //이렇게 해서 ( ) 가로안에 arrayList를 넣으면 그대로 복사된다
        //첫번째줄이 복사한 array 새롭게 만드는 것이고
        // 그 값을 remove 한 값을 으로 넣는 것
        ArrayList<Integer> newArrayList = new ArrayList<>(arrayList);
        newArrayList.remove(newArrayList.size()-1);
        return newArrayList;

        //2. arrayList 복사한 후 해당 새로운 LIST의 마지막
        //요소 제거하고 반환
    }
}
