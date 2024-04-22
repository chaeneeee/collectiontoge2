package com.choongang;

import java.util.HashMap;

public class P_clearHashMap {
    public void clearHashMap(HashMap<Integer, Boolean> hashMap) {
        // TODO:
        //void 따로 리턴하지 않기
        //클리어 메서드 써서도 되고



        //hashmap 순회 할때
        //set 으로 바꿔준다음 돌아야한다.
        for(Integer key : hashMap.keySet()){
            hashMap.remove(key);

            //이건 for문으로 돌면서 지우는 것/.
//        비어있을 때 문제가 생김
            if (hashMap.size() == 0) {
                //어차피 아무것도 안하니
            }
            }
        }

    }
}
