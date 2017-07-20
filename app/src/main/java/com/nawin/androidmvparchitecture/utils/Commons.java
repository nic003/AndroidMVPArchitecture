package com.nawin.androidmvparchitecture.utils;

import java.util.List;

import retrofit2.Call;

/**
 * Created by brainovation on 6/13/17.
 */

public class Commons {

    public static void cancel(Call... calls) {
        if (calls != null && calls.length > 0) {
            for (Call call : calls) {
                if (call != null)
                    call.cancel();
            }
        }
    }

    public static boolean isEmpty(List list) {
        return list == null || list.isEmpty();
    }

}
