package com.choongang;

import java.util.*;

public class U_getElementOfListEntry {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        // TODO:
        //hashmap에 리스트가 들어온것, 객체 등등 들어올 수 있다
        //1. key 가 있는지
        //2. value 가 이번에 리스트이다
        // 3. 인덱스 아니 그 값을 가져올 수 있는지 get 쓴다.
        if (hashMap.containsKey(key)){
            List<String> list = hashMap.get(key);
            if (index >= 0 && index < list.size()){
                return list.get(index);
            }
            }
            return null;
    }



    }
}
