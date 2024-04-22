package com.choongang;
import java.util.*;

public class B_getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        // TODO:
        if (arrayList.size() == 0 ){
            return  null;
        } else if (index < 0 || index >= arrayList.size()) {
            return null;}  //들어오는 index 기본 조건 생각해서
        //index는 음수는 못들어오고 arr.size 보다 크면 빈 공간이 생겨서 못 쓴다
        return arrayList.get(index);  //get 으로 index 값 가져오는 것


    }
}
