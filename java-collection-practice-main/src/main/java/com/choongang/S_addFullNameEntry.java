package com.choongang;

import java.util.HashMap;

public class S_addFullNameEntry {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        // TODO:
        //get. key 하면 키 값 가져올 수 있는 것이고
        //get . value 하면 벨류 값 가져올 수 있는 것 .

        hashMap.put("fullName", hashMap.get("firatName")+hashMap.get("lastName"));
        //키                  //벨류       +        //벨류
            return hashMap;

    }

}
