package com.choongang;

import java.util.ArrayList;

public class H_removeFromNth {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        // TODO:
        //요소 삭제 후
        if (index <0 || index>= arrayList.size()){
                 return null; }
        String str = arrayList.remove(index);
        return  str;

//        return arrayList.remove(index);
       // 이렇게 줄일 수 있음

    }
}
