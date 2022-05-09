package com.wshoto.domainweb;

import com.wshoto.javahost.core.JavaHost;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Test1 {

    public static void main(String[] args) {
        JavaHost.updateVirtualDns("baidu.com","1.15.174.78");
        JavaHost.printAllVirtualDns();
        String url = "http://www.baidu.com";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
