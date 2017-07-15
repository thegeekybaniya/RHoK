package com.siddhantchadha.rhok_method;

import com.siddhantchadha.rhok_method.data.RetrofitClient;
import com.siddhantchadha.rhok_method.data.SOService;

public class APIUtils {
    public static final String BASE_URL = "http://41b3265a.ngrok.io/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
