package com.wshoto.domainweb.controller;

import com.wshoto.domainstarter.util.DomainProperties;
import com.wshoto.domainstarter.util.TestProperties;
import com.wshoto.domainweb.constant.QwApiPathConst;
import com.wshoto.domainweb.properties.UrlProperties;
import com.wshoto.domainweb.service.IUserService;
import com.wshoto.domainweixin.service.WxService;
import com.wshoto.javahost.core.JavaHost;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
public class ApiController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${domain.qyweixin}")
    private String name;

    @Value("${domain.qyweixin2:${spring.application.name}123456}")
    private String name2;

    @Autowired
    private TestProperties testProperties;

    @Resource
    private UrlProperties urlProperties;

    @Resource
    private WxService wxService;

    @Resource
    private IUserService userService;

    @Resource
    private DomainProperties domainProperties;

    @RequestMapping("/test")
    public String test(){
        System.out.println("domain qiweixin="+ DomainProperties.qyweixin);
        System.out.println("uri.gettoken="+urlProperties.getGetToken());
        System.out.println("name2="+name2);
        System.out.println("GET_PRE_AUTH_CODE="+ QwApiPathConst.GET_PRE_AUTH_CODE);
        System.out.println("static="+QwApiPathConst.GET_PRE_AUTH_CODE);
        return "a="+DomainProperties.qqmap+"|"+applicationName+"|"+name+"|"+testProperties.getQyweixin();
    }

    @RequestMapping("/test2")
    public String test2(){
        System.out.println("domain qiweixin="+ wxService.getUrl());
        return "a="+wxService.getUrl();
    }

    @RequestMapping("/test3")
    public String test3(){
        userService.test();
        return "a="+wxService.getUrl();
    }

    @RequestMapping("/test4")
    public String test4(){
        domainProperties.toString();
        return "a="+wxService.getUrl();
    }

    @RequestMapping("/test5")
    public void test5(){
        String url = "http://www.lenovomm.com/test6";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
            JavaHost.printAllVirtualDns();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/test6")
    public String test6(){
        return "0423111223aabbc";
    }
}
