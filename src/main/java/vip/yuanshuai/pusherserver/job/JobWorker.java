package vip.yuanshuai.pusherserver.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import vip.yuanshuai.pusherserver.util.Pusher;

/**
 * @author:yuanshuai
 * @create: 2023-02-03 12:48
 * @Description: 推送任务
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId = "odbd-6b1RhzrGEPCRT4rmmLKwpas";

    @Scheduled(cron = "0 30 7 * * ?")
    public void goodMorning(){
        Pusher.push(openId);
    }

}
