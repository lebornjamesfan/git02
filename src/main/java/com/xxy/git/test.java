package com.xxy.git;


import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test {
    public static void main(String[] args) throws InterruptedException{
        LocalDate start = LocalDate.of(2021, 10, 01);
        LocalDate end = LocalDate.of(2021, 10, 07);
        LocalDate now = LocalDate.now();
        if(now.compareTo(start)>=0&&now.compareTo(end)<=0){
            Thread life=new Thread(()->{
                List<String> items= Arrays.asList("看长津湖，感受革命先烈的峥嵘岁月","看NBA，看老詹乘风破浪","看国足，让你血脉喷张","玩王者","打篮球","追剧");
                Random random=new Random();
                System.out.println(items.get(random.nextInt(items.size())));
            },"life");
            Thread work=new Thread(()->{
                System.out.println("值班，保证线上服务质量");
            },"work");
            life.start();
            life.join();
            work.start();
            work.join();
        }else{
            System.out.println("努力搬砖");
        }
    }
}
