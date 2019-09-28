package cn.moexc.tcc.out.util;

import java.util.HashMap;

public class Result extends HashMap {
    public Result(int code, String message, Object data){
        put("code", code);
        put("message", message);
        put("data", data);
    }
}
