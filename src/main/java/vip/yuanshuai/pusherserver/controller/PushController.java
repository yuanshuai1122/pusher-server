package vip.yuanshuai.pusherserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vip.yuanshuai.pusherserver.util.Pusher;


/**
 * @author:yuanshuai
 * @create: 2023-02-03 12:48
 * @Description: 推送控制器
 */
@RestController
public class PushController {

    //要推送的用户openid
    private static String mxp = "oUClg5xF7jg5tPw4SE219xmdzzxs";

    private static String zyd = "odbd-6U6ygdSTCwldsJ6qs0kxXeA";


    /**
     * 微信测试账号推送
     *
     */
    @GetMapping("/push")
    public void push() {
        Pusher.push(mxp);
    }

    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/zyd")
    public void pushZyd() {
        Pusher.push(zyd);
    }


    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/{id}")
    public void pushId(@PathVariable("id") String id) {
        Pusher.push(id);
    }
}